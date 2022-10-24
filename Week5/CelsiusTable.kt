fun main(){
    for(temp in 0..20)
        println("$temp degrees Fahrenheit equals ${celsius(temp.toDouble())} degrees Celsius")
}

fun celsius(Fahrenheit: Double): Double{
    return 5.0/9 * (Fahrenheit-32)
}
