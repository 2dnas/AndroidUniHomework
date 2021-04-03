package second_homework


class Fraction(private var numerator: Int, private var denominator: Int) {

    override fun toString(): String {
        return "$numerator/$denominator"
    }


    //პოულობს უდიდეს საერთო გამოყოფს.
    private fun gcd(numerator: Int, denominator: Int): Int {
        if (denominator == 0)
            return numerator;
        return gcd(denominator, numerator % denominator);

    }

    //გადაეცემა პარამეტრად Fraction კლასის ობიექტი და კვეცავს უმარტივეს ფორმამდე.
    public fun reduceFraction(fraction: Fraction): Fraction {
        val gcd = fraction.gcd(fraction.numerator, fraction.denominator)

        fraction.numerator = fraction.numerator / gcd
        fraction.denominator = fraction.denominator / gcd

        return fraction
    }

    //გადაეცემა ორი Fraction ობიექტი, უმატებს ერთმანეთს და აბრუნებს მათ ჯამს.

    public fun sumFraction(fraction: Fraction, fraction2: Fraction) : Fraction {
        val simplestFromFrac1 = fraction.reduceFraction(fraction)
        val simplestFormFrac2 = fraction2.reduceFraction(fraction2)
        var denominatorsGCD = gcd(simplestFromFrac1.denominator, simplestFormFrac2.denominator)
        denominatorsGCD = fraction.denominator * fraction2.denominator / denominatorsGCD   // საერთო მნიშვნელი

        val sumFraction =
                    fraction.numerator * (denominatorsGCD / fraction.denominator) +
                    fraction2.numerator * (denominatorsGCD / fraction2.denominator)


        return Fraction(sumFraction,denominatorsGCD)

    }

    // ამრავლებს ორ გადაცემულ Fraction-ს ერთმანეთზე და აბრუნებს ნამრავლს
    public fun multiplyFraction(fraction: Fraction, fraction2: Fraction): Fraction{
        val simplestFromFrac1 = fraction.reduceFraction(fraction)
        val simplestFormFrac2 = fraction2.reduceFraction(fraction2)

        val multipliedNumerator = simplestFromFrac1.numerator * simplestFormFrac2.numerator
        val multipliedDenominator = simplestFromFrac1.denominator * simplestFormFrac2.denominator

        return Fraction(multipliedNumerator,multipliedDenominator)

    }


}

