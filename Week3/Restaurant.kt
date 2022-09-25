fun main(){
    println("Is anyone in your party a vegetarian?>> ")
    val isVegetarian = readLine()=="yes"
    println("Is anyone in your party vegan?>> ")
    val isVegan = readLine() =="yes"
    println("Does anyone in your party need gluten free food?>> ")
    val isGlutenFree = readLine()=="yes"

    println("Here are your restaurant choices...")
    if (!isVegetarian && !isVegan && !isGlutenFree)
        println("Joe's Gourmet Burgers")
    if (!isVegan)
        println("Main Street Pizza Company")
    println("Corner Cafe")
    if (!isVegan && !isGlutenFree )
        println("Mamas Fine Italian")
    println("The Chef's Kitchen")
}
