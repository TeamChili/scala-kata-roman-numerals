
object RomanNumerals {

  def toRoman(number: Int): String = {
    number match {
      case n if n < 10 => toRoman0To9(number, ("I", "V", "X"))
      case n if n < 100 => toRoman0To9(number / 10, ("X", "L", "C")) + toRoman(number % 10)
      case n if n < 1000 => toRoman0To9(number / 100, ("C", "D", "M")) + toRoman(number % 100)
      case _ => "M" * (number / 1000) + toRoman(number % 1000)
    }
  }

  def toRoman0To9(number: Int, numerals: (String, String, String)): String = {
    number match {
      case n if n == 0 => ""
      case n if n <= 3 => numerals._1.toString * number
      case n if n < 5 => numerals._1 + numerals._2
      case n if n == 5 => numerals._2
      case n if n <= 8 => numerals._2 + numerals._1 * (number - 5)
      case _ => numerals._1 + numerals._3
    }
  }
}
