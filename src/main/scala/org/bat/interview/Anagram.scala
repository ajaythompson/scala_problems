package org.bat.interview

object Anagrame extends App {

	def anagram(stringList1: Array[String], stringList2:Array[String]): Array[Int] = {
		stringList1.zip(stringList2) map {
			case (x, y) if x.length != y.length => -1
			case (x, y) => angramCompare(x, y)
			case _ => -1
		}
	}

	def angramCompare(string1: String, string2: String): Int = {
		val stringPair = string1.toCharArray.sortBy(x => x).zip(string2.toCharArray.sortBy(x => x))

		(for(x <- stringPair; if x._1 != x._2) yield 1).sum
	}


	println(anagram(Array("ajay", "thompson"), Array("yaja", "thompso")).toList)

}