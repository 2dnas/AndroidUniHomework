package first_home_work

fun main() {
    println(isComposite(1))
    println(isComposite(2))
    println(isComposite(3))
    println(isComposite(5))
    println(isComposite(7))
    println(isComposite(11))
    println(isComposite(13))
    println(isComposite(17))
    println(isComposite(41))
    println(isComposite(43))


}

fun isComposite(number: Int): Boolean {
    //neither composite or prime
    if (number == 1) {
        return false
    }

    if (number <= 3 || number == 5) {
        return false
    }

    if (number % 2 == 0 || number % 3 == 0) {
        return true
    }

    var i = 5
    while (i * i <= number) {
        if (number % i == 0 || number % (i + 2) == 0) {
            return true
        }
        i += 6
    }
    return false;
}



