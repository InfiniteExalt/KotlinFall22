fun main(){
    for(i in 1..15)
        println(fibonacci(i))
}

fun fibonacci(number: Int): Int{
    if(number <= 0)
        return 0
    if(number < 3)
        return 1
    return fibonacci(number-1)+fibonacci(number-2)
}

fun fastFibonacci(number: Int): Int{
    if(number < 1)
        return 0
    var a = 1
    var b = 1
    for(i in 2..number){
        val c = a+b
        a = b
        b = c
    }
    return a
}
