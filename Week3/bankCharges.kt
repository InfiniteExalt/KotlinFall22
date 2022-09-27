import java.util.*
    fun main() {
        val banksFee = 10.00
        val lessThan20 = 0.10
        val between2039 = 0.08
        val between4059 = 0.06
        val moreThan60 = 0.04
        var totalCharge = 0.0
        var checks = 0
        val userInput = Scanner(System.`in`)
        println("Please enter the number of checks written this month:")
        checks = userInput.nextInt()
        if (checks < 20) {
            totalCharge = checks * lessThan20 + banksFee
            print("This month's service fees are $ $totalCharge")
        } else if (checks == 20 || checks < 40) {
            totalCharge = checks * between2039 + banksFee
            print("This month's service fees are $ $totalCharge")
        } else if (checks == 40 || checks < 60) {
            totalCharge = checks * between4059 + banksFee
            print("This month's service fees are $ $totalCharge")
        } else if (checks > 60) {
            totalCharge = checks * moreThan60 + banksFee
            print("This month's service fees are $ $totalCharge")
        }
    }
