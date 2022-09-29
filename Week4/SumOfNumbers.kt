//Kenneth Benitez
//Unit 4 Assignment 1 
//Sum of Numbers
//09-29-2022
fun main() {
        print("Please enter a positive nonzero integer value>> ")
        val num =Integer.valueOf(readLine())
        var sum=0
        for(i in 1..num)
            sum+= i
        println("Sum:$sum")
    }
