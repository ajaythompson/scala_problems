package org.bat.problem

object Problem17 extends App {
	def split[A](n: Int, list: List[A]): (List[A], List[A]) = {
		list.splitAt(n)
	}
	println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
}