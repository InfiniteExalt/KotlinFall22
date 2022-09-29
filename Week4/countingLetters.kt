//Kenneth Benitez
//Unit 4 Assignment2 
//Letter Counter
//09-29-2022
fun main() {
        println("Enter a String>> ")
        val text=readLine()!!
        println("Enter one character>> ")
        val symbol= readLine()!![0]
        var count = 0
        for( a in text)
            if(a == symbol)
                count++
        println("The Character $symbol appears $count times in \"$text\"")

    }
