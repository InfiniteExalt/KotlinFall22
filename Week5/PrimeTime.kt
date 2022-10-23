fun main(){
    for(i in 2..8893){
        if(isPrime(i))
            println(i)
    }
}

fun isNumberDivisible(number: Int, divisor: Int): Boolean{
    return number%divisor==0
}

fun isPrime(number: Int): Boolean{
    var i = 2
    while(i*i <= number){
        if(isNumberDivisible(number,i))
            return false
        i++
    }
    return number>1
}
