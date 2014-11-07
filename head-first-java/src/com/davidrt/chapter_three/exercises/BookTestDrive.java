package com.davidrt.chapter_three.exercises;

public class BookTestDrive {

	public static void main(String[] args) {
		
		//This won't compile because array doesnt have any book Object.
		Books[] myBooks = new Books[3];
		int x = 0;
		
		//===== fix ======
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();
		//================
		
		myBooks[0].title = "The Grapes of Java";
		myBooks[1].title = "The Java Gatsby";
		myBooks[2].title = "The Java Cookbook";
		myBooks[0].author = "bob";
		myBooks[1].author = "sue";
		myBooks[2].author = "ian";
		
		while (x < 3){
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x = x +1;
		}

	}

}
