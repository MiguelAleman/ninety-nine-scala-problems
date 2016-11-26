/**
 * Find the last but one element of a list.
 */
object P02 {

	// Builtin
	def penultimate1[A](ls: List[A]): A = {
		if (ls.isEmpty) throw new NoSuchElementException 
		else ls.init.last 
	}

	// Recursive
	def penultimate2[A](ls: List[A]): A = ls match {
		case h :: _ :: Nil => h
		case _ :: tail => penultimate2(tail)
		case _ => throw new NoSuchElementException
	}
}