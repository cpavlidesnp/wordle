//TODO: FIX COLOR CODING OF LETTER WHEN ALREADY IN THE CORRECT POSITION

val allWords = listOf("ABUSE", "ADULT", "AGENT", "ANGER", "APPLE", "AWARD", "BASIS", "BEACH", "BIRTH", "BLOCK", "BLOOD", "BOARD", "BRAIN", "BREAD", "BREAK", "BROWN", "BUYER", "CAUSE", "CHAIN", "CHAIR", "CHEST", "CHIEF", "CHILD", "CHINA", "CLAIM", "CLASS", "CLOCK", "COACH", "COAST", "COURT", "COVER", "CREAM", "CRIME", "CROSS", "CROWD", "CROWN", "CYCLE", "DANCE", "DEATH", "DEPTH", "DOUBT", "DRAFT", "DRAMA", "DREAM", "DRESS", "DRINK", "DRIVE", "EARTH", "ENEMY", "ENTRY", "ERROR", "EVENT", "FAITH", "FAULT", "FIELD", "FIGHT", "FINAL", "FLOOR", "FOCUS", "FORCE", "FRAME", "FRANK", "FRONT", "FRUIT", "GLASS", "GRANT", "GRASS", "GREEN", "GROUP", "GUIDE", "HEART", "HENRY", "HORSE", "HOTEL", "HOUSE", "IMAGE", "INDEX", "INPUT", "ISSUE", "JAPAN", "JONES", "JUDGE", "KNIFE", "LAURA", "LAYER", "LEVEL", "LEWIS", "LIGHT", "LIMIT", "LUNCH", "MAJOR", "MARCH", "MATCH", "METAL", "MODEL", "MONEY", "MONTH", "MOTOR", "MOUTH", "MUSIC", "NIGHT", "NOISE", "NORTH", "NOVEL", "NURSE", "OFFER", "ORDER", "OTHER", "OWNER", "PANEL", "PAPER", "PARTY", "PEACE", "PETER", "PHASE", "PHONE", "PIECE", "PILOT", "PITCH", "PLACE", "PLANE", "PLANT", "PLATE", "POINT", "POUND", "POWER", "PRESS", "PRICE", "PRIDE", "PRIZE", "PROOF", "QUEEN", "RADIO", "RANGE", "RATIO", "REPLY", "RIGHT", "RIVER", "ROUND", "ROUTE", "RUGBY", "SCALE", "SCENE", "SCOPE", "SCORE", "SENSE", "SHAPE", "SHARE", "SHEEP", "SHEET", "SHIFT", "SHIRT", "SHOCK", "SIGHT", "SIMON", "SKILL", "SLEEP", "SMILE", "SMITH", "SMOKE", "SOUND", "SOUTH", "SPACE", "SPEED", "SPITE", "SPORT", "SQUAD", "STAFF", "STAGE", "START", "STATE", "STEAM", "STEEL", "STOCK", "STONE", "STORE", "STUDY", "STUFF", "STYLE", "SUGAR", "TABLE", "TASTE", "TERRY", "THEME", "THING", "TITLE", "TOTAL", "TOUCH", "TOWER", "TRACK", "TRADE", "TRAIN", "TREND", "TRIAL", "TRUST", "TRUTH", "UNCLE", "UNION", "UNITY", "VALUE", "VIDEO", "VISIT", "VOICE", "WASTE", "WATCH", "WATER", "WHILE", "WHITE", "WHOLE", "WOMAN", "WORLD", "YOUTH", "ALCON", "AUGHT", "HELLA", "OUGHT", "THAME", "THERE", "THINE", "THINE", "WHERE", "WHICH", "WHOSE", "WHOSO", "YOURS", "YOURS", "ADMIT", "ADOPT", "AGREE", "ALLOW", "ALTER", "APPLY", "ARGUE", "ARISE", "AVOID", "BEGIN", "BLAME", "BREAK", "BRING", "BUILD", "BURST", "CARRY", "CATCH", "CAUSE", "CHECK", "CLAIM", "CLEAN", "CLEAR", "CLIMB", "CLOSE", "COUNT", "COVER", "CROSS", "DANCE", "DOUBT", "DRINK", "DRIVE", "ENJOY", "ENTER", "EXIST", "FIGHT", "FOCUS", "FORCE", "GUESS", "IMPLY", "ISSUE", "JUDGE", "LAUGH", "LEARN", "LEAVE", "LET’S", "LIMIT", "MARRY", "MATCH", "OCCUR", "OFFER", "ORDER", "PHONE", "PLACE", "POINT", "PRESS", "PROVE", "RAISE", "REACH", "REFER", "RELAX", "SERVE", "SHALL", "SHARE", "SHIFT", "SHOOT", "SLEEP", "SOLVE", "SOUND", "SPEAK", "SPEND", "SPLIT", "STAND", "START", "STATE", "STICK", "STUDY", "TEACH", "THANK", "THINK", "THROW", "TOUCH", "TRAIN", "TREAT", "TRUST", "VISIT", "VOICE", "WASTE", "WATCH", "WORRY", "WOULD", "WRITE", "ABOVE", "ACUTE", "ALIVE", "ALONE", "ANGRY", "AWARE", "AWFUL", "BASIC", "BLACK", "BLIND", "BRAVE", "BRIEF", "BROAD", "BROWN", "CHEAP", "CHIEF", "CIVIL", "CLEAN", "CLEAR", "CLOSE", "CRAZY", "DAILY", "DIRTY", "EARLY", "EMPTY", "EQUAL", "EXACT", "EXTRA", "FAINT", "FALSE", "FIFTH", "FINAL", "FIRST", "FRESH", "FRONT", "FUNNY", "GIANT", "GRAND", "GREAT", "GREEN", "GROSS", "HAPPY", "HARSH", "HEAVY", "HUMAN", "IDEAL", "INNER", "JOINT", "LARGE", "LEGAL", "LEVEL", "LIGHT", "LOCAL", "LOOSE", "LUCKY", "MAGIC", "MAJOR", "MINOR", "MORAL", "NAKED", "NASTY", "NAVAL", "OTHER", "OUTER", "PLAIN", "PRIME", "PRIOR", "PROUD", "QUICK", "QUIET", "RAPID", "READY", "RIGHT", "ROMAN", "ROUGH", "ROUND", "ROYAL", "RURAL", "SHARP", "SHEER", "SHORT", "SILLY", "SIXTH", "SMALL", "SMART", "SOLID", "SORRY", "SPARE", "STEEP", "STILL", "SUPER", "SWEET", "THICK", "THIRD", "TIGHT", "TOTAL", "TOUGH", "UPPER", "UPSET", "URBAN", "USUAL", "VAGUE", "VALID", "VITAL", "WHITE", "WHOLE", "WRONG", "YOUNG", "AFORE", "AFTER", "BOTHE", "OTHER", "SINCE", "SLASH", "UNTIL", "WHERE", "WHILE", "ABACK", "ABAFT", "ABOON", "ABOUT", "ABOVE", "ACCEL", "ADOWN", "AFOOT", "AFORE", "AFOUL", "AFTER", "AGAIN", "AGAPE", "AGOGO", "AGONE", "AHEAD", "AHULL", "ALIFE", "ALIKE", "ALINE", "ALOFT", "ALONE", "ALONG", "ALOOF", "ALOUD", "AMISS", "AMPLY", "AMUCK", "APACE", "APART", "APTLY", "AREAR", "ASIDE", "ASKEW", "AWFUL", "BADLY", "BALLY", "BELOW", "CANNY", "CHEAP", "CLEAN", "CLEAR", "COYLY", "DAILY", "DIMLY", "DIRTY", "DITTO", "DRILY", "DRYLY", "DULLY", "EARLY", "EXTRA", "FALSE", "FATLY", "FEYLY", "FIRST", "FITLY", "FORTE", "FORTH", "FRESH", "FULLY", "FUNNY", "GAILY", "GAYLY", "GODLY", "GREAT", "HAPLY", "HEAVY", "HELLA", "HENCE", "HOTLY", "ICILY", "INFRA", "INTL.", "JILDI", "JOLLY", "LAXLY", "LENTO", "LIGHT", "LOWLY", "MADLY", "MAYBE", "NEVER", "NEWLY", "NOBLY", "ODDLY", "OFTEN", "OTHER", "OUGHT", "PARTY", "PIANO", "PLAIN", "PLONK", "PLUMB", "PRIOR", "QUEER", "QUICK", "QUITE", "RAMEN", "RAPID", "REDLY", "RIGHT", "ROUGH", "ROUND", "SADLY", "SECUS", "SELLY", "SHARP", "SHEER", "SHILY", "SHORT", "SHYLY", "SILLY", "SINCE", "SLEEK", "SLYLY", "SMALL", "SOUND", "SPANG", "SRSLY", "STARK", "STILL", "STONE", "STOUR", "SUPER", "TALLY", "TANTO", "THERE", "THICK", "TIGHT", "TODAY", "TOMOZ", "TRULY", "TWICE", "UNDER", "UTTER", "VERRY", "WANLY", "WETLY", "WHERE", "WRONG", "WRYLY", "ABAFT", "ABOON", "ABOUT", "ABOVE", "ADOWN", "AFORE", "AFTER", "ALONG", "ALOOF", "AMONG", "BELOW", "CIRCA", "CROSS", "FURTH", "MINUS", "NEATH", "ROUND", "SINCE", "SPITE", "UNDER", "UNTIL")

const val textGreen = "\u001b[32m"
const val textYellow = "\u001b[33m"
const val textRed = "\u001b[31m"
const val textReset = "\u001b[0m"

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
fun main(){

    chosenWord = chooseWord()
    //println(chosenWord)
    printGrid()

    while(isGameActive) {


        println("Type in a 5 letter word")
        val userInput = readLine() ?: ""

        if (validateUserInput(userInput)) {

            userGuess(userInput.uppercase(), iter)
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
    return if (playAgainUser=="y" || playAgainUser=="yes") {
        grid = Array(depth) { Array(depth) { emptyValue } }
        burntLetters = hashSetOf()
        emptyLetterArrays()
        iter = 0
        chosenWord = chooseWord()
        println(chosenWord)
        printGrid()
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
        }else if (validateLetterExistence(userWord[i], userWord)) {
            // exists in incorrect position
            grid[iter][i] = "| $textYellow${userWord[i]}$textReset |"
            wrongPositionLetters.add(userWord[i])
        }else {
            // does not exist
            grid[iter][i] = "| $textRed${userWord[i]}$textReset |"
            burntLetters.add(userWord[i])
        }

    }
    printGrid()
    println("BURNT LETTERS: $burntLetters")
}

fun emptyLetterArrays(){
    correctPositionLetters = arrayListOf()
    wrongPositionLetters = arrayListOf()
}

fun validateLetterPosition(letter: Char, iter: Int): Boolean {
    return (chosenWord[iter] == letter)
}

fun validateLetterExistence(letter: Char, userWord: String): Boolean {

    //check if the letter already exists in the correctPositionLetters
    val countCorrectPosition = correctPositionLetters.count { it == letter }
    val countWrongPosition = wrongPositionLetters.count { it == letter }
    val countUserInput = userWord.count { it == letter }
    val countChosenWord = chosenWord.count { it == letter }

    return if (countChosenWord==(countCorrectPosition+countWrongPosition) && countUserInput>countChosenWord)
        false
    else
        (chosenWord.contains(letter))

}

fun checkWinner(userWord : String): Boolean {
    return (userWord == chosenWord)
}

fun validateUserInput(userInput: String): Boolean {
    return (userInput.length==depth)
    //&& allWords.contains(userInput)
}