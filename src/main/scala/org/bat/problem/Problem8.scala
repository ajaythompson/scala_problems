package org.bat.problem

object Problem8 extends App {
	def compress[A](list: List[A]): List[A] = {
		list.foldRight(List[A]()){(x,y) => 
			if(y.isEmpty || x != y.head) x :: y else y
		}
	}

	println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}