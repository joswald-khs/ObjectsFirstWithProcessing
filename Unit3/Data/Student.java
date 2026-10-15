import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Student {
    private String name;
    private double gpa;

    public Student() {
      name = "unknown";
      gpa = 0.0;
    }

    public Student(String name) {
      this.name = name;
      gpa = 0.0;
    }

    public Student(String name, double gpa){
      this.name = name;
      this.gpa = gpa;
    }

    public Student createStudentFromFile(String filename) throws IOException {
      File file = new File(filename);
      Scanner scanner = new Scanner(file);
      String name = scanner.nextLine();
      scanner.close();
      return new Student(name);
    }

    /* ---- 🔎 ADD YOUR CODE BELOW THIS LINE ---- */




  
  
    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}