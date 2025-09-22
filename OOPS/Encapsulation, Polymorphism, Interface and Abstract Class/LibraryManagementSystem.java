import java.util.*;
abstract class LibraryItem{
    private String itemId;
    private String title;
    private String author;
    LibraryItem(String itemId,String title,String author){
        this.itemId=itemId;
        this.title=title;
        this.author=author;
    }
    public String getItemId(){return itemId;}
    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public String getItemDetails(){return "ID:"+itemId+" Title:"+title+" Author:"+author;}
    public abstract int getLoanDuration();
}
interface Reservable{
    boolean reserveItem(String userId);
    boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable{
    private boolean available=true;
    Book(String id,String t,String a){super(id,t,a);}
    public int getLoanDuration(){return 21;}
    public boolean reserveItem(String userId){if(available){available=false;return true;}return false;}
    public boolean checkAvailability(){return available;}
}
class Magazine extends LibraryItem implements Reservable{
    private boolean available=true;
    Magazine(String id,String t,String a){super(id,t,a);}
    public int getLoanDuration(){return 7;}
    public boolean reserveItem(String userId){if(available){available=false;return true;}return false;}
    public boolean checkAvailability(){return available;}
}
class DVD extends LibraryItem implements Reservable{
    private boolean available=true;
    DVD(String id,String t,String a){super(id,t,a);}
    public int getLoanDuration(){return 3;}
    public boolean reserveItem(String userId){if(available){available=false;return true;}return false;}
    public boolean checkAvailability(){return available;}
}
public class LibraryManagementSystem{
    public static void main(String[] args){
        List<LibraryItem> items=new ArrayList<>();
        items.add(new Book("B001","Java Programming","Author A"));
        items.add(new Magazine("M001","Tech Monthly","Editor X"));
        items.add(new DVD("D001","Movie","Director Y"));
        for(LibraryItem it:items){
            System.out.println(it.getItemDetails()+" LoanDays:"+it.getLoanDuration());
            if(it instanceof Reservable){
                Reservable r=(Reservable)it;
                System.out.println("Available: "+r.checkAvailability());
                r.reserveItem("U001");
                System.out.println("Available after reserve: "+r.checkAvailability());
            }
        }
    }
}