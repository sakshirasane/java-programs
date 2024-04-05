package collection;

import java.util.HashMap;

public class Book {
private int id;
private String title;


private String author;

public Book(int id,String title,String author) {
	this.id=id;
	this.title=title;
	this.author=author;
}
@Override
public String toString() {
	return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
}
        
}

 public class HashMapCrud{
 void Crud() {
	HashMap<Integer,Book> bookMap=new HashMap<Integer,Book> ();
	
	Book b1=new Book(101,"Let us C","Yashwant kanetkar");
	Book b2=new Book(102,"Data communication","Thomas");
	Book b3=new Book(103,"Operating System","Galvin");
	
	bookMap.put(b1.getId(),b1);
	bookMap.put(b2.getId(),b2);
	bookMap.put(b3.getId(),b3);
	
	Book read1=bookMap.get(101);
	Book read2=bookMap.get(102);	
	Book read3=bookMap.get(103);

	
	

}
}