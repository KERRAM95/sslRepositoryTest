import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Book {

    private int id;
    private String name;
    private Author[] authors;
    private Publisher publisher;
    private int publishingYear;
    private int amountOfPages;
    private BigDecimal price;
    private CoverType type;
    private CoverType type2;



public Book(int id, String name, Author[] authors, Publisher publisher,
			int publishingYear, int amountOfPages, BigDecimal price,
			CoverType Type) {
		super();
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.publishingYear = publishingYear;
		this.amountOfPages = amountOfPages;
		this.price = price;
        type2 = Type;
		this.type = Type;
	}

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }
    public Author[] getAuthors() {
        return authors;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    public Publisher getPublisher() {
        return publisher;
    }    
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }
    
    public int getAmountOfPages() {
        return amountOfPages;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getPrice() {
        return price;
    }
    
    public void setType(CoverType type) {
        this.type = type;
    }
    
    public CoverType getType() {
        return type;
    }

     

     @Override
     public int hashCode() {
         final int prime=31;
         int result=1;
         result = prime * result + Arrays.hashCode(authors);
         result = prime * result + Objects.hash(amountOfPages,type, id, name, publisher, publishingYear, price);
          
         return result ;
     }
 @Override
 public boolean equals(Object obj) {
     if (this == obj)
     return true;      
     if (getClass() != obj.getClass())
     return false;
     
     Book other = (Book) obj;
     return id==other.id && amountOfPages == other.amountOfPages
     && Arrays.equals(authors, other.authors)
     && Objects.equals(publisher,  other.publisher)
     && Objects.equals(price, price)
     && publishingYear == other.publishingYear;
 }

 public boolean hasAuthor(Author author)
 {
    for (Author aut : authors) {
        if (aut.equals(author)) {
            return true; 
        }
    }
    return false;
 }





















 


    
}
