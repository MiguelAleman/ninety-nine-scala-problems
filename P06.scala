/**
 * Find out whether a list is a palindrome.
 */
 object P06 {

 	def isPalindrome[A](ls: List[A]): Boolean = ls == ls.reverse
 }