package org.bat.problem

object Problem9 extends App {
	
	def pack[A](list: List[A]): List[List[A]] = {
		if(list == Nil) List(List())
		else {
			val (packed, next) = list.span(_ == list.head)
			if(next == Nil) List(packed)
			else packed :: pack(next)
		}
	}

	println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}