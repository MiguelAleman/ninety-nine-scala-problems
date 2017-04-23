/**
 * Reverse a list.
 */
object P05 {

 	// Builtin
	def reverse1[A](ls: List[A]): List[A] = ls.reverse

 	// Recursive
	def reverse2[A](ls: List[A]): List[A] = ls match {
 		case Nil => Nil
 		case h :: tail => reverse2(tail) :+ h
 	}

 	// Pure Functional
 	def reverse3[A](ls: List[A]): List[A] = ls.foldLeft(List[A]()){(r, h) => h +: r}
}