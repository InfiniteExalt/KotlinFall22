fun main(){
    println("Enter number of shares")
    val ns = Integer.valueOf(readLine())
    println("Enter price per share")
    val pp = readLine()!!.toDouble()
    println("Enter purchase commission")
    val pc = readLine()!!.toDouble()
    println("Enter sale price per share")
    val sp = readLine()!!.toDouble()
    println("Enter sale commission")
    val sc = readLine()!!.toDouble()
    println("The stock sale's profit is ${stockProfit(ns,pp,pc,sp,sc)}")
}

fun stockProfit(NS:Int,PP:Double,PC:Double,SP:Double,SC:Double):Double{
    return NS*(SP-PP) - (SC+PC)
}
