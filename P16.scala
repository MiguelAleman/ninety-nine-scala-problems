/**
 * Drop every Nth element from a list.
 */
object P16 {

 	def drop[A](n: Int, ls: List[A]): List[A] = {
 		if(ls.size < n) ls
 		else ls.take(n - 1) ++ P16.drop(n, ls.drop(n))
 	}
}