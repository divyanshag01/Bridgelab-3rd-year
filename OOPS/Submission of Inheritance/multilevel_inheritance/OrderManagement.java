class Order{
    int orderId;String orderDate;
    Order(int i,String d){orderId=i;orderDate=d;}
    String getOrderStatus(){return "Order placed";}
}
class ShippedOrder extends Order{
    String trackingNumber;
    ShippedOrder(int i,String d,String t){super(i,d);trackingNumber=t;}
    String getOrderStatus(){return "Order shipped";}
}
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    DeliveredOrder(int i,String d,String t,String dd){super(i,d,t);deliveryDate=dd;}
    String getOrderStatus(){return "Order delivered";}
}
public class OrderManagement{
    public static void main(String[] args){
        Order o=new DeliveredOrder(1,"2025-09-01","TRK123","2025-09-05");
        System.out.println(o.getOrderStatus());
    }
}