package io.turntabl.collectioScala

object Collections  extends App {

  //UNPACKING TUPLE
  val tuple1 = ("Francis", "python")
  var name, favProg = tuple1

  println(name, "\n", favProg)

  println()

  //PRINTING COUNTRIES
  val countries = Map("Ghana" -> "Accra",
    "Nigeria" -> "Abuja", "Togo" -> "Lome")
  println(countries)

  println()

  val countries1 = countries ++ Map("Canada" -> "Toronto", "South Africa" -> "Josberg")
  println(countries1)

  println(countries1.getOrElse("Norway", "Unknown"))

  println()

  //CREATING SET FOR FRIENDS
  val friends = Set("Bill Ali", "Dennis Effa", "Christy K", "Alex Owusu")
  val friendss = friends ++ Set("Samuel", "Samuel B")
  println(friendss)

  println()

  println(friendss.count(_ == "Samuel"))
  //friendss.groupBy(identity).mapValues(_.size)("Samuel")

  println()

  //LIST OF NAMES
  val Names = Seq("Vivian", "Fred", "Sam", "Joel", "fRANCIS Billa")
  Names foreach (println)

  println("LIST")

  println( Names.filter(_.length > 6))

 println()

  println(Names.count(_.length > 6))

}