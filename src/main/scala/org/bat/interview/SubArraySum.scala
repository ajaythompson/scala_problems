package org.bat.interview

object SubArraySum extends App {

	def saSum(list: List[Int]) = {
		getSubArray(list).flatten.sum
	}

	def getSubArray[A](list: List[A]) = {
		def getSubArrayR(n: Int, result: List[List[A]]): List[List[A]] = n match {
			case 0 => result
			case x => getSubArrayR(n - 1, list.combinations(x).toList ::: result)
		}

		getSubArrayR(list.length, List())
	}

	println(saSum(List(1,2,3)))
	
}