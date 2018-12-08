package org.bat.problem

object Problem26 extends App {

	def combinations[A](n: Int, list: List[A]): List[List[A]] = {

		def combinationsRecur(listR: List[A], result: List[List[A]]): List[List[A]] = listR match {
			case x :: tail if tail.length < n - 1 => result
			case x :: tail => combinationsRecur(tail, result ::: combinationsSingle(x, tail))
		}

		def combinationsSingle(first: A, tail: List[A]): List[List[A]] = {
			if(tail.length < n - 1) Nil
			else (first :: tail.take(n - 1)) :: combinationsSingle(first, tail.tail)
		} 

		combinationsRecur(list, List())
	}
	println(combinations(6, List('a, 'b, 'c, 'd, 'e, 'f)))
	
}