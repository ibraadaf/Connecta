package com.id.connecta.ui.screen.main;

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.id.connecta.ui.route.home.HomeRoute
import com.id.connecta.ui.screen.main.home.HomeScreen
import com.id.connecta.ui.screen.main.message.MessageScreen
import com.id.connecta.ui.screen.main.notification.NotificationScreen
import com.id.connecta.ui.screen.main.save.SavedScreen
import com.id.connecta.ui.theme.ConnectaTheme
import kotlinx.coroutines.launch


@Composable
fun HomeContainer(
    modifier: Modifier = Modifier,
    mainNavController: NavController
) {
    val bottomController = rememberNavController()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(drawerContent = {
        ModalDrawerSheet {
            NavigationContent(mainNavController = mainNavController)
        }
    }) {
        Scaffold(
            bottomBar = {
                BottomAppBar {
                    val navBackStackEntry by bottomController.currentBackStackEntryAsState()
                    val currentDestination = navBackStackEntry?.destination
                    HomeRoute.listRoute.forEach { screen ->
                        NavigationBarItem(
                            selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                            onClick = {
                                bottomController.navigate(screen.route) {
                                    popUpTo(bottomController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }, icon = {
                                Icon(painter = painterResource(id = screen.resourceId), contentDescription = null, modifier = Modifier.size(21.dp))
                            })
                    }
                }
            }
        ) { innerPadding ->
            NavHost(bottomController, startDestination = HomeRoute.HomeScreen.route, Modifier
                .padding(innerPadding)
                .padding(horizontal = 16.dp)
            ) {
                composable(HomeRoute.HomeScreen.route) {
                    HomeScreen(
                        mainNavController = mainNavController,
                        onProfileClicked = {
                        scope.launch {
                            drawerState.apply {
                                if (isClosed) open() else close()
                            }
                        }
                    })
                }
                composable(HomeRoute.MessageScreen.route) {
                    MessageScreen(mainNavController = mainNavController)
                }
                composable(HomeRoute.SavedScreen.route) {
                    SavedScreen()
                }
                composable(HomeRoute.NotificationScreen.route) {
                    NotificationScreen()
                }
            }
        }
    }
}

@Composable
@Preview
fun ShowHomeContainerPreview() {
    ConnectaTheme {
        HomeContainer(mainNavController = rememberNavController())
    }
}
