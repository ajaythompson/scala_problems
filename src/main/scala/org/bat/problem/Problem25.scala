package org.bat.problem

object Problem25 extends App {
	def randomPermute[A](list: List[A]): List[A] = {
		
		if(list.isEmpty) Nil else {
			val element = Problem23.randomSelect(1, list).head
			element :: randomPermute(list.filter(_ != element)) 
		}
	}
	println(randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)))
}