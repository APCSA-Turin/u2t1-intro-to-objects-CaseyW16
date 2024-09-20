public class Student {
    public String name;
    public String major;
    public int grade;
    public double average;

    public Student(String nam, String mjr, int grd, double avg) {
        name = nam;
        major = mjr;
        grade = grd;
        average = avg;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("Grade: " + grade);
        System.out.println("Average: " + average);
    }

}


