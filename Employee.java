public class Employee{
    String name;
    int age;

    public Employee(int age, String name){
        if(age>18&&age<100&&name!=null){
            this.age = age;
            this.name = name;
        }
    }
}