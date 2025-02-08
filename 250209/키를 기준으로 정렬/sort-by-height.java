import java.util.*;

class Student{
    String name;
    int height;
    int weight;

    public Student(){
        this.name = "";
        this.height = 0;
        this.weight = 0;
    }

    public Student(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
};
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i=0; i<n; i++){
            String name = sc.next();
            int h = sc.nextInt();
            int w = sc.nextInt();

            students[i] = new Student(name,h,w);
        }

        Arrays.sort(students, (a,b)->a.height-b.height);

        for(Student s : students){
            System.out.println(s.name +" " +s.height+" "+s.weight);
        }
        sc.close();
    }
}