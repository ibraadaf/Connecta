package com.id.connecta.ui.screen.onboarding

import androidx.annotation.DrawableRes
import com.id.connecta.R

sealed class OnboardItems (val title: String, val description: String, @DrawableRes val imageRes: Int) {
    data object FirstPage: OnboardItems("Find your career path", "Find a career that suits your passion or hobby", R.drawable.first_img)
    data object SecondPage: OnboardItems("Meet the counselor", "Choose a counselor according to your choices and desires", R.drawable.second_img)
    data object ThirdPage: OnboardItems("Make your career", "We help bring happiness to your future", R.drawable.third_img)

    companion object {
        val listPage = listOf(
            FirstPage, SecondPage, ThirdPage
        )
    }
}