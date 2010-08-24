package no.kodemaker.codekatas

object BinarySearch {
	def chop(searchvalue : Int, array : Array[Int]) : Int = {
		if(array.length == 0) return -1;
		for(position <- 0 to array.length-1){
	    	if(array(position) == searchvalue)return position
		}
		
		-1
	}
}