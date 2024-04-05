public class Student {

     private String name;
     private int age;

     public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age :  " + age);
     }

    public void setName(String string) {
        this.name = string;
    }
    public void setAge(int i) {
        
        this.age = i;
    }
    public String getName() {
      
        return name;
    }
    public int getAge() {

        return age;
    }

    
}