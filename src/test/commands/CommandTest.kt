package test.commands

import org.junit.Assert
import org.junit.Test
import robot.commands.Command
import robot.commands.NullCommand
import robot.commands.PlaceCommand

class CommandTest {
    @Test
    fun factorySuccess() {
        val args = arrayOf("place", "WEST", "1", "1")

        Assert.assertTrue(PlaceCommand(*args).equals(Command.factory(args) as PlaceCommand))
    }

    @Test
    fun factoryNoCommand() {
        Assert.assertTrue(Command.factory(arrayOf("YOLO")) is NullCommand)
    }

    @Test
    fun factoryWrongNumberOfArgs() {
        Assert.assertTrue(Command.factory(arrayOf("Place")) is NullCommand)
    }

    @Test
    fun factoryInvalidArg() {
        Assert.assertTrue(Command.factory(arrayOf("Place", "SOUTHWEST", "1", "1")) is NullCommand)
    }
}
