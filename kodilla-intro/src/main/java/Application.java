public class Application {
    String name;
    double age;
    int height;

    public Application (String name, double age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public static void main(String[] args){
        Application Adam = new Application("Adam", 40.5, 178);

        Application[] applications = {Adam};
        int numberOfElements = applications.length;

        for (int i = 0; i < numberOfElements; i++){
            if (applications[i].age > 30 && applications[i].height > 160){
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }

    }
}
