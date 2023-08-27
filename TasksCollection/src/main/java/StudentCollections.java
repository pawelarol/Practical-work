import HeavyBoxes.Student;
import java.util.*;
public class StudentCollections {
    public static void main(String[] args) {
       List<Student> students = new ArrayList<>();

        Student student1 = new Student("Alice Smith" ,"Group B", 3);
        student1.addSubjectAndGrade("Math",9);
        student1.addSubjectAndGrade("Physics",9);
        student1.addSubjectAndGrade("History",9);
        student1.addSubjectAndGrade("English",9);
        student1.addSubjectAndGrade("Chemisty",7);
        students.add(student1);

        Student student2 = new Student("Alex Solvi" ,"Group B", 3);
        student1.addSubjectAndGrade("Math",7);
        student1.addSubjectAndGrade("Physics",8);
        student1.addSubjectAndGrade("History",7);
        student1.addSubjectAndGrade("English",9);
        student1.addSubjectAndGrade("Chemisty",6);
        students.add(student2);

        Student student3 = new Student("Alecsan Solvi" ,"Group B", 3);
        student1.addSubjectAndGrade("Math",5);
        student1.addSubjectAndGrade("Physics",6);
        student1.addSubjectAndGrade("History",2);
        student1.addSubjectAndGrade("English",9);
        student1.addSubjectAndGrade("Chemisty",5);
        students.add(student3);

        Student student4 = new Student("Pavel Arol" ,"Group B", 3);
        student1.addSubjectAndGrade("Math",9);
        student1.addSubjectAndGrade("Physics",1);
        student1.addSubjectAndGrade("History",2);
        student1.addSubjectAndGrade("English",4);
        student1.addSubjectAndGrade("Chemisty",5);
        students.add(student4);

        Student student5 = new Student("Oleg Arol" ,"Group B", 3);
        student1.addSubjectAndGrade("Math",1);
        student1.addSubjectAndGrade("Physics",6);
        student1.addSubjectAndGrade("History",4);
        student1.addSubjectAndGrade("English",8);
        student1.addSubjectAndGrade("Chemisty",9);
        students.add(student5);

        Student student6 = new Student("Margarita Solovey" ,"Group B", 3);
        student1.addSubjectAndGrade("Math",1);
        student1.addSubjectAndGrade("Physics",2);
        student1.addSubjectAndGrade("History",5);
        student1.addSubjectAndGrade("English",7);
        student1.addSubjectAndGrade("Chemisty",9);
        students.add(student6);

       showStudents(students);
        removeStudents(students);
       promoteStudents(students);
       printStudents(students,3);
        System.out.println("Remaining Students:");
        for (Student student : students) {
            if(student.getAverageGrade()>3){
            System.out.println("Name: " + student.getName());
            System.out.println("Group: " + student.getGroup());
            System.out.println("Course: " + student.getCourse());
            System.out.println("Average Grade: " + student.getAverageGrade());
        }
        }
    }


    public static void removeStudents(List<Student> sl){
        Iterator<Student> iterator = sl.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getAverageGrade()<3){
                iterator.remove();
            }
            System.out.println();
        }
    }

    public static void showStudents(List<Student> sl){
        Iterator<Student> iterator = sl.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getAverageGrade()<3){
                System.out.println("No entering students " + student.getName());
            } else {
                System.out.println("Entering srudents" + student.getName());
            }
        }
    }
    public static void promoteStudents(List<Student> sl){
        for(Student student : sl){
            if(student.getAverageGrade() >=3){
                student.course++;
            }
        }
    }

    public static void printStudents(List<Student> sl, int course){
        for(Student student : sl){
            if(student.getCourse() == course){
                System.out.println(student.getName());
            }
        }
    }

}
