package org.bat.problem

object Problem5 extends App {

	def reverse[A](list: List[A]): List[A] = {
		def reverseRecur(listRecur: List[A], result: List[A]): List[A] = listRecur match {
			case x :: Nil => x :: result
			case x :: tail => reverseRecur(tail, x :: result)
			case _ => throw new NoSuchElementException
		}
		reverseRecur(list, List())
	}

	println(reverse(List(1, 1, 2, 3, 5, 8)))
}