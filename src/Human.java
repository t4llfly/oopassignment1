public abstract class Human {
    // common attributes
    protected String name;
    protected int age;
    protected boolean isHealthy;

    // constructors
    public Human(String name, int age, boolean isHealthy) {
        this.name = name;
        this.age = age;
        this.isHealthy = isHealthy;
    }

    public Human() {}

    // methods
    public void sleep() {
        System.out.println("Sleeping");
    }
    public void eat() {
        System.out.println("Eating");
    }
    public abstract void drink();

    // common getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public boolean getHealthy() { return isHealthy; }
    public void setHealthy(boolean isHealthy) { this.isHealthy = isHealthy; }

}
