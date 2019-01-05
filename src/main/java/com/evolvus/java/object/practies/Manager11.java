package com.evolvus.java.object.practies;

class Book{
	private String author;
	private String title;
	private String page;
	
	public Book(String author,String title,String page) {
		this.author=author;
		this.title=title;
		this.page=page;
	}
	
	@Override
	public String toString() {
		String s1=super.toString();
		s1=s1.substring(s1.indexOf('@')+1);
		String msg="This is a refernce variable of Booke type\n"+
		"It is refering to Booke type object,which is stored. \n"+
		"Stored@"+s1+"and state as follws \n"+
		 "Author:"+author+"\n"+
		 "Title:"+title+"\n"+
		 "Page:"+page+"\n";
		return msg;
	}
}
public class Manager11 {
	public static void main(String[] args) {
		Book b1=new Book("Ramesh", "Java Basics", "100");
		System.out.println(b1);
	}
}
