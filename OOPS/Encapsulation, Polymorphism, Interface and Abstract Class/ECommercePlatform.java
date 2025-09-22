import java.util.*;
abstract class Product{
    private String productId;
    private String name;
    private double price;
    Product(String productId,String name,double price){
        this.productId=productId;
        this.name=name;
        this.price=price;
    }
    public String getProductId(){return productId;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public void setProductId(String id){this.productId=id;}
    public void setName(String name){this.name=name;}
    public void setPrice(double price){this.price=price;}
    public abstract double calculateDiscount();
}
interface Taxable{
    double calculateTax();
    String getTaxDetails();
}
class Electronics extends Product implements Taxable{
    public Electronics(String id,String name,double price){super(id,name,ppriceSafe(price));}
    private static double ppriceSafe(double p){return p;}
    public double calculateDiscount(){return getPrice()*0.10;}
    public double calculateTax(){return getPrice()*0.18;}
    public String getTaxDetails(){return "GST 18%";}
}
class Clothing extends Product implements Taxable{
    public Clothing(String id,String name,double price){super(id,name,price);}
    public double calculateDiscount(){return getPrice()*0.20;}
    public double calculateTax(){return getPrice()*0.12;}
    public String getTaxDetails(){return "GST 12%";}
}
class Groceries extends Product{
    public Groceries(String id,String name,double price){super(id,name,price);}
    public double calculateDiscount(){return getPrice()*0.05;}
}
public class ECommercePlatform{
    public static void printFinalPrices(List<Product> products){
        for(Product p:products){
            double tax=0;
            String taxDetails="";
            if(p instanceof Taxable){
                Taxable t=(Taxable)p;
                tax=t.calculateTax();
                taxDetails=t.getTaxDetails();
            }
            double discount=p.calculateDiscount();
            double finalPrice=p.getPrice()+tax-discount;
            System.out.println(p.getName()+" Base: "+p.getPrice()+" Tax: "+taxDetails+"("+tax+") Discount: "+discount+" Final: "+finalPrice);
        }
    }
    public static void main(String[] args){
        List<Product> products=new ArrayList<>();
        products.add(new Electronics("E001","Smartphone",20000));
        products.add(new Clothing("C001","TShirt",799));
        products.add(new Groceries("G001","Rice",1200));
        printFinalPrices(products);
    }
}