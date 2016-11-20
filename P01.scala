// Find the last element of a list.
object P01 {
	
	// Builtin
	def last1[A](ls:List[A]): A = ls.last

	// Recursive
	def last2[A](ls: List[A]): A = ls match {
		case h :: Nil => h
		case _ :: tail => last2(tail)
		case _ => throw new NoSuchElementException
	}

}