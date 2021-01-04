package Amey_kathiwadi


private val emptyCell = listOf("&")
private val aliveCells = listOf("*", "?", "+", "#", "@")

fun Maze7.renderToString() = buildString {
  for (y in 0 until height) {
    for (x in 0 until width) {
      append(
        when (get(x, y)) {
          CellState.ALIVE -> aliveCells
          CellState.DEAD -> emptyCell
        }.random()
      )
    }
    append("\n")
  }
}

