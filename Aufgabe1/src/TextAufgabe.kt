fun main() {

    //todo a
    minusRechnen(10,5)
    minusRechnen(5,10)


    // todo b

    hallo("Peter")
    hallo("Anna")
    hallo("Alex")


    //todo c
    multiplikation(5, 23)


    //todo d

    printFilm(4)



}
/* hier funktioniert wie die Mathematik erste groesse dann klein
 wenn gegeteil ist wie 5 -10 dann komm mit monade dazu */
//todo a

fun minusRechnen(zahl1:Int, zahl2: Int) {

    var rechnen = zahl1 - zahl2

    println("Antwort von die $zahl1 minus $zahl2 ist : $rechnen")
}


// todo b)  Schau dir den Codeausschnitt an.

/*Was wird hier ausgegeben?
Notiere dir deine Antwort. (z.B. in einem Kommentar)
Führe dann den Code aus.

Wird das ausgegeben, was du dir notiert hast?*/



fun hallo(name: String) {

    println("Hallo! Wie geht es dir $name?")
}
// todo c


fun multiplikation(zahl1: Int, zahl2: Int) {
    println(zahl1 * zahl2)
}



// todo d



fun printFilm(listenIndex: Int) {
    val lieblingsFilme: MutableList<String> = mutableListOf(
        "Batman", "Oldboy", "ES",
        "Harry Potter", "Pulp Fiction"
    )
    println(lieblingsFilme[listenIndex])
}