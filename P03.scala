/**
 * Find the Kth element of a list.
 * By convention, the first element in the list is element 0.
 */
object P03 {

	// Builtin
	def nth1[A](k: Int, ls: List[A]): A = 
		if (k >= 0) ls(k)
		else  throw new NoSuchElementException

	// Recursive
	def nth2[A](k: Int, ls: List[A]): A = (k, ls) match {
		case (0, h :: _) => h
		case (k, _ :: tail) => nth2(k - 1, tail)
		case (_, Nil) => throw new NoSuchElementException
	}
}