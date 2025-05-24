package com.example.miniandroidproject

object BankData {

    val bank1 = BankBranch(
        id = 1,
        imageUi = R.drawable.bank1,
        name = "National City Bank 1",
        type = BankType.branch,
        phone = "+1 555 123 4567",
        hours = "Mon-Fri: 9AM–5PM\nSat: 10AM–2PM",
        address = "Hawally, hwally",
        location ="https://maps.app.goo.gl/RYL7LpWbAXmmUJcbA?g_st=ic"
    )

    val bank2 = BankBranch(
        id = 2,
        imageUi = R.drawable.bank2,
        name = "National City Bank 2",
        type = BankType.head_Office,
        phone = "+1 555 123 4567",
        hours = "Mon-Fri: 9AM–5PM\nSat: 10AM–2PM",
        address = "Kuwait City, Kuwait",
        location = "https://maps.app.goo.gl/RYL7LpWbAXmmUJcbA?g_st=ic"
    )

    val bank3 = BankBranch(
        id = 3,
        imageUi = R.drawable.bank3,
        name = "National City Bank 3 ",
        type = BankType.ATM,
        phone = "+1 555 123 4567",
        hours = "Mon-Fri: 9AM–5PM\nSat: 10AM–2PM",
        address = "Kuwait , Abdullah al-Salem",
        location = "https://maps.app.goo.gl/RYL7LpWbAXmmUJcbA?g_st=ic"
    )

    val bankList = listOf(
        bank1 , bank2 , bank3
    )
}