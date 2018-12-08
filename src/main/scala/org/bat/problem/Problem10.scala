package org.bat.problem

object Problem10 extends App {
	def encode[A](list: List[A]) = Problem9.pack(list).map(x => (x.length, x.head))

	println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}