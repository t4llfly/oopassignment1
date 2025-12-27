public class Employee extends Human implements IHuman, IEmployee {
    // attributes for employee
    private String jobName;

    // constructors
    public Employee(String name, int age, boolean isHealthy, String jobName) {
        super(name, age, isHealthy);
        this.jobName = jobName;
    }

    public Employee() {}

    @Override
    public void work() {
        System.out.println("Working");
    }

    @Override
    public void drink() {
        System.out.println("Drinking coffee");
    }

    @Override
    public void study() {
        System.out.println("Studying to increase qualification");
    }

    @Override
    public void walk() {
        System.out.println("Walking to work");
    }

    @Override
    public void run() {
        System.out.println("Running to work");
    }

    // getter and setter
    public String getJobName() { return jobName; }
    public void setJobName(String jobName) { this.jobName = jobName; }
}
