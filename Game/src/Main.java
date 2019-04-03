import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Player p1;
        p1 = new Player();
        p1.hp = 100;


        System.out.println("*********************");
        System.out.println("*DET STORA ÄVENTYRET*");
        System.out.println("*********************");

        System.out.println("Vad heter du? ");
        String p1Name = scan.nextLine();
        p1.setName(p1Name);


        System.out.println("Välkommen " + p1.name + ", du har " + p1.hp + " HP");

        System.out.println("Vad vill du göra?");
        System.out.println("1. Äventyra");
        System.out.println("2. Visa egenskaper");
        System.out.println("3. Avsluta");

        //p1.setChoice

    }
}
