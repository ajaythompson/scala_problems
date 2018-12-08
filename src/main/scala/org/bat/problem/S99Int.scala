package org.bat.problem

class S99Int(val start: Int) {
    import S99Int._

    def isPrime: Boolean = (start > 1) && (primes takeWhile { _ <= Math.sqrt(start) } forall { start % _ != 0 })

    def isCoprimeTo(x: Int) = gcd(start, x) == 1
  }

object S99Int extends App{
    implicit def int2S99Int(i: Int): S99Int = new S99Int(i)

    val primes = Stream.cons(2, Stream.from(3, 2) filter { _.isPrime })

    def gcd(m: Int, n: Int): Int = if(n == 0) m else gcd(n, m %  n)

    println(35.isCoprimeTo(64))
 }