import java.util.*
object MagicDate {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        val day: Int
        val month: Int
        val two_digit_year: Int
        // here user will input a date, month, and a two digit year
        print("Enter the value of day: ")
        day = `in`.nextInt()
        `in`.nextLine()
        print("Enter the value of month: ")
        month = `in`.nextInt()
        `in`.nextLine()
        print("Enter the value of two digit year: ")
        two_digit_year = `in`.nextInt()
        `in`.nextLine()
        if (day * month == two_digit_year) println("This date is magic!") else println("This date is not magic.")
        //Here the equation will be executed if true it will be magic and if not it will say it is not magic
    }
}
