package org.bat.problem

object Problem19 extends App {
	def rotate[A](n: Int, list: List[A]) = {
		val split = list.splitAt(if(n > 0) n else list.length + n)
		split._2 ::: split._1
	}
	println(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
}