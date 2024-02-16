import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class Main {
     static Scanner in= new Scanner(System.in);
    static ArrayList <Employees> employeesList = new ArrayList<>(20);
    static int size = employeesList.size();
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
    static void deleByAge()
    {
        int size=employeesList.size();
        if(size<1)
        {
            System.out.println("no Employess to delete !");
            minu();

        }
        else {
            int minRange, maxRange;
            System.out.println("enter the min age range!");
            minRange=in.nextInt();
            System.out.println("enter tha max age range ");
            maxRange=in.nextInt();
            Iterator <Employees> iterator = employeesList.iterator();
            while (iterator.hasNext()) {
                Employees x = iterator.next();
                if (x.getAge() >= minRange && x.getAge() <= maxRange) {
                    System.out.println("deleting "+x.getName());
                    iterator.remove();
                }
            }
            minu();
        }

    }
    static void deleteBySalary()
    {
        int size=employeesList.size();
        if(size<1)
        {
            System.out.println("no employees to delete !");
            minu();
        }
        else
        {
            int salary;
            System.out.println("enter the salary you want to delete from ");
            salary=in.nextInt();
            Iterator<Employees> iterator = employeesList.iterator();
            while (iterator.hasNext()) {
                Employees em = iterator.next();
                if (em.getSalary() >= salary) {
                    System.out.println("deleting "+em.getName());
                    iterator.remove(); // Safe removal using Iterator

                }
            }
        }
        minu();

    }
    static void deletEmployee()
    {
        int choice;
        System.out.printf("enter 1 to delete by salary and 2 to delete by age range ");
        choice=in.nextInt();
        if(choice==1)
            deleteBySalary();
        else if (choice==2) {
            deleByAge();

        }
        else {
            System.out.println("non valid input ");
            minu();
        }
    }
    static void updateSalary()
    {
        String name;
        int flag=0,salary;
        int size =employeesList.size();
        if(size<1) {
            System.out.println("no employees in the list ");
            minu();
        }
        else {
            System.out.println("enter employee name you want to udpate salry");
            name=in.nextLine();
            Iterator<Employees> iterator = employeesList.iterator();
            while (iterator.hasNext()) {
                Employees em = iterator.next();
                if (em.getName().equals(name)) {
                    System.out.println("enter the new salary");
                    salary=in.nextInt();
                    em.setSalary(salary);
                    flag=1;
                }
                if(flag==0)
                    System.out.println("no such employee with that name ");
                minu();
            }


        }
    }

    static void  minu()
    {
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
        else if(choice==3)
            deletEmployee();
        else if (choice==4)
            updateSalary();
        else if (choice==5)
            return;
        else {
            System.out.println("invalid input! ");
            minu();
        }



    }
}