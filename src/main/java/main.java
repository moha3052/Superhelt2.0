import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Database database = new Database();
        Input input = new Input();

        database.tilFøjSuperhelt("Peter", "spiderman", 1962, true, 10, "edderkoppespind");
        database.tilFøjSuperhelt("Tony", "ironman", 1963, false, 10, "rigedom");
        database.tilFøjSuperhelt("Robert", "hulk", 1962, true, 9, "grøn mand");

        boolean keepRunning = true;

        while (keepRunning) {

            System.out.println("1. velkomen til superhelte univers");
            System.out.println("2. søge superhelt");
            System.out.println("3. vise alle superhelte");
            System.out.println("9. afslut");

            int choise = scanner.nextInt();


            switch (choise) {
                case 1:
                    System.out.println("navn");
                    String fornavn = input.inputString();
                    System.out.println("Superheltenavn");
                    String efternavn = input.inputString();
                    System.out.println("superheltekraft");
                    String superheltkrafter = input.inputString();
                    System.out.println("oprindelsesår");
                    int yearcreated = input.inputInt();
                    scanner.nextLine();
                    System.out.println("Er menneske");
                    boolean ishuman = scanner.nextBoolean();
                    System.out.println("styrke");
                    int strenght = input.inputInt();
                    database.tilFøjSuperhelt(fornavn, efternavn, yearcreated, ishuman, strenght,superheltkrafter );
                    break;

                case 2:
                    String superheltnavn = scanner.next();
                    database.søgesuperhelt(superheltnavn);


                    break;

                case 3:
                    database.printsuperhelte();
                    break;

                case 9:
                    keepRunning = false;

            }


        }
    }

}

