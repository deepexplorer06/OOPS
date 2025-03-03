class book{
	public String title_of_the_book;
	public String author_of_the_book;
	public int year_of_publication;

	public book(String title_of_the_book, String author_of_the_book, int year_of_publication) {
        this.title_of_the_book = title_of_the_book;
        this.author_of_the_book = author_of_the_book;
        this.year_of_publication = year_of_publication;
    } //constructor

	public void title_of_the_book() {
		System.out.println("Title of the Book: " + title_of_the_book);
	} //method1

	public void author_of_the_book() {
		System.out.println("Author: " + author_of_the_book);
	} //method2

	public void year_of_publication() {
		System.out.println("Year of publication: " + year_of_publication);
	} //method3

} //class book

public class Main{
	public static void main(String[] args){
		book book1 = new book("Geronimo Stilton", "Geronimo Stilton", 1999);

		book1.title_of_the_book();
        	book1.author_of_the_book();
        	book1.year_of_publication();

        		System.out.println();
		
		book book2 = new book("Harry Potter", "J.K Rowling", 2001);

        	book2.title_of_the_book();
        	book2.author_of_the_book();
        	book2.year_of_publication();

        		System.out.println();


	} //psvm
} //class main