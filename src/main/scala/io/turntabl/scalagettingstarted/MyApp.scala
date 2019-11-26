package io.turntabl.scalagettingstarted

object MyApp extends App {
    print("Hello, World!")


    //2: printing first name with place of birth
    val firstName = "Francis"
    val pob = "Batama"
    print(s"$firstName was born in $pob")

    //3:
    def threeTimes(input: String)= input*3


    //4:
    def even(i: Int)= if(i % 2 == 0) print("Even") else print("")
    even(6)

    //5

    def odd(x: Int)=if(x % 2 != 0) print("odd number")else(even(x))

    odd(9)

    //6

    def wordsToLower(word: String*)= word map(_.toLowerCase)
    wordsToLower("Bill", "DORA", "vEe")

    //7

    def even2(x: Int)= x % 2 ==0
    even2(6)

    //8

    def isWeekendDay(day: String)= day match {
        case "saturday" | "sunday" => true
        case _ => false
    }

    //9

    def areWeekendDays(day: String*)=
        day map(isWeekendDay)

    areWeekendDays("monday","saturday","thursday","friday","sunday")

    //10
    areWeekendDays("monday","friday","sunday") foreach(println)

    //11

    def timesInt(x: String ,y: Int)= x * y

    timesInt("Hello",4)




}

