package org.bat.problem

object Problem14 extends App {
	def duplicate[A](list: List[A]): List[A] = list.flatMap(x => List(x,x))

	println(duplicate(List('a, 'b, 'c, 'c, 'd)))
}