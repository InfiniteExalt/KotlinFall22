fun main(){
    var win = playGame()
    while(win == 0)
        win = playGame()
}

fun randMove(): Int{
    return (0..2).random()
}
fun getMove(): Int{
    println("Choose rock, paper, or scissors")
    val choices = arrayOf("rock", "paper", "scissors")
    var move = readLine()
    while(move !in choices){
        println("Invalid choice")
        move = readLine()
    }
    return choices.indexOf(move)
}
fun decideWinner(comp: Int, user: Int): Int{
    val rock = intArrayOf(0,1,-1)
    val paper = intArrayOf(-1,0,1)
    val scissors = intArrayOf(1,-1,0)

    val combos = arrayOf(rock,paper,scissors)
    return combos[comp][user]
}
fun playGame(): Int{
    println("Game start!")
    val comp = randMove()
    val user = getMove()
    val cMove = when(comp){
        0 -> "rock"
        1 -> "paper"
        else -> "scissors"
    }
    val uMove = when(user){
        0 -> "rock"
        1 -> "paper"
        else -> "scissors"
    }
    println("Computer choose $cMove")
    println("You chose $uMove")
    val result = decideWinner(comp,user)
    when(result){
        0 -> println("Tie game!")
        1 -> println("You win!")
        else -> println("Computer wins!")
    }
    return result
}
