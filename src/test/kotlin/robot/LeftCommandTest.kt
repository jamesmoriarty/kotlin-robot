package robot

import org.junit.Assert
import org.junit.Test
import robot.commands.LeftCommand

class LeftCommandTest {
    @Test
    fun testExecFail() {
        Assert.assertEquals(LeftCommand().exec(null), null)
    }

    @Test
    fun testExecSuccess() {
        val robot = Robot(Direction.NORTH, 1, 1)
        Assert.assertEquals(LeftCommand().exec(robot), Robot(Direction.WEST, 1, 1))
    }
}