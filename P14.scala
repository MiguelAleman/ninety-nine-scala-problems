/**
 * Duplicate the elements of a list.
 */
object P14 {

	def duplicate[A](ls: List[A]): List[A] = {
		ls.flatMap{ e => List(e, e)}
	}
}
