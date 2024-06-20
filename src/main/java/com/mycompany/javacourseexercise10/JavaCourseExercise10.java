

package com.mycompany.javacourseexercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitie.Employee;


public class JavaCourseExercise10 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Locale.setDefault(Locale.US);
        
        List<Employee> list = new ArrayList <>();
        
        System.out.println("How many employees will be registered? ");
        int n = s.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println("Employee # " + (i+1)+": " );
            System.out.println("Id: ");
            int id = s.nextInt();
            System.out.println("Name: ");
            s.nextLine();
            String name = s.nextLine();
            System.out.println("Salary: ");
            double salary  = s.nextDouble();
            
            Employee emp = new Employee(id, name, salary);
            
            list.add(emp);
        }
        
        System.out.println("Enter the employee's id that will have increase salary");
        int idSalary = s.nextInt();
        int pos = position(list, idSalary);
        while(pos == -1){
            System.out.println("This id does not exist"); 
            idSalary = s.nextInt();
            pos = position(list, idSalary);
        }
            System.out.println("Enter the percentage");
            double percent = s.nextDouble();
            list.get(pos).increaseSalary(percent);
        
        System.out.println("List of employees: ");
        for(Employee emp : list){
            System.out.println(emp);
        }
        s.close();
        
        
    }
    
    public static int position(List<Employee>list, int id){
        for(int i = 0; i < list.size(); i ++){
            if(list.get(i).getId() == id){
                return i;
            }
            
        }
        return -1;
    }
}
