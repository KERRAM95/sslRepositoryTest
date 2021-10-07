public class Author {

    private String firstName;
    private String lastName;
    private int id;

    public Author(int id, String firstName, String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;

    }
    
    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getFirstName()
    {
        return this.firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {

        return " author [id= "+this.id+ ", " 
        +", firstName="+this.firstName
        +", lastName="+this.lastName+" ]";
    }






    
}
