import java.util.Scanner; //Import Scanner class for user inputs

public class Main {
    public static void main(String[] args) {
        welcomeMessage();
    }

    public static void welcomeMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Wanderer... what is your name?");
        String name = sc.nextLine();
        System.out.println("Oh... well hello, " + name + "... you may now wander.");
    }
}
