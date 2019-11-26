package io.turntabl.students

import io.turntabl.grade.Grade
import javax.security.auth.Subject

object TLCStudent extends App {

  class TLCStudent(val fName: String,
                   val lName: String,
                   val iDNumber: Int = 0,
                   val roleDescription: String = "null",
                   val url: String = "https://github.com/turntabl",
                   val yearEmployed: Int = 0) {

    object TLCStudent{
      def apply(f: String, l: String): TLCStudent = new TLCStudent(f, l)
    }

    def isEqualYears(x: TLCStudent)= x.yearEmployed == x.yearEmployed

    override def toString = s"$fName $lName $iDNumber $roleDescription $url "

    println(s"creating Person $fName $lName whose ID Number is $iDNumber, and have been employ as $roleDescription")

  }



  val person1 = new TLCStudent("Mike","Ansah",324453,"Accountant","https://github.com/FrancisBilla/OOScala",2019)
  val yearEmployedOfPerson1: Int  = 2019


  val person2 = new TLCStudent("Vivian","Boakye",3564543,"Developer","https://github.com/FrancisBilla/OOScala",2019)
  val yearEmployedOfPerson2: Int  = 2020


  def calYear(yearOfWork: Int, currentYear: Int)=currentYear-yearOfWork


  def TopGrade()=Grade("Go", 89)

  println(calYear(yearEmployedOfPerson1, 2025))



  println(person1 isEqualYears person2)





}
