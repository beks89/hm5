package ru.netology.data

data class Likes(
    val count: Int,                    // число пользователей, которым понравилась запись
    val userLikes: Boolean = true,     // наличие отметки «Мне нравится» от текущего пользователя
    val canLike: Boolean = true,       // может ли текущий пользователь поставить отметку «Мне нравится»
    val canPublish: Boolean = true     // может ли текущий пользователь сделать репост записи
)