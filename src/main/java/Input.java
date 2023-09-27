import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public int inputInt (){

        while (true){
            try {
                int tal = scanner.nextInt();
                scanner.nextLine();
                return tal;
            }catch (InputMismatchException e){
                System.out.println("Skal være tal");
                scanner.nextLine();
            }
        }
    }

    public String inputString(){
        String output = "";

        try {
            output = scanner.nextLine();
            return output;
        }catch (NoSuchElementException e){
            return output;
        }
    }

}

