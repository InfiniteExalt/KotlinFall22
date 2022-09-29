//Kenneth Benitez
//Unit 4 Assignment 4
//Bar Graph
//09-29-2022
fun main(){
    val sales = IntArray(5)
    for(i in 1..5){
        println("Enter today's sales for store $i:")
        sales[i-1] = Integer.valueOf(readLine())
    }
    println("SALES BAR CHART")
    for(i in 0..4)
        println("Store ${i+1}: ${"*".repeat(sales[i]/100)}")
}
