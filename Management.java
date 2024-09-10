import java.util.ArrayList;

public class Management {

    private ArrayList<Employee> Employees = new ArrayList<Employee>();

    public boolean add(int age, String name) {
        boolean distinct = true;
        Employee employee = new Employee(age, name);
        for (int i = 0; i < Employees.size(); i++) {
            if(employee.name.equals(Employees.get(i).name)){
                distinct = false;
                break;
            }
        }
        if(distinct){
            Employees.add(employee);
            return true;
        }
        return false;
    }
    public void delete(String name){
        for (int i = 0; i < Employees.size(); i++) {
            if(Employees.get(i).name.equals(name)){
                Employees.remove(i);
                return;
            }
        }
    }
    public String[] getAll(){
        String[] all = new String[Employees.size()];
        for (int i = 0; i < Employees.size(); i++) {
            all[i] = Employees.get(i).name;
        }
        return all;
    }
}