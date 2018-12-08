package org.bat.problem

import scala.collection.SortedMap

object Problem28 extends App {

	def lsort[A](list: List[List[A]]): List[List[A]] = {
		list.sortBy(x => x.length)
	}
	println(lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))))

	def lsortFreq[A](list: List[List[A]]) = {
		list.groupBy(x => x.length).map(_._2).toList.sortBy(x => x.length).flatten
	}

	println(lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))))

}