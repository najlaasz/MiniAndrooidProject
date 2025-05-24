package com.example.miniandroidproject

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp



    @Composable
    fun BankCard(modifier: Modifier , bank: BankBranch, onClick: (String ) -> Unit = {}){
        Card (modifier = modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clickable { onClick(bank.name) }
        ){
            Column (modifier = modifier.padding(16.dp)){

                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Column {
                        Text(text = bank.name, style = MaterialTheme.typography.titleMedium)
                        Text(text = bank.type.toString())
                    }
                    Image(
                        bitmap = ImageBitmap.imageResource(bank.imageUi),
                        contentDescription = null,
                        modifier = Modifier
                            .size(64.dp)
                            .clip(CircleShape)
                    )
//                    Icon(
//                        painter = painterResource(id = bank.imageUi),
//                        contentDescription = "Phone",
//                        modifier = Modifier.size(66.dp)
//                    )

                }

                Spacer(modifier = Modifier.height(8.dp))
                Row (modifier = modifier.fillMaxWidth()){
                    Text(text = bank.name)
                    Text(text =  bank.type.toString())
                }
                InfoRow(label = "Phone", value = bank.phone)
                InfoRow(label = "Hours", value = bank.hours)
                InfoRow(label = "Address", value = bank.address)
//                InfoRow(label = "Location", value = bank.location)

            }
        }
    }



    @Composable
    internal fun InfoRow(label: String, value: String) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "$label: ",
                style = MaterialTheme.typography.labelMedium
            )
            Text(
                text = value,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }


@Composable
fun BranchList(modifier: Modifier, branchList: List<BankBranch>, onCardClicked: (String) -> Unit)
{
    LazyColumn {
        items (branchList){
                mybranch -> BankCard(modifier,mybranch, onClick = onCardClicked)
        }
    }
}
