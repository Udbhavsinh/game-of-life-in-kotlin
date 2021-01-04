package Amey_kathiwadi

enum class CellState {
  DEAD,
  ALIVE
}

interface EvolutionCell {
  val neighbours: Int
  val state: CellState
}

interface MazeWorld {
  fun nextGeneration(evolutionRule: EvolutionCell.() -> CellState): MazeWorld
}

