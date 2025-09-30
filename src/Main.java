import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Partyaff ;
        System.out.printf("Enter a party");
        Partyaff = input.nextLine();
        Partyaff = Partyaff.toUpperCase();
        switch (Partyaff) {
            case "D":
                System.out.printf("You are a democrat");
            break;
            case "R" :
                System.out.printf("You are a Republican");
            break;
            case "I":
                System.out.printf("You are a Independent ");
            break;
        }
        input.close();

    }
}