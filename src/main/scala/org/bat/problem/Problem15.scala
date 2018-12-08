package org.bat.problem

object Problem15 extends App {

	def duplicateN[A](n: Int, list: List[A]): List[A] = list.flatMap(List.fill(n)(_))
	println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
	
}