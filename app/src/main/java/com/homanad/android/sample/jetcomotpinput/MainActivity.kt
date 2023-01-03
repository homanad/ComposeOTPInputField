package com.homanad.android.sample.jetcomotpinput

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.homanad.android.sample.jetcomotpinput.ui.component.OTPInputField
import com.homanad.android.sample.jetcomotpinput.ui.theme.JetComOTPInputTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetComOTPInputTheme {
                OTPInputField()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetComOTPInputTheme {
        OTPInputField()
    }
}