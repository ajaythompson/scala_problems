package org.bat.problem

object Problem4 extends App {
	def length[A](input: List[A]): Int = {

		def lengthRecur(list: List[A], result: Int): Int = list match{
			case x :: Nil => result + 1
			case x :: tail => lengthRecur(tail, result + 1)
			case _ => throw new NoSuchElementException
		}

		lengthRecur(input, 0)
	}

	print(length(List(1, 1, 2, 3, 5, 8)))
}