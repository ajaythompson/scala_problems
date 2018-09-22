package org.bat.problem

object Problem2 extends App {

	def penultimate[A](input: List[A]): A = input match {

		case x :: y :: Nil => x
		case _ :: tail => penultimate(tail)
		case _ => throw new NoSuchElementException
	}

	print(penultimate(List(1, 1, 2, 3, 5, 8)))
}