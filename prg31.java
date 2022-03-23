package Lab_Work;

import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;

    Employee(int eid, String ename) {
        emp_id = eid;
        emp_name = ename;
    }

    void display() {
        System.out.println("\t"+emp_id + " \t " + emp_name);
    }
}

public class prg31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eid[] = new int[5];
        String ename[] = new String[5];
        Employee[] ob = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". Enter Employee Id : ");
            eid[i] = sc.nextInt();
            sc.nextLine();

            System.out.print((i + 1) + ". Enter Employee Name : ");
            ename[i] = sc.nextLine();
            ob[i] = new Employee(eid[i], ename[i]);
        }
        System.out.println("==============================");
        System.out.println("\tEmp_id \t Emp_Name");
        System.out.println("==============================");
        for (int i = 0; i < 5; i++) {
            ob[i].display();
        }
        System.out.println("==============================");
        sc.close();
    }
}
