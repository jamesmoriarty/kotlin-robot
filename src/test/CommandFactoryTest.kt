package test

import org.junit.Assert
import org.junit.Test
import robot.commands.Command
import robot.commands.NullCommand
import robot.commands.PlaceCommand

class CommandFactoryTest {
    @Test
    fun testFactorySuccess() {
        val args = arrayOf("place", "WEST", "1", "1")

        Assert.assertTrue(PlaceCommand(*args).equals(Command.factory(args) as PlaceCommand))
    }

    @Test
    fun testFactoryNoCommand() {
        Assert.assertTrue(Command.factory(arrayOf("YOLO")) is NullCommand)
    }

    @Test
    fun testFactoryWrongNumberOfArgs() {
        Assert.assertTrue(Command.factory(arrayOf("Place")) is NullCommand)
    }

    @Test
    fun testFactoryInvalidArg() {
        Assert.assertTrue(Command.factory(arrayOf("Place", "SOUTHWEST", "1", "1")) is NullCommand)
    }
}