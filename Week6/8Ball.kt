import java.util.*
object Magic8Ball {
        @JvmStatic
        fun main(args: Array<String>) {
                val r = Random()
                val choice = 1 + r.nextInt(15)
                var response = ""
                response =
                        if (choice == 1) "It is certain" else if (choice == 2) "It is decidedly so" else if (choice == 3) "Without a doubt" else if (choice == 4) "Yes - definitely" else if (choice == 5) "You may rely on it" else if (choice == 6) "As I see it, yes" else if (choice == 7) "Most likely" else if (choice == 8) "Outlook good" else if (choice == 9) "Signs point to yes" else if (choice == 10) "Yes" else if (choice == 11) "Reply hazy, try again" else if (choice == 12) "Ask again later" else if (choice == 13) "Better not tell you now" else if (choice == 14) "Cannot predict now" else if (choice == 15) "Concentrate and ask again" else "8-BALL ERROR!"
                println("MAGIC 8-BALL SAYS: $response")
        }
}
