import junit.framework.TestCase.*
import org.junit.Before
import org.junit.Test
import ru.netology.data.Comments
import ru.netology.data.Likes
import ru.netology.data.Post
import ru.netology.data.WallService


class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun addTest() {
        val wall = WallService
        val post = Post(
            7, 15, 11, 18, "Check",
            comments = Comments(7),
            likes = Likes(50)
        )
        val firstId = wall.add(post).id
        assertEquals(1, firstId)
    }

    @Test
    fun  updateTest() {
        val wall = WallService
        val post1 = Post(
            7, 15, 11, 18, "Check",
            comments = Comments(7),
            likes = Likes(50)
        )
        val post2 = Post(
            7, 15, 11, 18, "CHECK",
            comments = Comments(7),
            likes = Likes(50)
        )
        wall.add(post1)
        assertTrue(wall.update(post2.copy(1)))
    }

    @Test
    fun updateTestFalse() {
        val wall = WallService
        val post1 = Post(
            7, 15, 11, 18, "Check",
            comments = Comments(7),
            likes = Likes(50)
        )
        val post2 = Post(
            7, 15, 11, 18, "CHECK",
            comments = Comments(7),
            likes = Likes(50)
        )
        wall.add(post1)
        assertFalse(wall.update(post2.copy(5)))
    }
}