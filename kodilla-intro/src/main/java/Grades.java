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
    public int returnLastGrade(){
        int lastvalue;
        lastvalue = this.grades[size];
        return;
    }
    public int avGrade(int[] grades) {
        int result = 0;
        int avResult =0;
        for (int i=0; i<this.size; i++) {
            result = result + grades[i];
            avResult = result / this.size;
        }
        return avResult;
    }
}
