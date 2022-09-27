import java.util.Scanner
    fun main() {
        val input = Scanner(System.`in`)
        //Here the weight and measurements will be imputed
        print("Input weight in pounds: ")
        val weight = input.nextDouble()
        print("Input height in inches: ")
        val inches = input.nextDouble()
        //This is the equation for Body Mass Index
        val bmi = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254)
        print("Body Mass Index is $bmi\n")
        //This will print weather it is over weight or if they are underweight
        if (bmi > 25){
            println("This person in overweight")
        }else
            println("Person is underweight")
    }
