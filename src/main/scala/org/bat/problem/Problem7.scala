package org.bat.problem

object Problem7 extends App {

	def flatten(list: List[Any]): List[Any] = list flatMap {
		case x: List[_] => flatten(x)
		case x => List(x)
	}

	println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
}