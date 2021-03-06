package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    private static Input input = new Input();
    private static HashMap<String, Student> students;

    public static void main(String[] args) {
        System.out.println("Welcome to the Grades Application!");

        students = getStudents();

        do {

            showStudents(students);

            System.out.println("Enter the GitHub username for the student to get grades: ");
            String userChoice = input.getString();

            if(students.containsKey(userChoice)) {
                Student student = students.get(userChoice);
                System.out.println(student);

                promptForGradeDetail(student);

            } else {
                System.out.println(userChoice + " was not found in our system.");

                promptToAddNewStudent();
            }

        } while(input.yesNo("Would you like information on another student? Press y or yes to continue."));

        if(input.yesNo("Would you like to see all students and grades?")) {
            showAllStudentsAndGrades(students);
        }

        System.out.println("Thank you for using Grades Application");
    }

    protected static void showAllStudentsAndGrades(HashMap<String, Student> students) {
        students.forEach((key, student) -> {
            System.out.println(key + "'s" + " grade average is a " + student.getGradeAverage());
        });
    }

    protected static void promptToAddNewStudent() {
        System.out.println("Would you like to add a new student?");

        if(input.yesNo("Press y or yes")) {
            addStudent(); // addStudent makes a new student object and adds it to the HashMap
        }
    }

    protected static void promptForGradeDetail(Student student) {
        if(input.yesNo("Would you like to see all their grades? Yes or y to continue.")) {
            student.showAllGrades();
        }
    }


    protected static void addStudent() {
        String username = input.getString("What is the student's GitHub username?");

        Student student = makeStudent();

        students.put(username, student); // add the student object w/ their username key to the students HashMap.

    }

    protected static Student makeStudent() {
        String name = input.getString("What is the student's name? ");

        Student student = new Student(name);

        int grade;

        do {
            System.out.println("Input a grade for the student");

            grade = input.getInt();

            student.addGrade(grade);

        } while(input.yesNo("Do you want to add more grades for " + name + "?"));

        return student;
    }


    protected static void showStudents(HashMap<String, Student> students) {
        for(String student : students.keySet()) {
            System.out.print(" | " + student + " | \t");
        }
    }

    protected static HashMap<String, Student> getStudents() {
        HashMap<String, Student> students = new HashMap<>();

        Student lane = new Student("Lane");
        lane.addGrade(100);
        lane.addGrade(90);
        lane.addGrade(98);

        Student joe = new Student("Joe");
        joe.addGrade(40);
        joe.addGrade(50);
        joe.addGrade(80);
        joe.addGrade(90);

        Student shelly = new Student("Shelly");
        shelly.addGrade(100);
        shelly.addGrade(0);
        shelly.addGrade(99);

        Student pam = new Student("Pam");
        pam.addGrade(80);
        pam.addGrade(82);
        pam.addGrade(87);
        pam.addGrade(82);


        students.put("Ldude", lane);
        students.put("sloppyJoe", joe);
        students.put("code-iz-lyfe", shelly);
        students.put("java-coder-2", pam);

        return students;
    }

}