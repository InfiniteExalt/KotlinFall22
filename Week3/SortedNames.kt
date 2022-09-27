import java.util.*
    fun main() {
        val scanner = Scanner(System.`in`)
        //Enter the names
        print("Enter first Name: ")
        var str1: String = scanner.next()
        print("Enter second Name: ")
        var str2: String = scanner.next()
        print("Enter third Name: ")
        var str3: String = scanner.next()
        str1 = str1.lowercase(Locale.getDefault())
        str2 = str2.lowercase(Locale.getDefault())
        str3 = str3.lowercase(Locale.getDefault())
        //Here it will compare the names based on the letters/string
        if (str1.compareTo(str2) < 0 && str1.compareTo(str3) < 0) {
            println(str1)
            if (str2.compareTo(str3) < 0) {
                println(str2)
                println(str3)
            } else {
                println(str3)
                println(str2)
            }
        } else if (str2.compareTo(str1) < 0 && str2.compareTo(str3) < 0) {
            println(str2)
            //Here it will compare and print in alphabetical order
            if (str1.compareTo(str3) < 0) {
                println(str1)
                println(str3)
            } else {
                println(str3)
                println(str1)
            }
        } else {
            println(str3)
            if (str1.compareTo(str2) < 0) {
                println(str1)
                println(str2)
            } else {
                println(str2)
                println(str1)
            }
        }
    }
