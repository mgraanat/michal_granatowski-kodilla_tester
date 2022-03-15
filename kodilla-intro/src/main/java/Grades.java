public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int returnLastGrade(int lastGrade){
        if (this.size > 0){
            this.grades[this.size - 1] = lastGrade;
        }
        return lastGrade;
    }
    public int averageGrade(int average, int sum) {
       for (int i = 0; i<this.size; i++){
           sum = sum + this.grades[i];
           average = sum/this.size;

        } return average;


    }
}
