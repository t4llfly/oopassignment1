public class Employee extends Human {
    private String jobName;

    public Employee(String name, int age, boolean isHealthy, String jobName) {
        super(name, age, isHealthy);
        this.jobName = jobName;
    }

    public Employee() {}

    public String getJobName() { return jobName; }
    public void setJobName(String jobName) { this.jobName = jobName; }
}
