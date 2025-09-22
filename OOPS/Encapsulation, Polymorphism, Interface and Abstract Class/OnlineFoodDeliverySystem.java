import java.util.*;
abstract class FoodItem{
    private String itemName;
    private double price;
    private int quantity;
    FoodItem(String itemName,double price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
    public String getItemName(){return itemName;}
    public double getPrice(){return price;}
    public int getQuantity(){return quantity;}
    public void setQuantity(int q){this.quantity=q;}
    public String getItemDetails(){return itemName+" x"+quantity+" @"+price;}
    public abstract double calculateTotalPrice();
}
interface Discountable{
    double applyDiscount();
    String getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable{
    public VegItem(String name,double price,int qty){super(name,price,qty);}
    public double calculateTotalPrice(){return getPrice()*getQuantity();}
    public double applyDiscount(){return calculateTotalPrice()*0.05;}
    public String getDiscountDetails(){return "Veg 5%";}
}
class NonVegItem extends FoodItem implements Discountable{
    public NonVegItem(String name,double price,int qty){super(name,price,qty);}
    public double calculateTotalPrice(){return getPrice()*getQuantity()+50;}
    public double applyDiscount(){return calculateTotalPrice()*0.03;}
    public String getDiscountDetails(){return "NonVeg 3% + 50 extra";}
}
public class OnlineFoodDeliverySystem{
    public static void main(String[] args){
        List<FoodItem> order=new ArrayList<>();
        order.add(new VegItem("Paneer Butter Masala",250,2));
        order.add(new NonVegItem("Chicken Biryani",300,1));
        double total=0;
        for(FoodItem f:order){
            double price=f.calculateTotalPrice();
            double discount=0;
            String dDetails="";
            if(f instanceof Discountable){
                Discountable d=(Discountable)f;
                discount=d.applyDiscount();
                dDetails=d.getDiscountDetails();
            }
            double finalPrice=price-discount;
            System.out.println(f.getItemDetails()+" Price:"+price+" Discount:"+dDetails+"("+discount+") Final:"+finalPrice);
            total+=finalPrice;
        }
        System.out.println("Order Total: "+total);
    }
}