package student;
public class result {
    int total_marks = 0;
    int marks[] = { 96, 90, 93, 95, 89 };
    String Subjects[] = { "Maths III", "Java", "Data Structure", "DLD", "OB" };
    {
        for (int i = 0; i < (marks.length); i++) {
            total_marks = total_marks + marks[i];
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks in "+Subjects[i]+"="+marks[i]);
        }
        System.out.println("total marks="+total_marks);
    }
}
