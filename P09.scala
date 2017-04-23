/**
 * Pack consecutive duplicates of list elements into sublists.
 * If a list contains repeated elements they should be placed in separate sublists.
 */
object P09 {

 	def pack[A](ls: List[A]): List[List[A]] = ls match {
 		case Nil => Nil
 		case h :: tail => (h :: tail.takeWhile(_ == h)) :: pack(tail.dropWhile(_ == h))
 	}
}