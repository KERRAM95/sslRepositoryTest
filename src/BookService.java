public class BookService {



    public Book[] filterBooksByAuthor(Author author, Book[] books) {
     if (books ==null || author ==null) {
        return new Book[0];   
     }
     int nbBooks = 0;
     for (Book book : books) {
         if (book.hasAuthor(author)) {
             nbBooks++;
         }
        }
     Book[] filteredBooks = new Book[nbBooks];
         int index = 0;
         for (Book book2 : books) {
             if (book2.hasAuthor(author)) {
                 filteredBooks[index++]=book2;
             }
         }

         return filteredBooks;

     }
    
    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
       if (publisher==null || books==null) {
           return new Book[0];
       }
       int nbook=0;
       for (Book book : books) {
           if (book.getPublisher().equals(publisher)) {
               nbook++;
           }
       }
       int index=0;
       Book[] filteredBookByPublisher = new Book[nbook];
       for (Book book : books) {
           if (book.getPublisher().equals(publisher)) {

            filteredBookByPublisher[index++]=book;
               
           }

           
       }

       return filteredBookByPublisher;
    }
    
    // methods keeps books with publishing year inclusively. 
    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        if (books==null) {
            return new Book[0];
        }

        int nBooks=0;
        for (Book book : books) {
            if (book.getPublishingYear()==yearFromInclusively) {
                nBooks++;
            } 
        }

        int index=0;
        Book[] filteredBookByYear = new Book[nBooks];
        for (Book book : filteredBookByYear) {
            if (book.getPublishingYear()==yearFromInclusively) {
                filteredBookByYear[index++]=book;
            }
        }
        return filteredBookByYear;
    }
    
    
}
