
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private static final String FILE_PATH = "students.txt";

    public static void saveStudent(Student student) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(student.getStudentId() + "," + student.getName() + "," + student.getGrade());
            writer.newLine();
        }
    }

    public static List<Student> loadStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length == 3) {
                    students.add(new Student(details[0], details[1], details[2]));
                }
            }
        }
        return students;
    }

    public static void saveAllStudents(List<Student> students) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Student student : students) {
                writer.write(student.getStudentId() + "," + student.getName() + "," + student.getGrade());
                writer.newLine();
            }
        }
    }
}
