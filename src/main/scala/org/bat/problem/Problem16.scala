package org.bat.problem

object Problem16 extends App {
	def drop[A](n: Int, list: List[A]):List[A] = {
		list.zipWithIndex.filter(_._2 != n - 1).map(_._1)
	}
	println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
}