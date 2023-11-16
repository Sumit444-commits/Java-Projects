import java.util.*;

class PizzaOrder {
    private PizzaShop orderFrom;
    private String[] pizzaSelected;
    private int totalAmount;
    private float deliveryTime;

    public PizzaOrder(PizzaShop orderFrom) {
        this.orderFrom = orderFrom;
    }

    public void displayFlavour() {
        orderFrom.displayFlavourswithPrice();
    }

    public void makeOrder(String... pizzaFlavours) {
        this.pizzaSelected = pizzaFlavours;
    }

    public void calculateTotalAmount() {
        this.totalAmount = orderFrom.calculateAmount(pizzaSelected);
    }

    public void printOrder() {
        orderFrom.print();
        for (int i = 0; i < pizzaSelected.length; i++) {
            System.out.println("Pizza selected " + pizzaSelected[i]);
        }
        System.out.println("Total Amount " + totalAmount);
        System.out.println("Delivery Time " + deliveryTime);
    }

}

class PizzaShop {
    private String shopName;
    private ArrayList<Pizza> flavoursOffered = new ArrayList<>();
    private int phoneNo;

    public PizzaShop(String shopName, ArrayList<Pizza> flavoursOffered, int phoneNo) {
        this.shopName = shopName;
        this.flavoursOffered = flavoursOffered;
        this.phoneNo = phoneNo;
    }

    public void displayFlavourswithPrice() {
        for (int i = 0; i < flavoursOffered.size(); i++) {
            System.out.println(i + ". " + flavoursOffered.get(i).getFlavour());
            System.out.println("Price " + flavoursOffered.get(i).getPrice());
        }
    }

    public int calculateAmount(String[] pizzas) {
        int amount = 0;
        for (int i = 0; i < flavoursOffered.size(); i++) {
            for (int j = 0; j < pizzas.length; j++) {
                if (flavoursOffered.get(i).getFlavour().equals(pizzas[j])) {
                    amount += flavoursOffered.get(i).getPrice();
                }
            }
        }
        return amount;
    }

    public void print() {
        System.out.println("Shop Name : " + this.shopName);
        System.out.println("Phone Number : " + this.phoneNo);

    }

}

class Pizza {
    private String flavour;
    private int price;

    public Pizza(String flavour, int price) {
        this.flavour = flavour;
        this.price = price;
    }

    public String getFlavour() {
        return flavour;
    }

    public int getPrice() {
        return price;
    }

}

public class Mids {

    public static void main(String[] args) {
        String[] flavour = {"A","B","C","D"};
  
       Pizza obj1 = new Pizza("A",100);
       Pizza obj2 = new Pizza("B",150);
       Pizza obj3 = new Pizza("C",200);
       Pizza obj4 = new Pizza("D",300);
        ArrayList<Pizza> list=new ArrayList<Pizza>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
String[] select = {"A","C"};

        PizzaShop ps1 =new PizzaShop("hoto", list,02312312);
        PizzaShop ps2 =new PizzaShop("hoto", list,02312312);

        PizzaOrder po =new PizzaOrder(ps2);
        PizzaOrder po2 =new PizzaOrder(ps2);
        po.displayFlavour();
        po.makeOrder(select);
        po.calculateTotalAmount();
        po.printOrder();

       
    }
}
