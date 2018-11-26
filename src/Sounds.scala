/**
  * Describes vowel sounds.
  *
  * Height is first formant of the vowel, a note + harmonic resonance, consistent with placement of tongue in relation
  * to palate and jaw.
  * height ∈ { 'close, 'near_close, 'close_mid, 'mid, 'open_mid, 'near_open, 'open }
  *
  * Backness is named for the position of the tongue during the articulation of a vowel relative to the back of the
  * mouth.
  * backness  ∈ { 'front, 'central, 'back }
  *
  * Rounding refers to the shape of the lips.
  * rounding ∈ { 'rounded, 'unrounded, 'any }
  */
case class Vowel (symbol: String, height: Symbol, backness: Symbol, rounding: Symbol) {

}

/**
  * IPA: Vowels
  *             front          central       back
  *
  * close        i•y──────────────ï•ü─────────ɯ•u
  *                ╲               │           │
  * near close      ╲  ɪ•ʏ        ɪ̈•ʊ̈     ɯ̞•ʊ  │
  *                  ╲             │           │
  * close mid        e•ø──────────ë•ö─────────ɤ•o
  *                    ╲           │           │
  * mid                e̞•ø̞         ə          ɤ̞•o̞
  *                      ╲         │           │
  * open mid             ɛ•œ──────ɜ•ɞ─────────ʌ•ɔ
  *                        ╲       │           │
  * near open               æ      ɐ           │
  *                          ╲     │           │
  * open                     a•ɶ──ä•ɒ̈─────────ɑ•ɐ
  */
object Vowel {
  val i  = Vowel(symbol="i",  height='close,      backness='front,   rounding='unrounded)
  val y  = Vowel(symbol="y",  height='close,      backness='front,   rounding='rounded)
  val ï  = Vowel(symbol="ï",  height='close,      backness='central, rounding='unrounded)
  val ü  = Vowel(symbol="ü",  height='close,      backness='central, rounding='rounded)
  val ɯ  = Vowel(symbol="ɯ",  height='close,      backness='back,    rounding='unrounded)
  val u  = Vowel(symbol="u",  height='close,      backness='back,    rounding='rounded)

  val ɪ  = Vowel(symbol="ɪ",  height='near_close, backness='front,   rounding='unrounded)
  val ʏ  = Vowel(symbol="ʏ",  height='near_close, backness='front,   rounding='rounded)
  val ɪ̈ = Vowel(symbol="ɪ̈",  height='near_close, backness='central, rounding='unrounded)
  val ʊ̈ = Vowel(symbol="ʊ̈",  height='near_close, backness='central, rounding='rounded)
  val ɯ̞ = Vowel(symbol="ɯ̞", height='near_close, backness='back,    rounding='unrounded)
  val ʊ  = Vowel(symbol="ʊ",  height='near_close, backness='back,    rounding='rounded)

  val e  = Vowel(symbol="e",  height='close_mid,  backness='front,   rounding='unrounded)
  val ø  = Vowel(symbol="ø",  height='close_mid,  backness='front,   rounding='rounded)
  val ë  = Vowel(symbol="ë",  height='close_mid,  backness='central, rounding='unrounded)
  val ö  = Vowel(symbol="ö",  height='close_mid,  backness='central, rounding='rounded)
  val ɤ  = Vowel(symbol="ɤ",  height='close_mid,  backness='back,    rounding='unrounded)
  val o  = Vowel(symbol="o",  height='close_mid,  backness='back,    rounding='rounded)

  val e̞ = Vowel(symbol="e̞", height='mid,        backness='front,   rounding='unrounded)
  val ø̞ = Vowel(symbol="ø̞", height='mid,        backness='front,   rounding='rounded)
  val ə  = Vowel(symbol="ə",  height='mid,        backness='central, rounding='any)

  val ɤ̞ = Vowel(symbol="ɤ̞", height='mid,        backness='back,    rounding='unrounded)
  val o̞ = Vowel(symbol="o̞", height='mid,        backness='back,    rounding='rounded)

  val ɛ  = Vowel(symbol="ɛ",  height='open_mid,   backness='front,   rounding='unrounded)
  val œ  = Vowel(symbol="œ",  height='open_mid,   backness='front,   rounding='rounded)
  val ɜ  = Vowel(symbol="ɜ",  height='open_mid,   backness='central, rounding='unrounded)
  val ɞ  = Vowel(symbol="ɞ",  height='open_mid,   backness='central, rounding='rounded)
  val ʌ  = Vowel(symbol="ʌ",  height='open_mid,   backness='back,    rounding='unrounded)
  val ɔ  = Vowel(symbol="ɔ",  height='open_mid,   backness='back,    rounding='rounded)

  val æ  = Vowel(symbol="æ",  height='near_open,  backness='front,   rounding='unrounded)
  //val ɶ = new Vowel (height='near_open, backness='front, rounding='rounded);
  // a rounded version as above exists in Danish, but it's allophonic with ɶ
  val ɐ  = Vowel(symbol="ɐ",  height='near_open,  backness='central, rounding='unrounded)
  // apparently there exists a rounded veriosn of ɐ in a language called Sabiny

  val a  = Vowel(symbol="a",  height='open,       backness='front,   rounding='unrounded)
  val ɶ  = Vowel(symbol="ɶ",  height='open,       backness='front,   rounding='rounded)
  val ä  = Vowel(symbol="ä",  height='open,       backness='central, rounding='unrounded)
  val ɒ̈ = Vowel(symbol="ɒ̈",  height='open,       backness='central, rounding='rounded)
  val ɑ  = Vowel(symbol="ɑ",  height='open,       backness='back,    rounding='unrounded)
  val ɒ  = Vowel(symbol="ɒ",  height='open,       backness='back,    rounding='rounded)

  val all = Set(i, y, ï, ü, ɯ, u, ɪ, ʏ, ɪ̈, ʊ̈, ɯ̞, ʊ, e, ø, ë, ö, ɤ, o, e̞, ø̞, ə, ɤ̞, o̞,
                ɛ, œ, ɜ, ɞ, ʌ, ɔ, æ, ɐ, a, ɶ, ä, ɒ̈, ɑ, ɒ)
}

object Vowels extends App {
  for (vowel <- Vowel.all) { println(vowel) }
}

