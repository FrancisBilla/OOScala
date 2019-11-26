package io.turntabl.students

import io.turntabl.TurntablEmployee
import io.turntabl.grade.Grade
import javax.security.auth.Subject

object TLCStudent extends App {

  class TLCStudent (val fName: String,
                   val lName: String,
                   val iDNumber: Int = 0,
                   val roleDescription: String = "null",
                   val url: String = "https://github.com/turntabl",
                   val yearEmployed: Int = 0) extends TurntablEmployee{

    //IMPLEMENTING TURNTABL EMPLOYEE
    def printWorkHard = print("Works Super Hard")

    override def GetWorkload: Unit = super.GetWorkload

    //OBJECT TO STUDENT CLASS
    object TLCStudent{
      def apply(f: String, l: String): TLCStudent = new TLCStudent(f, l)
    }

    //OVERRIDE  TOSTRING ON TLCSTUDENTS CLASS
    override def toString = s"$fName $lName $iDNumber $roleDescription $url "


    //SAME TERM OF SERVICE
    def isEqualYears(x: TLCStudent)= x.yearEmployed == x.yearEmployed
 }

  val person1 = new TLCStudent("Mike","Ansah",324453,"Accountant","https://github.com/FrancisBilla/OOScala",2019)


  val person2 = new TLCStudent("Vivian","Boakye",3564543,"Developer","https://github.com/FrancisBilla/OOScala",2019)


 //CALCULATE TERM OF SERVICE
 def termOfService(x: TLCStudent, currentYear: Int)=currentYear - x.yearEmployed



//TOP GRADE
  def TopGrade()=Grade("Go", 89)



  println("Calculate term of service: " + termOfService(person1, 2025))
    print("Checking the year is the same: ")
  println( person1 isEqualYears person2)

  println("Top Grade: "+TopGrade())





}
