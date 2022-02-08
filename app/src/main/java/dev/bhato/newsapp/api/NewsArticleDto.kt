package dev.bhato.newsapp.api

data class NewsArticleDto(
    val title: String?,
    val url: String,
    val urlToImage: String?
)