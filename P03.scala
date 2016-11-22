// Find the Kth element of a list.
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