/**
 * Eliminate consecutive duplicates of list elements.
 * If a list contains repeated elements they should be replaced with a single copy of the element. 
 * The order of the elements should not be changed.
 */
 object P08 {

 	// Recursive
 	def compress1[A](ls: List[A]): List[A] = ls match {
 		case Nil => Nil
 		case h :: tail => {
 			val c = compress1(tail)
 			if(c.isEmpty || h != c.head) h +: c
 			else c
 		}
 	}

 	// Recursive (Using dropWhile)
 	def compress2[A](ls: List[A]): List[A] = ls match {
 		case Nil => Nil
 		case h :: tail => h :: compress2(tail.dropWhile(_ == h))
 	}

 	// Functional (Using foldRight)
 	def compress3[A](ls: List[A]): List[A] = ls.foldRight(List[A]()){
 		(h, r) => if (r.isEmpty || r.head != h) h :: r else r
 	}
 }