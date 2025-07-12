package ru.netology.data

data class Post(
    val id: Int,                       // Идентификатор записи
    val ownerId: Int,                  // Идентификатор владельца стены
    val fromId: Int,                   // Идентификатор автора записи
    val createdBy: Int,                // Идентификатор администратора
    val text: String,                  // Текст записи
    val comments: Comments,            // Информация о комментариях к записи
    val likes: Likes,                  // Информация о лайках к записи
    val replyOwnerId: Int = 0,         // Идентификатор владельца записи, в ответ на которую была оставлена текущая
    val replyPostId: Int = 0,          // Идентификатор записи, в ответ на которую была оставлена текущая
    val friendsOnly: Boolean = false,  // Опция «Только для друзей»
    val canPin: Boolean = false,       // Закрепить запись
    val canDelete: Boolean = false,    // Удалить запись
    val canEdit: Boolean = false       // Редактировать запись
)