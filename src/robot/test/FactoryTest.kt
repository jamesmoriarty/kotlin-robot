package robot.test

import org.junit.Assert
import org.junit.Test
import robot.commands.Factory
import robot.commands.NullCommand
import robot.commands.PlaceCommand

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
    fun testFactoryNoCommand() {
        Assert.assertTrue(Factory(arrayOf("YOLO")) is NullCommand)
    }

    @Test
    fun testFactoryWrongNumberOfArgs() {
        Assert.assertTrue(Factory(arrayOf("Place")) is NullCommand)
    }

    @Test
    fun testFactoryInvalidArg() {
        Assert.assertTrue(Factory(arrayOf("Place", "SOUTHWEST", "1", "1")) is NullCommand)
    }
}