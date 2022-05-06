package com.example.stockmarketapp.presentation.company_listings

sealed class CompanyListingEvents {
    object Refresh: CompanyListingEvents()
    data class OnSearchQueryChange(val query: String): CompanyListingEvents()
}
