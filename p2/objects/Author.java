package objects;

public class Author {
    private String name, email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Author [email=" + email + ", gender=" + gender + ", name=" + name + "]";
    }
}
