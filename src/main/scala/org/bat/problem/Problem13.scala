package org.bat.problem

object Problem13 extends App {

	def encodeDirect[A](list: List[A]): List[(Int, A)] = list match {
		case Nil => Nil
		case x => {
			val (a,b) = x.span(_ == x.head)
			List((a.length, a.head)) ::: encodeDirect(b)
		} 
	}

	println(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))) 
}