package robot

import org.junit.Assert
import org.junit.Test
import robot.commands.CommandFactory
import robot.commands.NullCommand
import robot.commands.PlaceCommand

class CommandFactoryTest {
    @Test
    fun testFactorySuccess() {
        Assert.assertTrue(PlaceCommand(Direction.WEST, 1, 1).equals(CommandFactory(arrayOf("place", "WEST", "1", "1"))))
    }

    @Test
    fun testFactoryNoCommand() {
        Assert.assertTrue(CommandFactory(arrayOf("YOLO")) is NullCommand)
    }

    @Test
    fun testFactoryWrongNumberOfArgs() {
        Assert.assertTrue(CommandFactory(arrayOf("Place")) is NullCommand)
    }

    @Test
    fun testFactoryInvalidArg() {
        Assert.assertTrue(CommandFactory(arrayOf("Place", "SOUTHWEST", "1", "1")) is NullCommand)
    }
}