fun main(){
    //User will imput the mass in newtons
    println("Enter mass in newtons: ")
    val mass = Integer.valueOf(readLine())
    if (mass>1000) {
        println("mass is too heavy.")
    }else{
            if (mass<10)
                println("mass is too light")
        }
    //the weight equation for mass
var weight=(mass * 9.8)
println("The weight is: $weight")
//Will output the conversion
}
