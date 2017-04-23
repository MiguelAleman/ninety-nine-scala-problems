/**
 * Duplicate the elements of a list a given number of times.
 */
object P15 {

	def duplicateN[A](n: Int, ls: List[A]): List[A] = {
		ls.flatMap{e => List.fill(n)(e)}
	}
}