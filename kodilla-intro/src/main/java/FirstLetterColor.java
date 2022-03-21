import java.util.Scanner;

public class FirstLetterColor {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
                System.out.println("Enter first letter of color");
                String letter = scanner.nextLine().trim();
                switch (letter){
                    case "o":
                        System.out.println("Orange");
                        break;
                    case "r":
                        System.out.println("Red");
                        break;
                    case "b":
                        System.out.println("Blue");
                        break;
                    case "g":
                        System.out.println("Green");
                        break;

                }
    }
}
