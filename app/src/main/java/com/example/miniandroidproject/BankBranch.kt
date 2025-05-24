package com.example.miniandroidproject
//import kotlinx.parcelize.Parcelize

//@Parcelize
data class BankBranch(
    val id: Int,
    val name: String,
    val type: BankType ,
    val address: String,
    val phone: String,
    val hours: String,
    val location: String,
    val imageUi: Int
)

enum class BankType{
    head_Office,
    branch,
    ATM
}