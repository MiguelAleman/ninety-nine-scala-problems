/**
 * Run-length encoding of a list.
 * Use the result of problem P09 to implement the so-called run-length encoding data compression method.
 * Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
 */
object P10 {

 	def encode[A](ls: List[A]): List[(Int, A)] = P09.pack(ls).map(e => (e.length, e.head))
}