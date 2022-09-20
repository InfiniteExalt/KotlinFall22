import java.util.*

object CompoundInterest {
    @JvmStatic
    fun main(args: Array<String>) {
        val principle: Double
        val rate: Double
        val time: Double
        val compound_interest: Double
        println("Required packages have been imported")
        val my_scanner = Scanner(System.`in`)
        println("A Scanner object has been defined ")
        print("Enter a Principle number : ")
        principle = my_scanner.nextInt().toDouble()
        print("Enter Interest rate : ")
        rate = my_scanner.nextInt().toDouble()
        print("Enter a Time period in years : ")
        time = my_scanner.nextInt().toDouble()
        compound_interest = principle * Math.pow(1 + rate / 100, time) - principle
        println("The Compound Interest is : $compound_interest")
    }
}
