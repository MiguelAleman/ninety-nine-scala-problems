/**
 * Split a list into two parts.
 */
object P17 {

	def split1[A](n: Int, ls: List[A]): (List[A], List[A]) = ls.splitAt(n)

	def split2[A](n: Int, ls: List[A]): (List[A], List[A]) = (ls.take(n) -> ls.drop(n))
}