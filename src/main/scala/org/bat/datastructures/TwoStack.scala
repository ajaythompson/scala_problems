package org.bat.datastructures

class TwoStack[A]( n: Int) (implicit c: ClassManifest[A]){

	private val input = new Array[A](n)
	private var head1 = -1
	private var head2 = -1

	def push1(a: A): Unit = {
		println("push1" + (head1, head2))
		
		head1 match {
			case -1 => head1 = n/2
			case 0 => head1 = n - 1
			case _ => head1 = head1 - 1
		}

		if(head1 == head2) throw new StackOverFlowException("")
		else {
			input(head1) = a
		}
	}

	def push2(a: A): Unit = {
		println("push2" + (head1, head2))

		head2 match {
			case -1 => head2 = n/2 + 1
			case x if x == n -1 => head2 = 0
			case _ => head2 = head2 + 1
		}

		if(head1 == head2) throw new StackOverFlowException("")	
		else input(head2) = a
	}

	def pop1: A = {
		if(head1 == -1) throw new StackUnderFlowException("")
		else {
			head1 = head1 + 1
			val output = head1
			if(head1 == n/2 + 1) head1 = -1
			input(output -1)
		}	
	}

	def pop2: A = {
		if(head2 == -1) throw new StackUnderFlowException("")
		else {
			head2 = head2 - 1
			val output = head2
			if(head2 == n/2) head2 = -1
			input(output + 1)
		}	
	}

	override def toString: String = input.mkString("Array(", ",", ")")
}

class StackOverFlowException(s: String) extends Exception(s)
class StackUnderFlowException(s: String) extends Exception(s)

object TwoStack extends App{
	//def apply[A](n: Int) = new TwoStack[A](n)
	
	val twoStack = new TwoStack[Int](5)
	twoStack.push1(5)
	println(twoStack)
	twoStack.push2(6)
	println(twoStack)
	twoStack.push1(5)
	println(twoStack)
	twoStack.push1(6)
	println(twoStack)
	twoStack.push1(9)
	println(twoStack)
	println("popped " + twoStack.pop1)
	println(twoStack)
	twoStack.push1(10)
	println(twoStack)
}
