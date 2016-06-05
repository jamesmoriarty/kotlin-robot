package test.robot.commands

import org.junit.Assert
import org.junit.Test
import robot.Direction
import robot.Robot
import robot.commands.RightCommand

class RightCommandTest {
    @Test
    fun execFail() {
        Assert.assertEquals(RightCommand("Left").exec(null), null)
    }

    @Test
    fun execSuccess() {
        var robot = Robot(Direction.NORTH, 1, 1)
        Assert.assertEquals(RightCommand("Left").exec(robot), Robot(Direction.EAST, 1, 1))
    }
}
