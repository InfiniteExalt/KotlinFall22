//Kenneth Benitez
//Unit 4 Assignment 5
//Random Number Guess
//09-29-2022

fun main() {
    val max = 100
    val randNum = (1..max).random()
    println("Try to guess the random number from 1 to $max")
    var guess: Int
    while (true) {
        guess = Integer.valueOf(readLine())
        if (guess > randNum) println("Too high, try again.")
        else if (guess < randNum) println("Too low, try again.")
        else {
            println("That's correct!")
            break
        }
    }
}
