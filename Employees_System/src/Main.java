import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
     static Scanner in= new Scanner(System.in);
    static ArrayList <Employees> employeesList = new ArrayList<>(20);
    public static void main(String[] args)
    {
        minu();






    }
    public static void addEmployee ()
    {
        String name;
        int age ,salary;
        Employees employee = new Employees();
        System.out.println("enter employee name ");
        name=in.nextLine();
        employee.setName(name);
        System.out.println("enter employee age ");
        age=in.nextInt();
        employee.setAge(age);
        System.out.println("enter employee salary ");
        salary=in.nextInt();
        name=in.nextLine();
        employee.setSalary(salary);
        employeesList.add(employee);
        minu();
    }
    static  void listEmployees()
    {
        int size= employeesList.size();
        if(size<1)
        {
            System.out.println("no employess in the list!");
            System.out.println();
        }
        else
            for (Employees x:employeesList)
            {
                System.out.printf("Employee %s has age %d and salary %d \n",x.getName(),x.getAge(),x.getSalary());
                System.out.println();


            }
            minu();

    }
    static void   minu()
    {
        System.out.println();
        System.out.println("enter 1 for adding new Employee");
        System.out.println("enter 2 for list all Employees ");
        System.out.println("enter 3 for delete Employee");
        System.out.println("enter 4 for update Employee salary ");
        System.out.println("enter 5 to Exit ");
        int choice =in.nextInt();
        String x=in.nextLine();
        if (choice==1)
            addEmployee();
        else if (choice==2) {
            listEmployees();

        }

    }
}