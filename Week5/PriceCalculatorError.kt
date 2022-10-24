fun main(){
    println("Enter an item's wholesale cost: ")
    val cost = readln().toDouble()
    println("Enter the item's markup percentage: ")
    val markup = readln().toDouble()
    println("The item's retail price is $${calculateRetail(cost,markup)}")
}

fun calculateRetail(cost: Double, markup: Double): Double{
    return cost*(1+markup/100)
}
