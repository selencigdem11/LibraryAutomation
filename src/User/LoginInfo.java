package User;



import static Books.BookAction.book;
import Books.Books;
import User.User;
import java.util.ArrayList;

 abstract class LoginInfo {
  
    static int firstId=100;
    int id=100;
    String password;

    public LoginInfo(String password) {
        this.id = firstId++;
        this.password = password;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    

    public static boolean searchUser(int sId,String sPassword) {
        
        for (int i = 0; i < User.users.size(); i++) {
            if (User.users.get(i).getId()== sId && User.users.get(i).getPassword().equals(sPassword) ) {
                return true;
            }
        }
        return false;
    }
    public static User searchUser(int sId) {
        
        for (int i = 0; i < User.users.size(); i++) {
            if (User.users.get(i).getId()== sId ) {
                return User.users.get(i);
            }
        }
        return null;
    }

   

}
