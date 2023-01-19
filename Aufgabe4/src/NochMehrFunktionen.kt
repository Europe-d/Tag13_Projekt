import javax.net.ssl.StandardConstants
import kotlin.contracts.ReturnsNotNull

fun main() {

    printCity("Berlin")
    printCity("Duisburg")
    printCity("Frankfurt")




}


fun printCity(ort: String) {

var katerini: MutableList<String> = mutableListOf("Koln","Hamburg")
    katerini.add(ort)
    println(katerini)



}