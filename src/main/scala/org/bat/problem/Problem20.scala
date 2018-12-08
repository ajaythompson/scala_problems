package org.bat.problem

object Problem20 extends App {
	def removeAt[A](x: Int, list: List[A]) = {
		val part = list.zipWithIndex.partition(_._2 != x)
		(part._1.map(_._1), part._2.head._1)
	}
	println(removeAt(1, List('a, 'b, 'c, 'd)))
}