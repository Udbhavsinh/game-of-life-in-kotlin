package Amey_kathiwadi

import Amey_kathiwadi.CellState.ALIVE
import Amey_kathiwadi.CellState.DEAD



fun EvolutionCell.conwayLaws() = when (state) {
  ALIVE -> when (neighbours) {
    2, 3 -> ALIVE  // living on
    else -> DEAD   // underpopulation or overpopulation
  }

  DEAD -> when (neighbours) {
    3 -> ALIVE     // reproduction
    else -> DEAD
  }
}



