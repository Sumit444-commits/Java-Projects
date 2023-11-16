
 interface A {
 default void show(){
    System.out.println("hello i am interface show");
    show2();
}
 private void show2(){
    System.out.println("hello i am interface");
}
public void de();

}

abstract class C {
    public C(int a){
        System.out.println("I m C");
    }
    public abstract void showMeth();
    public static void showMeth2(){
        System.out.println("Show 2M");
    }
}

class  B extends C implements A{

    B(){
        super(0);
    }
  public void show(){
    System.out.println("I m B");
    }
    public void print(){
        A.super.show();
     this.show();
        show();
    }
    public void de(){
        System.out.println("helo");
    }
    @Override
    public void showMeth() {
        System.out.println("Hello");
        super.showMeth2();
    }
}

class coustom extends Exception{
   
}

class Thr implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.print(i);
        }
    }
}
public class Main{
    static void test(int age) throws ArithmeticException,coustom{
        if(age<18){
            // throw new ArithmeticException("Not able to vote");
            throw new coustom();
        }else{
            System.out.println("vote");
        }
    }

    public static void main(String[] args) {
        // Thr t = new Thr();
    //   Thread t1 = Thread.currentThread();
      
    //   Thread t2 = new Thread(new Thr(),"Hekk");
    // //   t1.start();
    // //   t2.start();
    //   try{
    //       t1.join(100);
    //       System.out.println(t1.getState());
    //       System.out.println(t1.isAlive());
    //       System.out.println(t2.isDaemon());
    //     //   t2.join(1000);  
    // }catch(InterruptedException | IllegalThreadStateException|UnsupportedOperationException e){

    //   }
      
}
}