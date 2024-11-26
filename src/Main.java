import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        setStudents();
        System.out.println(students);

        printStudents(students, 1);

        removeBadStudents();
        System.out.println(students);
    }

    public static void setStudents() {
        HashMap<String, Integer> marks1 = new HashMap<>();
        marks1.put("Вышмат", 5);
        marks1.put("ООП", 4);
        marks1.put("Алгоритмы", 5);
        Student student1 = new Student("Антон", "PIbd", 1, marks1);

        HashMap<String, Integer> marks2 = new HashMap<>();
        marks2.put("Вышмат", 3);
        marks2.put("Физика", 3);
        marks2.put("Ин. яз", 2);
        Student student2 = new Student("Света", "Rbd", 2, marks2);

        HashMap<String, Integer> marks3 = new HashMap<>();
        marks3.put("1c", 4);
        marks3.put("Экономика", 5);
        marks3.put("Базы данных", 3);
        Student student3 = new Student("Петя", "ISEbd", 4, marks3);

        HashMap<String, Integer> marks4 = new HashMap<>();
        marks4.put("ООП", 2);
        marks4.put("Физика", 3);
        marks4.put("Вычислительные системы", 2);
        Student student4 = new Student("Света", "IVTbd", 1, marks4);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
    }

    public static void removeBadStudents() {
        System.out.println("Закончилась сессия");
        List<Student> badStudents = students.stream()
                .filter(student -> student.average() < 3)
                .toList();
        students.removeAll(badStudents);
        for (Student student : students) {
            if (student.courseNumber < 4) student.courseNumber++;
            else student.group = "Выпуск";
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты " + course + " курса: ");
        students.stream()
                .filter(student -> student.courseNumber == course)
                .forEach(System.out::println);
    }
}
