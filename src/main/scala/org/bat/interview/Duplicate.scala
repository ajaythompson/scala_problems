package org.bat.interview

object Duplicate extends App {
	def hasDuplicate[A](list: List[A]) = {
		! list.groupBy(x => x).map(_._2.length).forall(_ < 2)
	}

	println(hasDuplicate(List(1,2,3)))
}