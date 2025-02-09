import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int hegiht;
    int weight;

    public Student(String name, int hegiht, int weight){
        this.name = name;
        this.hegiht = hegiht;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student){
        if(this.hegiht == student.hegiht)
            return student.weight - this.weight;
        return this.hegiht - student.hegiht;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i=0; i<n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            students[i] = new Student(name, height, weight);
        }
        Arrays.sort(students);

        for(Student s : students){
            System.out.println(s.name + " " + s.hegiht + " " + s.weight);
        }
        sc.close();
    }
}