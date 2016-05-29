package robot

import org.junit.Assert
import org.junit.Test
import robot.commands.RightCommand

class RightCommandTest {
    @Test
    fun testExecFail() {
        Assert.assertEquals(RightCommand().exec(null), null)
    }

    // Here was "RightCommand("Left")" what doesn't do nothing.
    // Now it's will be compile-time error.
    // This is example of advantages using current architecture
    @Test
    fun testExecSuccess() {
        val robot = Robot(Direction.NORTH, 1, 1)
        Assert.assertEquals(RightCommand().exec(robot), Robot(Direction.EAST, 1, 1))
    }
}