package io.turntabl.manager

import io.turntabl.TurntablEmployee

class TurntablManager extends TurntablEmployee {

  def printWorkHard = print("hard worker")
  override def GetWorkload: Unit = super.GetWorkload

  //TERM OF SERVICE METHOD
  val termOfService = 100

  //termOfServiceN(2019, 2030)

//println(termOfServiceN)
}

//val emp = new TurntablManager