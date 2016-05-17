package robot

import java.util.*

enum class Direction {
    NORTH, EAST, SOUTH, WEST
}

fun rotatedDirection(direction: Direction, step: Int): Direction {
    direction?.let({
        var index   = Direction.values().indexOf(it)
        var compass = Direction.values().asList()

        Collections.rotate(compass, step)

        return compass.get(index)
    })
}
