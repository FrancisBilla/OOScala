package io.turntabl.functionalCollections

object BookObjClass extends App {

  val books = List(
  Book("Billa", "learn Code", 2019, "Educational"),
  Book("Boakye","Kill it",2009,"Motivational"),
  Book("Ansah","Tomorrow",2000,"Fiction"),
  Book("Effa","Laugh your heart",1968,"Commic")
  )

   def publishedLn(year: Int,col: Book)= col.PubYear == year

  //books.foreach(i: Book.)
   books foreach((i => if(i.Category == "Histroy") i match{
     case Book(a,t,y,c) => println(a)
   }))


  //MAP[STRING, BOOK]
  val booksByTitle = books map(b => b.BookTitle -> Book) toMap

  println(booksByTitle)


  //LIST[STRING]
  val booksTitle = List("Kill it", "New", "Tomorrow")

  val bookList = booksTitle flatMap booksByTitle.get
  println(bookList)

}
