import java.util.ArrayList;
import java.util.Scanner;

abstract class Sellable {
    private String name;
    private int price;
    private int quantity;

    public Sellable(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract int calculateTotalCost(int quantity);

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Product extends Sellable {
    public Product(String name, int price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public int calculateTotalCost(int quantity) {
        return getPrice() * quantity;
    }
}

class Transaction {
    private int moneyInserted;
    private Sellable sellable;
    private int changeBack;

    public Transaction(int moneyInserted, Sellable sellable) {
        this.moneyInserted = moneyInserted;
        this.sellable = sellable;
    }

    public int getMoneyInserted() {
        return moneyInserted;
    }

    public void setMoneyInserted(int moneyInserted) {
        this.moneyInserted = moneyInserted;
    }

    public Sellable getSellable() {
        return sellable;
    }

    public int getChangeBack() {
        return changeBack;
    }

    public void setChangeBack(int changeBack) {
        this.changeBack = changeBack;
    }
}

public class VendingMachine {
    private ArrayList<Sellable> products;
    private int moneyCollected;

    public VendingMachine(ArrayList<Sellable> products) {
        this.products = products;
    }

    public ArrayList<Sellable> getProducts() {
        return products;
    }

    public void setProducts(Sellable product) {
        this.products.add(product);
    }

    public int getMoneyCollected() {
        return moneyCollected;
    }

    public void setMoneyCollected(int moneyCollected) {
        this.moneyCollected = moneyCollected;
    }

    public void displayProducts() {
        System.out.println("  Product Name   -->   Price    -->  Quantity Available");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + "  " + products.get(i).getName() + "    -->  " +
                    products.get(i).getPrice() + "     --> " + products.get(i).getQuantity());
        }
    }

    public void buyAgain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buy anything more (Yes/No)");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("Yes")) {
            displayProducts();
            purchase();
        } else {
            System.exit(0);
        }
    }

    public void purchase() {
        Scanner sc = new Scanner(System.in);
        if (getMoneyCollected() <= 0) {
            System.out.println("Insert Money ");
            setMoneyCollected(sc.nextInt());
        }
        System.out.println("Total Money  " + getMoneyCollected());

        System.out.println("Select Product ");
        String productName = sc.next();

        for (Sellable product : products) {
            if (productName.equalsIgnoreCase(product.getName())) {
                Transaction transaction = new Transaction(getMoneyCollected(), product);
                System.out.println("Quantity of product");
                int quantity = sc.nextInt();
                
                if (transaction.getMoneyInserted() >= product.calculateTotalCost(quantity)) {
                    if (quantity <= product.getQuantity()) {
                        product.setQuantity(product.getQuantity() - quantity);
                        transaction.setMoneyInserted(
                                transaction.getMoneyInserted() - product.calculateTotalCost(quantity));

                        System.out.println("\nProduct Name : " + product.getName() + " \nPrice  : " + product.getPrice()
                                + "\nBuying quanitity : " + quantity);

                        System.out.println("Your Change Back " + transaction.getMoneyInserted());
                        setMoneyCollected(0);
                        System.out.println("Thanks for buying");
                        buyAgain();
                    } else {
                        System.out.println("Product less available");
                        System.out.println("Your Change Back " + transaction.getMoneyInserted());
                        System.exit(0);
                    }
                } else {
                    System.out.println("Low amount");
                    System.out.println("Your Change Back " + transaction.getMoneyInserted());
                    System.exit(0);
                }
            }
        }

        System.out.println("Product not found");
        System.out.println("Your Change Back " + getMoneyCollected());
        System.exit(0);
    }

    public static void main(String[] args) {
        ArrayList<Sellable> products = new ArrayList<>();
        products.add(new Product("Snacks", 10, 20));
        products.add(new Product("Drinks", 20, 12));
        products.add(new Product("Candy", 30, 10));

        VendingMachine vendingMachine = new VendingMachine(products);
        vendingMachine.displayProducts();
        vendingMachine.purchase();
    }
}