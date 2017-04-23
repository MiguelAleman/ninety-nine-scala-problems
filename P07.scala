/**
 * Flatten a nested list structure.
 */
object P07 {

 	def flatten(ls: List[Any]): List[Any] = ls flatMap {
 		case sb: List[Any] => flatten(sb)
 		case li => List(li)
 	}
}