package com.id.connecta.ui.screen.counselor_detail;

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography


@Composable
fun CDDescContent(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(text = "Saya adalah seorang IT Counselor berpengalaman yang siap membantu Anda meraih kesuksesan dalam karir di bidang teknologi. Dengan pengalaman lebih dari 10 tahun di industri IT, saya memiliki pengetahuan mendalam dan keterampilan yang luas di berbagai bidang, termasuk sebagai IT Consultant dan Software Engineer.\n" +
                "\n" +
                "Saya dikenal karena pendekatan yang ramah dan profesional dalam sesi konseling. Saya mendengarkan dengan seksama kebutuhan dan aspirasi klien, dan memberikan panduan yang disesuaikan dengan situasi individu masing-masing. Dengan pendekatan yang kolaboratif dan suportif, saya berkomitmen untuk membantu Anda mencapai tujuan karir Anda di dunia IT.\n" +
                "\n", style = Typography.titleSmall.copy(fontSize = 12.sp, fontWeight = FontWeight.Normal, color = Color.Black))
    }
}

@Composable
@Preview
fun ShowCDDescContentPreview() {
    ConnectaTheme {
        CDDescContent()
    }
}
