public class Loops {
    public static void main(String[] args) {
        String[] names = new String[] {"Michał", "Maciek", "Marek"};
        int numberOfElements = names.length;

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

    }
    public int sumNumbers(int[] numbers) {
        int[] numbersBoard = new int[] {1,2,3};
        int numberOfElements = numbersBoard.length;
        int result = 0;
        for (int i = 0; i < numberOfElements; i++) {
            result = result +numbersBoard[i];
        }
        return result;
    }
}
