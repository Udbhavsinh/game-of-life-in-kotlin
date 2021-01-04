package Amey_kathiwadi


fun String.toMaze() = loadMaze(this)

fun loadMaze(s: String): Maze7 {
  val rows = s.split("\n").map { it.trim() }.filter { it.isNotBlank() }

  val height = rows.size
  val width = rows.map { it.length }.maxOrNull() ?: 0

  return Maze7(width, height).apply {
    rows.forEachIndexed { y, row ->
      row.forEachIndexed { x, ch ->
        if (ch != '.') {
          this[x, y] = CellState.ALIVE
        }
      }
    }
  }
}

