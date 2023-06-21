package dhruvi.patel.composearticlesampleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dhruvi.patel.composearticlesampleapp.ui.theme.ComposeArticleSampleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleSampleAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SetupPage("Android")
                }
            }
        }
    }
}

@Composable
fun SetupPage(name: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Top,
    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Background Image"
        )
        Text(
            text = stringResource(R.string.page_title_text),
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.page_description_text),
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(text = stringResource(R.string.page_description2_text),
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )

    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    ComposeArticleSampleAppTheme {
        SetupPage("Android")
    }
}