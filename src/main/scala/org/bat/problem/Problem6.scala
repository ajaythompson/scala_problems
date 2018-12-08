package org.bat.problem

object Problem6 extends App {

	def isPalindrome[A](list: List[A]): Boolean = list match {
		case x :: Nil => true
		case Nil => true
		case x :: tail if x == tail.last => isPalindrome(tail.init)
		case x :: tail if x != tail.last => println(x, tail.last);false
		case _ => throw new NoSuchElementException
	} 

	println(isPalindrome(List(1, 2, 3, 2, 1)))
}