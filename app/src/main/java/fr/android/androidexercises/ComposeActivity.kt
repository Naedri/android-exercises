package fr.android.androidexercises

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import fr.android.androidexercises.ui.theme.AndroidexercisesTheme

class ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidexercisesTheme {

                ConstraintLayout(modifier = Modifier.fillMaxSize()) {
                    val (button) = createRefs()

                    Button(onClick = { }, modifier = Modifier.constrainAs(button)
                    {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }) {
                        Greeting("World")
                    }
                }


            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidexercisesTheme {
        Greeting("Android")
    }
}