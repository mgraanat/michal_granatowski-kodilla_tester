public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]
        Notebook notebook = new Notebook(600,1000, 2016);
        Notebook heavyNotebbok = new Notebook (2000, 1500, 2020);
        Notebook oldNotebook = new Notebook (1200, 500, 2010);
        System.out.println(notebook.weight + "g" + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkWeightAndPrice();
        System.out.println(heavyNotebbok.weight + "g" + " " + heavyNotebbok.price + " " + heavyNotebbok.year);
        heavyNotebbok.checkPrice();
        heavyNotebbok.checkWeight();
        heavyNotebbok.checkWeightAndPrice();
        System.out.println(oldNotebook.weight + "g" + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkWeightAndPrice();



    }
}
