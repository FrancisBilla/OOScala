package io.turntabl.functionScala

object functionalScala extends App {

  //CHECKING FOR THE LENGTH
  val lengthChecker =(i: String)=> i.length

  println(lengthChecker("Try Go"))

  //CHECKING FOR SPACES
  val spaceChecker =(i: String)=> i.length - i.replaceAll(" ","").length
  println(spaceChecker("Try Go Let"))

  //APPLY TO STRING
  val ApplyToString = (n: String, m: (String => Int)) => m(n)

  println(ApplyToString("Let Check", lengthChecker))
  println(ApplyToString("Let Check", spaceChecker))


  //CALCULATOR
  val Calculator =(p: String) => ((x: Int, y: Int) => p match{
  case i if (p == "add") => x + y
  case i if (p == "subtract") => x - y })
  val inner = Calculator("add")
  println(inner(3,4))

}
