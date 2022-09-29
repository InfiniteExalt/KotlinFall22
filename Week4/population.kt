//Kenneth Benitez
//Unit 4 Assignment 3
//Population
//09-29-2022
import kotlin.math.pow
    fun main() {
        println("Enter number of Starting organisms>> ")
        var pop: Int
        while(true){
            pop=Integer.valueOf(readLine())
            if(pop>=2) break
            println("Invalid Input")
        }
        println("What is the percentage increase>> ")
        var percent: Double
        while(true){
            percent=readLine()!!.toDouble()/100
            if(percent >= 0) break
            println("Invalid Percentage")
        }
        println("How many days did they multiply?>> ")
        var days:Int
        while(true){
            days = Integer.valueOf(readLine())
            if(days>=1) break
            println("Invalid. Please enter again")
        }
        for(i in 1..days){
            println("On day $i the population is ${pop*(1+percent).pow(i)}")
        }
    }
