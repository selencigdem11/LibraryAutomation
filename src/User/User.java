package User;

import Books.Books;
import java.util.ArrayList;


public class User extends LoginInfo{

    public static ArrayList<Books> getMyBooks() {
        return myBooks;
    }
    
    private String name;
    private String surname;
    private int age;
    private String gender;
    public static LoginInfo loginInfo;
    
    public static int currentId;
    public static ArrayList<User> users= new ArrayList<User>();
    private static ArrayList<Books> myBooks= new ArrayList<Books>();

    public User(String name, String surname, int age, String gender,String password) {
        super(password);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User name= " + getName() + "\nsurname= " + getSurname() + "\nage= " + getAge() + "\ngender= " + getGender();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }
     
    
    
    
}
