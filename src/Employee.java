public class Employee extends Human {
    // attributes for employee
    private String jobName;

    // constructors
    public Employee(String name, int age, boolean isHealthy, String jobName) {
        super(name, age, isHealthy);
        this.jobName = jobName;
    }

    public Employee() {}

    // getter and setter
    public String getJobName() { return jobName; }
    public void setJobName(String jobName) { this.jobName = jobName; }
}
