public class Student {
    String className;
  Student(String className)
  {
    this.className=className;
  }

    public static void main(String[] args) {
        Student student = new Student("10th Grade");
        System.out.println("Class: " + student.className);
    }
}
