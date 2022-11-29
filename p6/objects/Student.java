package objects;

public class Student {
    private String name;
    private int cl, score;
    public Student(){}
    public Student(String name, int cl, int score){
        this.name = name;
        this.cl = cl;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCl() {
        return cl;
    }
    public void setCl(int cl) {
        this.cl = cl;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student [cl=" + cl + ", name=" + name + ", score=" + score + "]";
    }
}
