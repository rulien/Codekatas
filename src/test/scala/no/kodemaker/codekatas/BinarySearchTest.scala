package no.kodemaker.codekatas

import org.scalatest.Spec
import org.scalatest.matchers.MustMatchers
import no.kodemaker.codekatas.BinarySearch.chop

class BinarySearchTest extends Spec with MustMatchers {
  describe("A chop") {
    it("should give -1 if array is empty") {
	  chop(3,new Array[Int](0)) must be === -1
    }

	
	it("should give the correct value for a search"){
	  chop(-1, Array(1)) must be === -1
	  chop(3, Array(1)) must be === -1
	  chop(1, Array(1)) must be === 0
    
	  chop(1, Array(1, 3, 5)) must be === 0
      chop(3, Array(1, 3, 5)) must be === 1  
  	  chop(5, Array(1, 3, 5)) must be === 2
      chop(0, Array(1, 3, 5)) must be === -1
      chop(2, Array(1, 3, 5)) must be === -1
      chop(4, Array(1, 3, 5)) must be === -1
      chop(6, Array(1, 3, 5)) must be === -1
 
      chop(1, Array(1, 3, 5, 7)) must be === 0
      chop(3, Array(1, 3, 5, 7)) must be === 1
      chop(5, Array(1, 3, 5, 7)) must be === 2
      chop(7, Array(1, 3, 5, 7)) must be === 3
      chop(0, Array(1, 3, 5, 7)) must be === -1
      chop(2, Array(1, 3, 5, 7)) must be === -1
      chop(4, Array(1, 3, 5, 7)) must be === -1
      chop(6, Array(1, 3, 5, 7)) must be === -1
      chop(8, Array(1, 3, 5, 7)) must be === -1
	}
  }
}