package org.bat.problem

object Problem27 extends App {
	def group[A](nList: List[Int], list: List[A]): List[List[Any]] = nList match {
		case Nil => List(Nil)
		case x :: tail => Problem26.combinations(x, list).flatMap(cl => group(tail, list.diff(cl)).map(x => cl :: x) )
	}

	println(group(List(2,3), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")))
}