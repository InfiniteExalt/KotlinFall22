fun main(){
    for(t in 1..10)
        println("The object fell ${fallingDistance(t.toDouble())} meters after $t seconds")
}

fun fallingDistance(time: Double): Double{
    return .5*9.8*time*time
}
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
