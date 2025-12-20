public class Student extends Human {
    private static String university = "AITU";
    private float gpa;

    public Student(String name, int age, boolean isHealthy, float gpa) {
        super(name, age, isHealthy);
        this.gpa = gpa;
    }

    public Student() {}

    public static String getUniversity() {
        return university;
    }

    public static void setUniversity(String university) {
        Student.university = university;
    }

    public float getGpa() { return gpa; }
    public void setGpa(float gpa) { this.gpa = gpa; }

    @Override
    public void eat() {
        System.out.println("Can't eat: not enough money");
    }
}
