
public class DataTypesExample {

    public static void main(String[] args) {
        // Primitive data types in Java
        int age = 30;
        String name = "Prakhar";
        boolean  isEmployed = false;
        char grade = 'A';
        double weight = 65.60;

        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Employment " + isEmployed);
        System.out.println("Grade " + grade);
        System.out.println("Weight " + weight);

        //create an object of the Student class
        Student student1 = new Student();  // student1 is reference data type
        student1.setName("Ashish");
        student1.setAge(25);

        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        student1.display();

        // Arrays 
        int[] arrayOfIntegers = {1, 2 ,3};   // An integer array

        // enum
        Day toDay = Day.MONDAY;
        System.out.println(toDay);
        
    }
    
}