package org.bat.interview

object Twins extends App {
	
	def checkTwins(str1: String, str2: String): Boolean = {

		val oe1 = getOddEven(str1)
		val oe2 = getOddEven(str2)
		
		oe1._1.sorted == oe2._1.sorted && oe1._2.sorted == oe2._2.sorted
	}

	def getOddEven(str: String) = {
		val (odd, even) = str.toCharArray.zipWithIndex.partition(_._2 % 2 == 0)
		(odd.map(_._1).toList, even.map(_._1).toList)
	}

	println(checkTwins("abcd", "cdab" ))
}