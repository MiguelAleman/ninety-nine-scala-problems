/**
 * Run-length encoding of a list (direct solution).
 * Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); 
 * do all the work directly.
 */
object P13 {

 	def encodeDirect[A](ls: List[A]): List[(Int, A)] = {
 		ls.map{x => List(1 -> x)}.reduceLeft((a, b) => {
 			if(a.last._2 == b.head._2)
 				a.init :+ a.last._1 + 1 -> a.last._2
			else a ++ b
 		})
 	}
 }