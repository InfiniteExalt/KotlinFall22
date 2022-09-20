import java.util.*

object Cookies {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter how many cookies you ate: ")
        val cookieCount = sc.nextInt()
        val servingSize = 40 / 10
        val caloriesPerCookie = 300 / servingSize
        val totalCalories = cookieCount * caloriesPerCookie
        println("Total calories consumed: $totalCalories")
    }
}
