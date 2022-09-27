import java.util.Scanner
    fun main() {
        val `in` = Scanner(System.`in`)
        // here user will input a date, month, and a two digit year
        print("Enter the value of day: ")
        val day: Int = `in`.nextInt()
        `in`.nextLine()
        print("Enter the value of month: ")
        val month: Int = `in`.nextInt()
        `in`.nextLine()
        print("Enter the value of two digit year: ")
        val twoDigitYear: Int = `in`.nextInt()
        `in`.nextLine()
        if (day * month == twoDigitYear) println("This date is magic!") else println("This date is not magic.")
        //Here the equation will be executed if true it will be magic and if not it will say it is not magic
    }
