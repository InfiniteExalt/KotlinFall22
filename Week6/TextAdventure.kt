val roomNames = arrayOf(
    "balcony",
    "first bedroom",
    "north hall",
    "kitchen",
    "second bedroom",
    "south hall",
    "dining room"
)
val legalHeadings = arrayOf(
    arrayOf("south"),
    arrayOf("east","south"),
    arrayOf("north","east","south","west"),
    arrayOf("south","west"),
    arrayOf("north","east"),
    arrayOf("north","east","west"),
    arrayOf("north","west")
)
val legalRooms = arrayOf(
    arrayOf(2),
    arrayOf(2,4),
    arrayOf(0,3,5,1),
    arrayOf(6,2),
    arrayOf(1,5),
    arrayOf(2,6,4),
    arrayOf(3,5)
)

fun main(){
    var position = roomNames.indices.random()
    while(true){
        println("You are in the "+roomNames[position]+".")
        println("There are rooms in the following directions:")
        val directions = legalHeadings[position]
        directions.forEach { println(it) }
        println("Which direction do you choose?")
        val choice = readLine()
        println()
        if(choice !in directions)
            println("You can't go that way.")
        else
            position = legalRooms[position][directions.indexOf(choice)]
    }
}
