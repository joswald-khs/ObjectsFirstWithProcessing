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

    public static Student[] createStudentArrayFromFiles(String nameFile, String gpaFile) throws IOException {
        File names = new File(nameFile);
        File gpas = new File(gpaFile);
        Scanner nameScanner = new Scanner(names);
        Scanner gpaScanner = new Scanner(gpas);
        
        // count number of students
        int studentCount = 0;
        while(nameScanner.hasNext()){
            studentCount++;
            nameScanner.nextLine();
        }
        nameScanner.close();
        nameScanner = new Scanner(names);
        
        Student[] students = new Student[studentCount];
        
        for( int i = 0; i < studentCount; i++ ) {
            String name = nameScanner.nextLine();
            double gpa = gpaScanner.nextDouble(); 
            students[i] = new Student(name,gpa);
        }

        return students;
    }


    public double getGPA() {
        return gpa;
    }
  
    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}