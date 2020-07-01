package Books;


import java.util.*;

 
public class BookAction implements Actions{

     public static ArrayList<Books> book= new ArrayList<>();//kütüphanedeki tüm kitaplar için
     public static ArrayList<String> bName= new ArrayList<>();
    
      
     
    public static void addBook(Books b) {
      book.add(b);
    }

    public static boolean removeBook(int id) {
       book.remove(id);
       return true;
    }
   
    @Override
    public String alphabeticalSorting() {
          for (int i = 0; i < book.size(); i++) {
            bName.add(book.get(i).getBookName()+"---> Id: "+String.valueOf(book.get(i).getBookId()));
        }
        Collections.sort(bName);
       
        String output="";
        for (int i = 0; i < book.size(); i++) {
            output+=bName.get(i)+"\n";
        }
        return output;
    }
    

    @Override
    public Books searchBook(int id) {
     
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getBookId()== id) {
                return book.get(i);
            }
        }
        return null;
    }
    
    

    @Override
    public void getAllBooks() {
        for (int i = 0; i < book.size(); i++) {
            System.out.println(book.get(i).toString());
        }
    }

}
