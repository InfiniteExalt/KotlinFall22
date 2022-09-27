import java.util.*
fun main() {
        //Runner1 info
        val scan = Scanner(System.`in`)
        println("Enter name and time:")
        //String input
        val runner1 = scan.nextLine()
        //Numerical Input
        val time1 = scan.nextInt()

        //Runner2 info
        val scan2 = Scanner(System.`in`)
        println("Enter name and time:")
        //String input
        val runner2 = scan.nextLine()
        //Numerical Input
        val time2 = scan2.nextInt()

        //Runner3 info
        val scan3 = Scanner(System.`in`)
        println("Enter name and time:")
        //String input
        val runner3 = scan.nextLine()
        //Numerical Input
        val time3 = scan3.nextInt()

        // Output input from user
        println("Runner: $runner1")
        println("Time: $time1")
        println("Runner: $runner2")
        println("Time: $time2")
        println("Runner: $runner3")
        println("Time: $time3")
        if (time1 >= time2) {
            if (time2 >= time3) println("In order $runner3 $runner2 $runner1") else if (time3 >= time1) println("In order $runner2 $runner1 $runner3") else if (time1 >= time3) println(
                "In order $runner2 $runner3 $runner1"
            )
        } else {
            if (time3 >= time2) println("In order $runner1 $runner2 $runner3") else if (time3 >= time1) println("In order $runner1 $runner3 $runner2") else if (time1 >= time3) println(
                "In order $runner3 $runner1 $runner2"
            )
        }
    }
