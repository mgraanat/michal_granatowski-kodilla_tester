public class User {
    int age;
    String name;
    public User (int age, String name){
        this.age = age;
        this.name = name;
    }
    public static void main(String[] args){
        User Michal = new User(25, "Michal");
        User Kinga = new User(24, "Kinga");
        User Maciek = new User(25, "Maciek");
        User Martyna = new User(20, "Martyna");
        User Cezar = new User(16, "Cezar");

        User[] users = {Michal, Kinga, Maciek, Martyna, Cezar};
        int numberOfElements = users.length;

        int sum = 0;
        for (int i = 0; i < numberOfElements; i++){
            sum = sum + users[i].age;
        }
        int averageOfNumbers = 0;
        averageOfNumbers = sum / numberOfElements;
        System.out.println(averageOfNumbers);

        for (int i=0; i < numberOfElements; i++){
            if (users[i].age < averageOfNumbers){
                System.out.println(users[i].name);
            }
        }
    }
}
