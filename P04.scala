/**
 * Find the number of elements of a list.
 */
object P04 {
 	
 	// Builtin
 	def length1[A](ls: List[A]): Int = ls.length

 	// Recursive
 	def length2[A](ls: List[A]): Int = ls match {
 		case Nil => 0
 		case _ :: tail => 1 + length2(tail)
 	}

 	// Pure Functional (c - counter)
 	def length3[A](ls: List[A]): Int = ls.foldLeft(0){(c, _) => c + 1}
}