public class lab2 {
    public static void main(String args[]){
        Student student1 = new Student("Ivan", "Ivanov",4.90 ,"1851");
        Aspirant aspirant1 = new Aspirant ("Petr", "Petrov", 4.00, "1650","work1");
        Student aspirant2 = new Aspirant ("Fedor", "Fedorov", 5.00, "1650","work2");
        Student[] students = {student1, aspirant1, aspirant2};
        for (Student s:students){
            System.out.println(s.getScholarship());
        }
    }
}
