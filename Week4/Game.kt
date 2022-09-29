//Kenneth Benitez
//Unit 4 Assignment 6 
//ESP Game
//09-29-2022

fun main(){
    var correct = 0
    val colors = arrayOf("Red", "Green", "Blue", "Orange", "Yellow")
    for(i in 1..10){
        val color = colors.random()
        println("Try to guess the random color out of: Red, Green, Blue, Orange, Yellow")
        val guess = readLine()
        if(guess==color){
            println("That's right!")
            correct++
        }
        println("The correct color is $color")
    }
    println("Correct guesses: $correct/10")
