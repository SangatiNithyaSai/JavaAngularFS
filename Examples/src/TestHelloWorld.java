
class Mobile{
    int price;
    String color;
    String company;
    public Mobile(){
        price=10000;

    }
    public void callAnyone(){
        System.out.println("Calling someone....");
    }
    public void playMusic(){
        System.out.println("Listening to music.....");
    }
    public void takeSelfie(){
        System.out.println("Taking Selfies...");
    }
}

public class TestHelloWorld {
    public static void main(String[] args){
        Mobile obj1=new Mobile();
        obj1.playMusic();
        System.out.println(obj1.price);
    }
}
