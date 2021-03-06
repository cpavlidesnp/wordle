const val textGreen = "\u001b[32m"
const val textYellow = "\u001b[33m"
const val textRed = "\u001b[31m"
const val textReset = "\u001b[0m"


val keyb1 = arrayListOf('Q','W','E','R','T','Y','U','I','O','P')
val keyb2 = arrayListOf('A','S','D','F','G','H','J','K','L')
val keyb3 = arrayListOf('Z','X','C','V','B','N','M')

var isGameActive = true
var maxAttempts: Int = 5
var chosenWord:String = ""
const val depth = 5
var emptyValue = "| _ |"
var grid = Array (depth){Array(depth){emptyValue}}
var iter = 0
var burntLetters = hashSetOf<Char>()
var correctPositionLetters = arrayListOf<Char>()
var wrongPositionLetters = arrayListOf<Char>()

var correctPositionLettersConst = arrayListOf<Char>()
var wrongPositionLettersConst = arrayListOf<Char>()

fun main(){

    chosenWord = chooseWord()
    printGrid()
    printKeyboard()

    while(isGameActive) {


        println("Type in a 5 letter word")
        val userInputInit = readLine() ?: ""
        val userInput = userInputInit.uppercase()

        if (validateUserInput(userInput)) {

            userGuess(userInput, iter)
            iter++

            if (checkWinner(userInput)) {
                println("CONGRATS!!")
                if (!newGame()){
                    isGameActive = false
                    break
                }

            }

            if (iter == maxAttempts) {
                println("FAILED! WORD WAS: $chosenWord")
                if (!newGame()) {
                    isGameActive = false
                    break
                }
            }
        }else
            println("NOT A $depth LETTER WORD")
    }
}

fun newGame(): Boolean{
    println("Would you like to play again? y/n")
    val playAgainUser = readLine()?:""
    return if (playAgainUser.uppercase()=="Y" || playAgainUser.uppercase()=="YES") {
        grid = Array(depth) { Array(depth) { emptyValue } }
        burntLetters = hashSetOf()
        emptyLetterArrays()
        emptyConstLetterArrays()
        iter = 0
        chosenWord = chooseWord()
        println(chosenWord)
        printGrid()
        printKeyboard()
        true
    }else{
        false
    }
}


fun printGrid(){
    grid.forEach {row->
        row.forEach { element ->
            print(element)
        }
        println()
    }
}

fun printKeyboard(){
    for (ch in keyb1){
        when (ch) {
            in burntLetters -> print("|$textRed$ch$textReset|")
            in correctPositionLettersConst -> {
                print("|$textGreen$ch$textReset|")
            }
            in wrongPositionLettersConst -> {
                print("|$textYellow$ch$textReset|")
            }
            else -> print("|$ch|")
        }
    }
    println()
    print("  ")
    for (ch in keyb2){
        when (ch) {
            in burntLetters -> print("|$textRed$ch$textReset|")
            in correctPositionLettersConst -> {
                print("|$textGreen$ch$textReset|")
            }
            in wrongPositionLettersConst -> {
                print("|$textYellow$ch$textReset|")
            }
            else -> print("|$ch|")
        }
    }
    println()
    print("    ")
    for (ch in keyb3){
        when (ch) {
            in burntLetters -> print("|$textRed$ch$textReset|")
            in correctPositionLettersConst -> {
                print("|$textGreen$ch$textReset|")
            }
            in wrongPositionLettersConst -> {
                print("|$textYellow$ch$textReset|")
            }
            else -> print("|$ch|")
        }
    }
    println()
}

fun chooseWord (): String{
    val rand = (allWords.indices).random()
    return allWords[rand].uppercase()
}

fun userGuess(userWord: String, iter: Int){
    emptyLetterArrays()
    for (i in 0 until depth){

        if (validateLetterPosition(userWord[i], i)) {
            //exists in correct position
            grid[iter][i] = "| $textGreen${userWord[i]}$textReset |"
            correctPositionLetters.add(userWord[i])
            correctPositionLettersConst.add(userWord[i])
        }else if (validateLetterExistence(userWord[i], userWord)) {
            // exists in incorrect position
            grid[iter][i] = "| $textYellow${userWord[i]}$textReset |"
            wrongPositionLetters.add(userWord[i])
            wrongPositionLettersConst.add(userWord[i])
        }else {
            // does not exist
            grid[iter][i] = "| $textRed${userWord[i]}$textReset |"
            burntLetters.add(userWord[i])
        }

    }
    printGrid()
    printKeyboard()
    //println("BURNT LETTERS: $burntLetters")
}

fun emptyLetterArrays(){
    correctPositionLetters = arrayListOf()
    wrongPositionLetters = arrayListOf()
}

fun emptyConstLetterArrays(){
    correctPositionLettersConst = arrayListOf()
    wrongPositionLettersConst = arrayListOf()
}
fun validateLetterPosition(letter: Char, iter: Int): Boolean {
    return (chosenWord[iter] == letter)
}

fun validateLetterExistence(letter: Char, userWord: String): Boolean {

    var countCorrectPosition = correctPositionLetters.count { it == letter }
    val countWrongPosition = wrongPositionLetters.count { it == letter }
    val countUserInput = userWord.count { it == letter }
    val countChosenWord = chosenWord.count { it == letter }

    if (checkLetterPosition(letter) && letter !in correctPositionLetters)
        countCorrectPosition++

    return if ((countChosenWord==(countCorrectPosition+countWrongPosition) && countUserInput>countChosenWord))
        false
    else
        chosenWord.contains(letter)

}

fun checkLetterPosition(letter: Char): Boolean {
    var foundCorrectPosition = false
    for (i in 0 until depth){
        if (chosenWord[i]==letter)
            foundCorrectPosition = true
    }

    return foundCorrectPosition
}

fun checkWinner(userWord : String): Boolean {
    return (userWord == chosenWord)
}

fun validateUserInput(userInput: String): Boolean {
    return (userInput.length==depth && allWords.contains(userInput))
}