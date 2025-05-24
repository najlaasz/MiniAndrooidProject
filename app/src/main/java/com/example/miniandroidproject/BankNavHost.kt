package com.example.miniandroidproject


import android.R.attr.name
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun BankNavHost(
    modifier: Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "home"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable("home") {

            var bankListState by remember { mutableStateOf(BankData.bankList) }
            BranchList(modifier = modifier,
                        bankListState,
                onCardClicked = {name ->
                    println("clicked on: $name")
                    navController.navigate("details/$name")})


        }
        composable("details/{name}") {

            backStackEntry ->
            val bankName = backStackEntry.arguments?.getString("name")
            println("value is $bankName")
           var branch = BankData.bankList.find { it.name == bankName }

            if (branch != null)
            {
                BranchDetail(modifier = modifier,
                    branch)
            }

        }
    }
}