object Main {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    def E(c: Char, key: Int, a: String) = a((a.indexOf(c.toUpper) + key) % a.size)
    def D(c: Char, key: Int, a: String) = a((a.indexOf(c.toUpper) - key) % a.size)

    def cipher(algo: (Char, Int, String) => Char, s: String, key: Int, a: String) = s.map(algo(_, key, a))
    def p(s: String, c: Int) = println((s.indexOf(c) + 5) % s.size)
    def main(args: Array[String]) = {
        val ct = cipher(E, "Hello World", 5, alphabet)
        println(ct)
        val pt = cipher(D, ct, 5, alphabet)
        println(pt)
        
    }
}