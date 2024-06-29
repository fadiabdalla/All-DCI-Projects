package handling_arrayindexoutofboundsexception_exercise;

public class LibraryCatalog {
	
	private String[] bookTitles;

    public LibraryCatalog() {
        bookTitles = new String[] {"Book 1", "Book 2", "Book 3", "Book 4", "Book 5"};
    }
    
    String searchBook(int index) {
    	try {
    		
    		if (index >= 0 && index < bookTitles.length) {
    	
		return bookTitles[index];
    		 } else {
	            	throw new ArrayIndexOutOfBoundsException("Enter a number between 0 and 4 . ");
	            }
    	
    	} catch (ArrayIndexOutOfBoundsException e) {
    		
    		return e.getMessage();
    		
    	}
    }
 
}
