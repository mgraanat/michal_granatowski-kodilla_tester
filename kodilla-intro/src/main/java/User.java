public class User {
    int wiek;
    String imie;
    public User (int wiek, String imie){
        this.wiek = wiek;
        this.imie = imie;
    }
    public static void main(String[] args){
        User Michal = new User(25, "Michal");
        User Kinga = new User(24, "Kinga");
        User Maciek = new User(25, "Maciek");
        User Martyna = new User(20, "Martyna");
        User Cezar = new User(16, "Cezar");

        User[] users = {Michal, Kinga, Maciek, Martyna, Cezar};
        int numberOfElements = users.length;

        int suma = 0;
        for (int i = 0; i < numberOfElements; i++){
            suma = suma + users[i].wiek;
        }
        int srednia = 0;
        srednia = suma / numberOfElements;
        System.out.println(srednia);

        for (int i=0; i < numberOfElements; i++){
            if (users[i].wiek < srednia){
                System.out.println(users[i].imie);
            }
        }
    }
}
