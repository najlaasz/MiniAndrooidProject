package com.example.miniandroidproject

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.core.content.ContextCompat.startActivity
import android.content.Intent
import android.net.Uri
import android.util.Log

@Composable
fun BranchDetail(modifier: Modifier, bank: BankBranch){
    Column (modifier = modifier.padding(10.dp)){


        Spacer(modifier = modifier.height(10.dp).width(5.dp))

        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {

            Column {
                Text(text = bank.name, style = MaterialTheme.typography.titleMedium)
                Text(text = bank.type.toString())
            }
            Image(
                bitmap = ImageBitmap.imageResource(bank.imageUi),
                contentDescription = null,
                modifier = modifier.size(150.dp)
            )
        }

//        Spacer(modifier = modifier.height(8.dp))
        Row (modifier = modifier.fillMaxWidth()){
            Text(text = bank.name)
            Text(text =  bank.type.toString())
        }
        InfoRow(label = "Phone", value = bank.phone)
        InfoRow(label = "Hours", value = bank.hours)
        InfoRow(label = "Address", value = bank.address)
//        InfoRow(label = "Location", value = bank.location)
        OpenWebsiteButton(modifier, bank.location, "Find me ")

    }
}


@Composable
fun OpenWebsiteButton(modifier: Modifier,url: String, name: String) {
    val uriHandler = LocalUriHandler.current
    val context = LocalContext.current

    Button(
        modifier = modifier.fillMaxWidth(),
        onClick = {

            Log.i("URL", url)
            uriHandler.openUri(url)
        }
    ) {
        Text(text = name)
    }
}