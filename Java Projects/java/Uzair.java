import java.util.*;

class Laptop{
    private String company;
    private long price;
    private Charger c;

    public void connectCharger(Charger c){
        this.c = c;
    }

    public void disconnectCharger(){
        System.out.println("");
        this.c =null;
    }

}

class Charger{
    private String Company;
    private int resulotion;
}



public class Uzair {
    public static void main(String[] args) {
            Laptop lpc =new Laptop();
            Charger ch =new Charger();

                lpc.connectCharger(ch);
                lpc.disconnectCharger();

    }
}
