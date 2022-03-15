public class SimpleArray {
    public static void main(String[] args) {
        String[] cars = new String[5];
                cars[0] = "Mercedes-Benz";
                cars[1] = "Porsche";
                cars[2] = "BMW";
                cars[3] = "Audi";
                cars[4] = "VW";

                String car = cars[3];
                System.out.println(car);

                int numberOfElements = cars.length;

                System.out.println(numberOfElements);

    }
}
