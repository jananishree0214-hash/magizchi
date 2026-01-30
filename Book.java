class Book
{
	int bookID;
	String title;
	String author;
	boolean isAvailable;
	
	Book(int id,String title,String author)
	{
		this.bookID = id;
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	void display()
	{
		System.out.println("ID:"+ bookID);
		System.out.println("Title:"+ title);
		System.out.println("Author:"+ author);
		System.out.println("isAvailable:"+ isAvailable);
		
	}
	void borrowBook()
	{
		if (isAvailable)
		{
			isAvailable = false;
			System.out.println("Book is borrowed sucessfully!");
		}
		else
		{
			System.out.println("Book is already borrowed");
		}
	}
	void returnBook ()
	{
		isAvailable = true;
		System.out.println("Book is returned sucessfully!");
		
	}
	
}