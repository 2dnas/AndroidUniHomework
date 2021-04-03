import second_homework.Fraction

fun main() {
    val fraction = Fraction(1,2)
    val fraction2 = Fraction(2,8)
    val newFrac = fraction.reduceFraction(fraction)
    println(newFrac)


    println(fraction.sumFraction(fraction,fraction2))
    print(fraction.multiplyFraction(fraction,fraction2))

}









