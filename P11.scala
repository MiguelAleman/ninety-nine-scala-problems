/**
 * Modified run-length encoding.
 * Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into 
 * the result list. Only elements with duplicates are transferred as (N, E) terms.
 */
object P11 {
	def encodeModified[A](ls: List[A]): List[Any] = P10.encode(ls).map {
		e => e match {
			case (1, _) => e._2
			case _ => e
		}
	}
}
