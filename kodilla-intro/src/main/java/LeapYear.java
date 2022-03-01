public class LeapYear {
    public static void main(String[] args) {
        int year = 1600;
        int pierwszeDzielenie = 4;
        int drugieDzielenie = 100;
        int trzecieDzielenie = 400;

        System.out.println(year);
        int result = year%pierwszeDzielenie;
        if (result == 0){
            int result2 = year%drugieDzielenie;
            if (result2 == 0){
                int result3 = year%trzecieDzielenie;
                if (result3 == 0){
                    System.out.println("Rok przestępny");
                } else {
                    System.out.println("Rok nie przestępny");
                }
            } else {
                System.out.println("Rok przestępny");
            }
        } else {
         System.out.println("Rok nie przestępny");
        }

        }

}
