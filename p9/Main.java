import objects.Student;
import objects.Sort;
import objects.SortingStudentsByGPA;

public class Main{ 
    public static void main (String args[]){
        Student[] arr = new Student[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student("id" + (int)(Math.random() * 10000), (int)(Math.random() * 10), (int)(Math.random() * 100));
        }
        Sort<Student> sort = new Sort<Student>(arr, new SortingStudentsByGPA());
        arr = sort.getArr();
        for (Student student : arr) {
            System.out.println(student);
        }
    }
}