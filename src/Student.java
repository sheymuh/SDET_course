import java.util.HashMap;
import java.util.Map;

public class Student {
    public String name;

    public String group;

    public int courseNumber;

    public HashMap<String, Integer> marks;

    public Student(String name, String group, int courseNumber, HashMap<String, Integer> marks) {
        this.name = name;
        this.group = group;
        this.courseNumber = courseNumber;
        this.marks = marks;
    }

    public double average() {
        int sum = 0;
        int count = marks.size();
        for (Map.Entry<String, Integer> mark : marks.entrySet()) {
            sum += mark.getValue();
        }
        return (double) sum / count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", courseNumber=" + courseNumber +
                ", marks=" + marks +
                "}\n";
    }
}
