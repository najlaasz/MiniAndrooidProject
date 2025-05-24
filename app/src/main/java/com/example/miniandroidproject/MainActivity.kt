package com.example.miniandroidproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.miniandroidproject.ui.theme.MiniAndroidProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiniAndroidProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    BankNavHost(
                        modifier = Modifier.padding(innerPadding) )
//                    BranchDetail(modifier = Modifier.padding(innerPadding),
//                        BankData.bank1)

//                    BranchList(modifier = Modifier.padding(innerPadding),
//                        BankData.bankList)
                }
            }
        }
    }


}




@Preview(showBackground = true)
@Composable
fun BankInfoCardPreview() {
    MiniAndroidProjectTheme {
//        BankCard(bank = BankData.bank2)
    }
}
