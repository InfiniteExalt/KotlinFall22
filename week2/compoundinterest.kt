import kotlin.math.pow
fun main(){
    println("What is the principal>>")
    val principal = readLine()!!.toDouble()
    println("What is the Interest Rate>>")
    val rate = readLine()!!.toDouble()
    println("How often is it compounded>>")
    val compound = readLine()!!.toDouble()
    println("How many years of interest>>")
    val interest = readLine()!!.toDouble()
    println("The balance after $interest years: ")
    println(principal*(1+rate/compound).pow(compound*interest))
}
