package ru.oca.lessiongeneric.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ilya", 10);
        Schoolar schoolar2 = new Schoolar("Max", 12);
        Schoolar schoolar3 = new Schoolar("Petr", 11);
        Schoolar schoolar4 = new Schoolar("Yan", 13);

        Student student1 = new Student("Artem", 25);
        Student student2 = new Student("Anton", 21);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Alex", 50);

        Team<Schoolar> schoolarTeam = new Team<>("Youngers");
        Team<Schoolar> schoolarTeam2 = new Team<>("YoungBulls");
        Team<Student> studentTeam = new Team<>("StudentStrong");
        Team<Employee> employeeTeam = new Team<>("WorkHardPlayHard");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolarTeam.playWith(schoolarTeam2);
    }
}
