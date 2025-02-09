import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int subject1;
    int subject2;
    int subject3;

    public Student(String name, int subject1, int subject2, int subject3){
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    public int compareTo(Student student){
        return (this.subject1 + this.subject2 + this.subject3) - (student.subject1 + student.subject2 + student.subject3);
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];
        for(int i=0;i<n;i++){
            String name = sc.next();
            int subject1 = sc.nextInt();
            int subject2 = sc.nextInt();
            int subject3 = sc.nextInt();

            students[i] = new Student(name, subject1, subject2, subject3);
        } 

        Arrays.sort(students);
        for(Student s : students){
            System.out.println(s.name + " " + s.subject1 + " " + s.subject2 + " " + s.subject3);
        }
        sc.close();
    }
}