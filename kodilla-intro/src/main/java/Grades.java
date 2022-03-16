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
        if (size > 0){
            return grades[size - 1];
        }
        return -1;
    }
    public int averageGrade(){
        int suma = 0;
        for (int i = 0; i < size; i++){
            suma = suma + grades[i];
        }
        return suma / size;
    }
}
