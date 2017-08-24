
object RomanNumerals {

  def toRoman(number: Int): String = {
    if (number < 10) toRoman1To9(number, ("I", "V", "X"))
    else if (number < 100) toRoman1To9(number / 10, ("X", "L", "C")) + toRoman(number % 10)
    else if (number < 1000) toRoman1To9(number / 100, ("C", "D", "M")) + toRoman(number % 100)
    else "M" * (number / 1000) + toRoman(number % 1000)
  }

  def toRoman1To9(number: Int, signs: (String, String, String)): String = {
    if (number == 0) ""
    else if (number <= 3) signs._1.toString * number
    else if (number < 5) signs._1 + signs._2
    else if (number == 5) signs._2
    else if (number <= 8) signs._2 + signs._1 * (number - 5)
    else signs._1 + signs._3
  }
}
