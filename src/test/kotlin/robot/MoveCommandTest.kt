package robot

import org.junit.Assert
import org.junit.Test
import robot.commands.MoveCommand

class MoveCommandTest {
    @Test
    fun testExecNull() {
        Assert.assertEquals(MoveCommand().exec(null), null)
    }

    @Test
    fun testExecFail() {
        val robot = Robot(Direction.NORTH, 1, 4)
        Assert.assertEquals(MoveCommand().exec(robot), Robot(Direction.NORTH, 1, 4))
    }

    @Test
    fun testExecSuccess() {
        val robot = Robot(Direction.NORTH, 1, 1)
        Assert.assertEquals(MoveCommand().exec(robot), Robot(Direction.NORTH, 1, 2))
    }
}