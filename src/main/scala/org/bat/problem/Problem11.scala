package org.bat.problem

object Problem11 extends App {

	def encodeModified[A](list: List[A]): List[Any] = {
		Problem9.pack(list).map(x => {
			val len = x.length
			if(len == 1) x.head else (len, x.head)
		}
	)
	}
	
	println(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}