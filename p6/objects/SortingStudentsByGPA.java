package objects;

public class SortingStudentsByGPA implements Comparator<Student>{
    @Override
    public boolean cmp(Student t1, Student t2) {
        return t1.getScore() < t2.getScore();
    }
}
