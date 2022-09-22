fun main(){
    println("Enter mass in newtons: ")
    val mass = Integer.valueOf(readLine())
    if (mass>1000) {
        println("mass is too heavy.")
    }else{
            if (mass<10)
                println("mass is too light")
        }
var weight=(mass * 9.8)
println("The weight is: $weight")
}
