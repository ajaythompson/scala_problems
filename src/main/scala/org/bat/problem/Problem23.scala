package org.bat.problem

import scala.util.Random

object Problem23 extends App {

	def randomSelect[A](n: Int, list: List[A]): List[A] = n match {
		case x if x <= 0 || list.isEmpty => Nil
		case x => {
			val randomIndex = new Random().nextInt(list.length)
			val element = list(randomIndex)
			element :: randomSelect(n - 1, Problem16.drop(randomIndex + 1 , list))
		}
	}
	println(randomSelect(3, List()))
}