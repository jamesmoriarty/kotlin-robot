package test.commands

import org.junit.Assert
import org.junit.Test
import robot.Direction
import robot.Robot
import robot.commands.MoveCommand

class MoveCommandTest {
    @Test
    fun execNull() {
        Assert.assertEquals(MoveCommand("Move").exec(null), null)
    }

    @Test
    fun execFail() {
        var robot = Robot(Direction.NORTH, 1, 4)
        Assert.assertEquals(MoveCommand("Move").exec(robot), Robot(Direction.NORTH, 1, 4))
    }

    @Test
    fun execSuccess() {
        var robot = Robot(Direction.NORTH, 1, 1)
        Assert.assertEquals(MoveCommand("Move").exec(robot), Robot(Direction.NORTH, 1, 2))
    }
}
