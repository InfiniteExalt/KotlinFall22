import java.util.*
    fun main() {
        val info = Scanner(System.`in`)
        println("Enter the name of your favourite city:")
        var city = String()
        city = info.next()
        val length = city.length
        var upper = String()
        upper = city.uppercase(Locale.getDefault())
        var lower = String()
        lower = city.lowercase(Locale.getDefault())
        var first = String()
        first = city[0].toString()
        println("You entered the name of your city: $city\n the number of character in your city are: $length\n Your city name in upper case is: $upper\n Your city name in lower case is: $lower\n the first letter of your city is: $first")
    }
