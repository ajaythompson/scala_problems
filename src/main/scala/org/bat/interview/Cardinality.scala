package org.bat.interview

object Cardinality extends App {
	
	def pack(list: List[Int]): List[List[Int]] = {
		if(list == Nil) {
			List()
		} else {
			val (a, b) = list.span(x => x == list.head)
			a :: pack(b)
		}
	}

	def getCardinality(list: List[Int]) = pack(list.sorted)

	def getSubIntrray(list: List[Int]) = {

		val pack = getCardinality(list)

		val maxHits = pack.map(_.length).max

		val maxElems = pack.filter(_.length == maxHits).map(_.head)

		def getSubIntrrayR(input: List[Int], a: Int, hits: Int, start: Boolean, result: List[Int]): List[Int] = hits match {

			case 0 => result
			case x if input.head == a =>  getSubIntrrayR(input.tail, a, x - 1, true, input.head :: result)
			case x if input.head != a && ! start =>  getSubIntrrayR(input.tail, a, x, start, result)
			case x if input.head != a && start =>  getSubIntrrayR(input.tail, a, x, start, input.head :: result)
		}

		for(x <- maxElems) yield getSubIntrrayR(list, x, maxHits, false, List())

	}




	println(getSubIntrray(List(	2,3,2,2,1,1,1)))
}