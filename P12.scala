/**
 * Decode a run-length encoded list.
 * Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
 */
object P12 {

 	def decode[A](ls: List[(Int, A)]): List[A] = ls.flatMap{
 		e => for (i <- 1 to e._1) yield e._2 
 	}
}