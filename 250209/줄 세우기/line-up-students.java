import java.util.*;

class Student implements Comparable<Student>{
    int height,weight,number;
    
    public Student(int height, int weight, int number){
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student student){
        if(this.height == student.height){
            if(this.weight == student.weight){
                return this.number - student.number;
            } return student.weight - this.weight;
        } return student.height - this.height;
    }
};
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i=0;i <n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();

            students[i] = new Student(h, w, i+1);
        }
        Arrays.sort(students);

        for(Student s : students){
            System.out.println(s.height +" "+s.weight+" "+s.number);
        }
        sc.close();
    }
}