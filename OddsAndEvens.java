import java.util.*;
public class OddsAndEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let´s play a game called \"OddsAndEvens\"");
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.print("Hi " + name +", Which do you choose? (O)dds or (E)vens? ");
        String choose = input.next();
        String P = "";
        if (choose.equalsIgnoreCase("o")) {
            System.out.println(name +" has picked odds! The Computer will be evens.");
            P = "o";
        } else if (choose.equalsIgnoreCase("e")) {
            System.out.println(name +" has picked evens! The Computer will be odds.");
            P = "e";
        } else {
            System.out.println("Wrong input!");
            System.exit(0);
        }
        System.out.println("--------------------------------------");
        System.out.println(" ");
        System.out.print("How many “fingers” do you put out? ");
        int f = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays number \"" + computer + "\"");
        System.out.println("--------------------------------------");
        int sum = computer + f;
        boolean oddOrEven = sum % 2 == 0;
        if (oddOrEven) {
            System.out.println( f + " " + computer + " = " + sum);
            System.out.println( sum +" is....Even");
            if(P.equalsIgnoreCase("e")){
                System.out.println(name + " is the WINNER!!!!!!");
            } else {
                System.out.println("Computer is the winner.");
            }
        } else {
            System.out.println( f + " + " + computer + " = " + sum);
            System.out.println( sum +" is....Odd");
            if(P.equalsIgnoreCase("o")){
                System.out.println(name + " is the WINNER!!!!!!");
            } else {
                System.out.println("Computer is the winner.");
            }
        }

    }
}
