import java.util.*;

class Student{
    String name;
    int height;
    double weight;

    public Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for(int i=0; i<5; i++){
            String n = sc.next();
            int h = sc.nextInt();
            double w = sc.nextDouble();
            
            students[i] = new Student(n,h,w);
        } 

        Arrays.sort(students, (a,b) -> a.name.compareTo(b.name));
        
        System.out.println("name");
        for(Student s : students){
            System.out.printf("%s %d %.1f\n",s.name ,s.height ,s.weight);
        }

        System.out.println();

        Arrays.sort(students, (a,b) -> b.height - a.height);
        
        System.out.println("height");
        for(Student s : students){
            System.out.printf("%s %d %.1f\n",s.name ,s.height ,s.weight);
        }
    }
}