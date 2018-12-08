package org.bat.problem

object Problem22 extends App {
	def range(start: Int, end: Int): List[Int] = (start, end) match {
		case (x,y) if x > y => Nil
		case (x,y) if x <= y => x :: range(x+1, y)	
	}
	println(range(4, 9))
}