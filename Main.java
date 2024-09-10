import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {
        Management management = new Management();
        management.add(20,"A");
        management.add(20,"B");
        management.add(20,"C");
        management.delete("B");
        management.add(20,"A");
        management.add(20,"D");
        String[] names = management.getAll();
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+" ");
        }
    }
}



