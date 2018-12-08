package org.bat.problem

object Problem18 extends App {
	def slice[A](from: Int, to: Int, list: List[A]): List[A] = {
		list.zipWithIndex.partition(x => x._2 > from - 1 && x._2 < to)._1.map(_._1)
	}

	println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
}