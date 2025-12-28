// Vladimir Konovalov (MT-2507)

void main() {
    // objects
    Employee employee1 = new Employee();
    Human employee2 = new Employee("test2", 30, true, "designer");
    IEmployee employee3 = new Employee("test3", 30, true, "frontend");
    Student student1 = new Student("test4", 17, false, 3.55f);
    Human student2 = new Student("test5", 20, false, 3.22f);
    IHuman student3 = new Student("test6", 18, true, 2.55f);

    // output
    System.out.println("--- Employee 1 ---");
    employee1.eat();
    employee1.sleep();
    employee1.drink();
    employee1.work();
    employee1.walk();
    employee1.run();
    employee1.study();

    System.out.println("--- Employee 2 ---");
    employee2.eat();
    employee2.sleep();
    employee2.drink();

    System.out.println("--- Employee 3 ---");
    employee3.study();
    employee3.work();

    System.out.println("--- Student 1 ---");
    student1.eat();
    student1.sleep();
    student1.drink();
    student1.walk();
    student1.run();

    System.out.println("--- Student 2 ---");
    student2.eat();
    student2.sleep();
    student2.drink();

    System.out.println("--- Student 3 ---");
    student3.walk();
    student3.run();
}
