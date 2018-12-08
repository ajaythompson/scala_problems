package org.bat.problem

import scala.util.Random

object Problem24 extends App {
	def lotto(size: Int, range: Int): List[Int] = {

		val random = new Random()

		def lottoR(sizeR: Int, result: List[Int]): List[Int] = sizeR match {
			case x if x <= 0 => result
			case x => 
				val element = random.nextInt(range)
				if(result.contains(element)) lottoR(sizeR, result) else lottoR(sizeR - 1, element :: result)
		}
		lottoR(size, List())
	}
	println(lotto(6, 49))
}