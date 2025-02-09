import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int korea;
    int english;
    int math;

    public Student(String name, int korea, int english, int math){
        this.name = name;
        this.english = english;
        this.korea = korea;
        this.math = math;
    }

    @Override
    public int compareTo(Student student){
        if(this.korea == student.korea){
            if(this.english == student.english)
                return student.math - this.math;
            else return student.english - this.english;
        }
        else return student.korea - this.korea;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i=0;i <n; i++){
            String name = sc.next();
            int k = sc.nextInt();
            int e = sc.nextInt();
            int m = sc.nextInt();

            students[i] = new Student(name, k, e, m);
        }
        Arrays.sort(students);
        for(Student s : students){
            System.out.println(s.name + " " + s.korea + " " + s.english + " " + s.math);
        }
        sc.close();
    }
}