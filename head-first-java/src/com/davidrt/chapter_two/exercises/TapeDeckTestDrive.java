package com.davidrt.chapter_two.exercises;

public class TapeDeckTestDrive {

	public static void main(String[] args) {

//		This won't compile because the object is not initalized.	
/*		
  		t.canRecord = true;
		t.playTape();
		
		if (t.canRecord == true){
			t.recordTape();
		}
*/
		
		TapeDeck t = new TapeDeck();
		t.canRecord = true;
		t.playTape();
		
		if (t.canRecord == true){
			t.recordTape();
		}

	}

}
