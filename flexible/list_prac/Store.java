import java.util.ArrayList;

public class Store {
    private ArrayList<Book> books;


    public Store(){
        this.books = new  ArrayList<>();
    }


    public Book getBook(int index){
        return new Book(this.books.get(index));
    }

    public void setBook(int index,Book book){
        this.books.add(index, new Book(book));
    }

    public void addBook(Book book){
        this.books.add(new Book(book));
    }

    public boolean  contains(Book book){
        return this.books.contains(book);
    }

    public void sellBook(String book){
        this.remove(book);
    }

    public boolean remove(String title ){
        for (Book book: this.books){
            if(book.getTitle().equals(title))return this.books.remove(book); 
        }

        return false;
    } 

}
