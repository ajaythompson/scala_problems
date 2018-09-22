package org.bat.problem

object Problem1 extends App{

	//problem1
	val input = List(1, 1, 2, 3, 5, 8)

	def last[A](input: List[A]): A = input match {

		case x :: Nil => x
		case _ :: tail => last(tail)
		case _ => throw new NoSuchElementException

	}

	println(last(input))
}

