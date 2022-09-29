fun main() {
        print("Please enter a positive nonzero integer value>> ")
        val num =Integer.valueOf(readLine())
        var sum=0
        for(i in 1..num)
            sum+= i
        println("Sum:$sum")
    }
