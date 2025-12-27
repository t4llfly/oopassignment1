public final class Student extends Human implements IHuman {
    // attributes (one static)
    private static String university = "AITU";
    private float gpa;

    public Student(String name, int age, boolean isHealthy, float gpa) {
        super(name, age, isHealthy);
        this.gpa = gpa;
    }

    public Student() {}

    @Override
    public void walk() {
        System.out.println("Walking to university");
    }

    @Override
    public void run() {
        System.out.println("Running to university");
    }

    @Override
    public void drink() {
        System.out.println("Drinking cola");
    }

    @Override
    public void eat() {
        System.out.println("Can't eat: not enough money");
    }

    public static String getUniversity() {
        return university;
    }
    public static void setUniversity(String university) {
        Student.university = university;
    }

    public float getGpa() { return gpa; }
    public void setGpa(float gpa) { this.gpa = gpa; }
}
