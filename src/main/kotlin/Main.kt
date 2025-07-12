package ru.netology

import ru.netology.data.Comments
import ru.netology.data.Likes
import ru.netology.data.Post
import ru.netology.data.WallService

fun main () {
    val post = Post (5,10,6,11,  "Hello to everyone!",
        comments = Comments(50, true,true, false, true),
        likes = Likes(193, true,true,true))
    val changePost1 = post.copy(text = "Better than ever!", createdBy = 12, canPin = true)
    val changePost2 = post.copy(id = 2, text = "BETTER THAN EVER!")
    val wall = WallService
    println(wall.add(post))
    println(wall.add(changePost1))
    println(wall.update(changePost2))
    println(changePost2)
}