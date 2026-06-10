package com.roadsosx.feature.contacts.navigation

import androidx.navigation.NavController

const val CONTACTS_ROUTE = "contacts"

fun NavController.navigateToContacts() {
    navigate(CONTACTS_ROUTE)
}
