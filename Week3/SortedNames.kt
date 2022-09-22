import java.util.*

object Sort3Strings {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        var str1: String
        var str2: String
        var str3: String
        print("Enter first Name: ")
        str1 = scanner.next()
        print("Enter second Name: ")
        str2 = scanner.next()
        print("Enter third Name: ")
        str3 = scanner.next()
        str1 = str1.lowercase(Locale.getDefault())
        str2 = str2.lowercase(Locale.getDefault())
        str3 = str3.lowercase(Locale.getDefault())
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
}
