package io.turntabl.manager

import io.turntabl.TurntablEmployee

class TurntablManager extends TurntablEmployee {

  def printWorkHard = print("hard worker")
  override def GetWorkload: Unit = super.GetWorkload


}
//val emp = new TurntablManager