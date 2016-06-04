package test.commands

import org.junit.Assert
import org.junit.Test
import robot.Direction
import robot.Robot
import robot.commands.LeftCommand

class LeftCommandTest {
    @Test
    fun execFail() {
        Assert.assertEquals(LeftCommand("Left").exec(null), null)
    }

    @Test
    fun execSuccess() {
        var robot = Robot(Direction.NORTH, 1, 1)
        Assert.assertEquals(LeftCommand("Left").exec(robot), Robot(Direction.WEST, 1, 1))
    }
}
