package org.bat.datastructures

import scala.reflect.ClassTag

class Queue[T](n: Int)(implicit m: ClassTag[T]){
	
	val input = new Array[T](n)
	var head = 0
	var tail = 0

	def enqueue(t: T): Unit = {
		input(tail) = t
		tail = tail + 1
	}

	def dequeue(): T = {
		head = head + 1
		input(head - 1)
	}

	override def toString = input.mkString("Queue(", ",", ")")
}

object Queue extends App {
	def apply(n: Int) = new Queue(n)

	val queue = Queue(5)
	println(queue)

}