package org.bat.sort

object Sort extends App {
	
	def insertionSort(input: Array[Int]): Array[Int] = {

		for(j <- 1 until input.length) {
			var key = input(j)
			var i = j - 1

			while(i > -1 && input(i) > key) {
				input(i + 1) = input(i)
				i = i - 1
			}
			input(i + 1) = key
		}

		input
	}

	println(insertionSort(Array(5,1,2,3,4)).toList)
	
}