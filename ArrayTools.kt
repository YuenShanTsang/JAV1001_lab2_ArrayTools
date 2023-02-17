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

    //Encrypt (Caesar cipher) function
    fun encrypt(originalMsg: String, shiftValue: Int): String {
        val alphabet = "abcdefghijklmnopqrstuvwxyz"
        var encryptedMsg = ""
        for (char in originalMsg) {
            if (char.isLetter()) {
                //Add the shift value to the current letter by using the index
                val shiftedIndex = (alphabet.indexOf(char.lowercaseChar()) + shiftValue) % 26
                val shiftedChar = alphabet[shiftedIndex]
                
                //Handle uppercase
                encryptedMsg += if (char.isUpperCase()) shiftedChar.uppercaseChar() else shiftedChar
            } else {
                //If the character is not a letter just add to the string without changes
                encryptedMsg += char
            }
        }
        return encryptedMsg
    }
    
    //Test the encrypt function
    //Collect message and shift value from user
    print("Please enter a message to encrypt: ")
    val originalMsg = readLine()!!
    print("Please enter the shift value: ")
    val shiftValue = readLine()!!.toInt()

    //Call the function
    val encryptedText = encrypt(originalMsg, shiftValue)
    println("The encrypted message is: $encryptedText")


    //Array average function
    fun arrayAvg(values: Array<Int>): Double {
        var total = 0.0
        
        //Loop through the array to sum all the values
        for (value in values) {
            total += value
        }
        //To calculate average number
        return total / values.size
    }
    
    //Test the array average function
    val values = arrayOf(1, 2, 3, 4, 10)
    val average = arrayAvg(values)
    println("The average of all values = $average")


    //Array contains function
    fun arrayContains(array: Array<Int>, searchValue: Int): Boolean {

        for (element in array) {
            //Return true if the value in array equal to the search value
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
        //Store the reversed order list of integers
        val reversedList = mutableListOf<Int>()
        
        //Add the elements of an array in reverse order to a list
        for (i in originalArray.size-1 downTo 0){
            reversedList.add(originalArray[i])
        }

        //Change the list back to array
        return reversedList.toTypedArray()
    }

    //Test the reverse function     
    val originalArray = arrayOf(1, 2, 3, 4, 10)
    val reversedArray = reverse(originalArray)
    println(reversedArray.contentToString())

}
