// Vladimir Konovalov (MT-2507

void main() {
    // objects
    Human human = new Human("test", 18, true);
    Employee employee = new Employee();
    Student student = new Student("test3", 19, false, 3.22f);
    Scanner scanner = new Scanner(System.in);

    // scanners
    System.out.println("Employee name: ");
    employee.setName(scanner.next());
    System.out.println("Employee age: ");
    employee.setAge(scanner.nextInt());
    System.out.println("Is employee healthy (true/false): ");
    employee.setHealthy(scanner.nextBoolean());
    System.out.println("Employee's job name: ");
    employee.setJobName(scanner.next());

    // output
    System.out.println("--- Human ---");
    System.out.println("Name: " + human.getName() + "\nAge: " + human.getAge() +
            "\nIs healthy: " + human.getHealthy()
    );
    human.eat();
    human.sleep();

    System.out.println("--- Employee ---");
    System.out.println("Name: " + employee.getName() + "\nAge: " + employee.getAge() +
            "\nIs healthy: " + employee.getHealthy() + "\nJob: " + employee.getJobName()
    );
    employee.eat();
    employee.sleep();

    System.out.println("--- Student ---");
    System.out.println("Name: " + student.getName() + "\nAge: " + student.getAge() +
            "\nIs healthy: " + student.getHealthy() + "\nGPA: " + student.getGpa()
    );
    student.eat();
    student.sleep();
}
