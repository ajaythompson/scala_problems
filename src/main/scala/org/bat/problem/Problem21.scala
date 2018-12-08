package org.bat.problem

object Problem21 extends App {
	def insertAt[A](x: A, n: Int, list: List[A]): List[A] = {
		list.splitAt(n) match {
			case (pre, post) => pre ::: x :: post
		}
	}

	println(insertAt('new, 1, List('a, 'b, 'c, 'd)))
}