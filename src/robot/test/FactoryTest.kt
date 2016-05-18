package robot.test

import org.junit.Assert
import org.junit.Test
import robot.Factory
import robot.commands.*

class FactoryTest {
    @Test
    fun testFactorySuccess() {
        val args = arrayOf("place", "WEST", "1", "1")
        val a    = PlaceCommand(*args)
        val b    = Factory(args) as PlaceCommand

        Assert.assertTrue(a.x.equals(b.x))
        Assert.assertTrue(a.y.equals(b.y))
        Assert.assertTrue(a.direction.equals(b.direction))
    }

    @Test
    fun testFactoryFail() {
        Assert.assertTrue(Factory(arrayOf("")) is NullCommand)
    }
}