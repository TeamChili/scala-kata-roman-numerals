import org.scalatest.{FlatSpec, Matchers}

class RomanNumeralsTest extends FlatSpec with Matchers {

  it should "return 'I' when 1 is given" in {
    RomanNumerals.toRoman(1) should be ("I")
  }

  it should "return 'V' when 5 is given" in {
    RomanNumerals.toRoman(5) should be ("V")
  }

  it should "return correct results for 1 to 9" in {
    RomanNumerals.toRoman(1) should be ("I")
    RomanNumerals.toRoman(2) should be ("II")
    RomanNumerals.toRoman(3) should be ("III")
    RomanNumerals.toRoman(4) should be ("IV")
    RomanNumerals.toRoman(5) should be ("V")
    RomanNumerals.toRoman(6) should be ("VI")
    RomanNumerals.toRoman(7) should be ("VII")
    RomanNumerals.toRoman(8) should be ("VIII")
    RomanNumerals.toRoman(9) should be ("IX")
  }

  it should "return 'X' when 10 is given" in {
    RomanNumerals.toRoman(10) should be ("X")
  }

  it should "return correct results for 11 to 49" in {
    RomanNumerals.toRoman(11) should be ("XI")
    RomanNumerals.toRoman(12) should be ("XII")
    RomanNumerals.toRoman(13) should be ("XIII")
    RomanNumerals.toRoman(14) should be ("XIV")
    RomanNumerals.toRoman(15) should be ("XV")
    RomanNumerals.toRoman(16) should be ("XVI")
    RomanNumerals.toRoman(17) should be ("XVII")
    RomanNumerals.toRoman(18) should be ("XVIII")
    RomanNumerals.toRoman(19) should be ("XIX")
    RomanNumerals.toRoman(20) should be ("XX")
    RomanNumerals.toRoman(30) should be ("XXX")
    RomanNumerals.toRoman(40) should be ("XL")
    RomanNumerals.toRoman(41) should be ("XLI")
    RomanNumerals.toRoman(42) should be ("XLII")
    RomanNumerals.toRoman(43) should be ("XLIII")
    RomanNumerals.toRoman(44) should be ("XLIV")
    RomanNumerals.toRoman(45) should be ("XLV")
    RomanNumerals.toRoman(46) should be ("XLVI")
    RomanNumerals.toRoman(47) should be ("XLVII")
    RomanNumerals.toRoman(48) should be ("XLVIII")
    RomanNumerals.toRoman(49) should be ("XLIX")
  }

  it should "return 'L' when 50 is given" in {
    RomanNumerals.toRoman(50) should be ("L")
  }

  it should "return correct results for 51 to 99" in {
    RomanNumerals.toRoman(51) should be ("LI")
    RomanNumerals.toRoman(52) should be ("LII")
    RomanNumerals.toRoman(53) should be ("LIII")
    RomanNumerals.toRoman(54) should be ("LIV")
    RomanNumerals.toRoman(55) should be ("LV")
    RomanNumerals.toRoman(56) should be ("LVI")
    RomanNumerals.toRoman(57) should be ("LVII")
    RomanNumerals.toRoman(58) should be ("LVIII")
    RomanNumerals.toRoman(59) should be ("LIX")
    RomanNumerals.toRoman(60) should be ("LX")
    RomanNumerals.toRoman(70) should be ("LXX")
    RomanNumerals.toRoman(80) should be ("LXXX")
    RomanNumerals.toRoman(90) should be ("XC")
    RomanNumerals.toRoman(91) should be ("XCI")
    RomanNumerals.toRoman(92) should be ("XCII")
    RomanNumerals.toRoman(93) should be ("XCIII")
    RomanNumerals.toRoman(94) should be ("XCIV")
    RomanNumerals.toRoman(95) should be ("XCV")
    RomanNumerals.toRoman(96) should be ("XCVI")
    RomanNumerals.toRoman(97) should be ("XCVII")
    RomanNumerals.toRoman(98) should be ("XCVIII")
    RomanNumerals.toRoman(99) should be ("XCIX")
  }

  it should "return 'C' when 100 is given" in {
    RomanNumerals.toRoman(100) should be ("C")
  }

  it should "return correct results for 101 to 499" in {
    RomanNumerals.toRoman(121) should be ("CXXI")
    RomanNumerals.toRoman(263) should be ("CCLXIII")
    RomanNumerals.toRoman(384) should be ("CCCLXXXIV")
    RomanNumerals.toRoman(445) should be ("CDXLV")
  }

  it should "return 'D' when 500 is given" in {
    RomanNumerals.toRoman(500) should be ("D")
  }

  it should "return correct results for 501 to 999" in {
    RomanNumerals.toRoman(592) should be ("DXCII")
    RomanNumerals.toRoman(673) should be ("DCLXXIII")
    RomanNumerals.toRoman(720) should be ("DCCXX")
    RomanNumerals.toRoman(839) should be ("DCCCXXXIX")
    RomanNumerals.toRoman(999) should be ("CMXCIX")
  }

  it should "return 'M' when 1000 is given" in {
    RomanNumerals.toRoman(1000) should be ("M")
  }

  it should "return correct results for number > 1000" in {
    RomanNumerals.toRoman(1675) should be ("MDCLXXV")
    RomanNumerals.toRoman(2000) should be ("MM")
    RomanNumerals.toRoman(2987) should be ("MMCMLXXXVII")
    RomanNumerals.toRoman(3000) should be ("MMM")
    RomanNumerals.toRoman(3999) should be ("MMMCMXCIX")
    RomanNumerals.toRoman(21123) should be ("MMMMMMMMMMMMMMMMMMMMMCXXIII")
  }
}
