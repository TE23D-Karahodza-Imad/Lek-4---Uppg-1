import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Registrera ny elev:");

        System.out.print("Ange namn: ");
        String namn = sc.nextLine();

        System.out.print("Ange personnummer: ");
        int personnummer = sc.nextInt();

        System.out.print("Ange email: ");
        String email = sc.nextLine();

        System.out.print("Ange mobilnummer: ");
        String mobilnummer = sc.nextLine();

        System.out.print("Ange klass: ");
        String klass = sc.nextLine();

        System.out.print("Ange program: ");
        String program = sc.nextLine();


        Elev elev1 = new Elev(namn, personnummer, email, mobilnummer, klass, program);

        System.out.println("\n--- Registrerad elev ---");
        elev1.skrivUtInfo();
        
        // elev1.set_klass("  ");

        // System.out.println(elev1.get_klass());
        
        sc.close();
    }
}
