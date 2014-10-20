package com.davidrt.chapter_one.exercises;
/*
 * INFO: The task is rearrange the code snippets that produce the next output: "a-b c-d".
 */

public class Shuffle1 {

	
	public static void main(String[] args) {
		int x = 3;
		
		while ( x > 0 ){
			
			if ( x > 2 ){
				System.out.print("a");
			}
			
			x = x -1;
			System.out.print("-");
			
			if ( x == 2 ){
				System.out.print("b c");
			}
			
			if ( x == 1 ){
				System.out.print("d");
				x = x -1;
			}
			
		} // end while loop.
	}

}
