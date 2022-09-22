import java.util.*

object Exercise6 {
    @JvmStatic
    fun main(Strings: Array<String>) {
        val input = Scanner(System.`in`)
        print("Input weight in pounds: ")
        val weight = input.nextDouble()
        print("Input height in inches: ")
        val inches = input.nextDouble()
        val BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254)
        print("Body Mass Index is $BMI\n")
        if (BMI > 25){
            println("This person in overweight")
        }else
            println("Person is underweight")
    }
}
