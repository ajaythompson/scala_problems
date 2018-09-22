package org.bat.interview

import scala.collection.mutable.HashMap
import scala.collection.mutable.ListBuffer

object FrquentNumbers extends App{

	def frequentNumbers[A](input: List[A]): List[A] = {

		var max = 0
		val hashMap = HashMap.empty[A, Int]
		val result = ListBuffer.empty[A]

		for(x <- input){
			hashMap.getOrElse(x, -1) match {
				case -1 if max == 0 => hashMap += (x -> 1); result += x; max = 1 
				case -1 if max > 0 =>  hashMap += (x -> 1)
				case a if a + 1 > max => result.clear; result += x; max = a + 1; hashMap.update(x, a + 1)
				case a if a + 1 == max => result += x; hashMap.update(x, a + 1)
				case _ => throw new NoSuchElementException		

			}
		}

		result.toList

	}

	println(frequentNumbers(List(1,1,2,3,4,4)))
}