//Yuen Shan Tsang (A00270323)
//JAV-1001 - 11354 - App Development for Android - 202301 - 001
//Lab 2 - Functions and Arrays


/* By collecting user input, the function should print the results.

encrypt: A Caesar cipher function that accepts a String (the String to encrypt), a shift value, and returns the new String.

arrayAvg: A function that accepts an array and produces the average of all values (array should be numeric type)

arrayContains: A function that accepts an array and a search value, and determines if the array contains the value (true/false) (the array can use any data type you want)

reverse: A function that reverses an array (gives a new array) (the array can use any data type you want)
*/

fun main(){

    //Array contains function
    fun arrayContains(array: Array<Int>, searchValue: Int): Boolean {
        for (element in array) {
            if (element == searchValue) {
                return true
            }
        }
        return false
    }
    
    //Test the array contains function
    val array = arrayOf(1, 2, 3, 4, 10)
    val searchValue = 10
    println(arrayContains(array, searchValue))

    //Reverse function    
    fun reverse(originalArray: Array<Int>): Array<Int> {
        val reversedList = mutableListOf<Int>()
        for (i in originalArray.size-1 downTo 0){
            reversedList.add(originalArray[i])
        }
        return reversedList.toTypedArray()
    }

    //Test the reverse function     
    val originalArray = arrayOf(1, 2, 3, 4, 10)
    val reversedArray = reverse(originalArray)
    println(reversedArray.contentToString())

}
