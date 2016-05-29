package robot

import org.junit.Assert
import org.junit.Test
import robot.commands.LeftCommand

class LeftCommandTest {
    @Test
    fun testExecFail() {
        Assert.assertEquals(LeftCommand("Left").exec(null), null)
    }

    @Test
    fun testExecSuccess() {
        var robot = Robot(Direction.NORTH, 1, 1)
        Assert.assertEquals(LeftCommand("Left").exec(robot), Robot(Direction.WEST, 1, 1))
    }
}