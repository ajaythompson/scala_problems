package org.bat.problem

object Problem12 extends App {
	def decode[A](list: List[(Int, A)]): List[A] = list.flatMap(x => List.fill(x._1)(x._2))
	println(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
}