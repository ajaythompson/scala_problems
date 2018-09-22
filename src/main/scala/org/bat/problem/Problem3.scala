package org.bat.problem

object Problem3 extends App {
	
	def nth[A](n: Int, list: List[A]):A = {

		def nthRecur(x: Int, listRecur: List[A]): A = list match{
			case Nil => throw new ArrayIndexOutOfBoundsException
			case a :: tail if x == n => a
			case a :: tail if x != n => nthRecur(x + 1, tail)
			case _ => throw new NoSuchElementException
		}

		nthRecur(0, list)
	}

	println(nth(2, List(1, 1, 2, 3, 5, 8)))
}