/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Sanuth
 */
public class Practice {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Mathews", "Clay", "444-44-4444");
        Employee emp2 = new Employee("Rodgers", "Aaron", "555-55-5555");
        Employee emp3 = new Employee("Brady", "Tom", "555-55-5555");
        Employee emp4 = new Employee("Ryan", "Matt", "555-55-5555");
        List employeeList = new ArrayList();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        for (Object e : employeeList) {
            Employee e1 = (Employee) e;
            System.out.println(e1);
        }
         //check Emp1 are similar with Emp2
        if (emp1.equals(emp2)) {
            System.out.println("emp1 and emp2 are same.");
            
        
        } else {
            System.out.println("emp1 and emp2 are different.");
        }
        // Use Generics
        List <Employee>empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        for(Employee e:empList){
            System.out.println(e);
        }
        
        Address address1 = new Address();
        Address address2 = new Address();

        address1.setAddress1("2602 Fielding Ln");
        address1.setCity("Waukesha");
        address1.setState("WI");
        address1.setZipCode("533188");
        address1.setPhone("2816787562");
        address1.setEmail("roshan@yahoo.com");

        address2.setAddress1("2602 Fielding Ln");
        address2.setCity("Waukesha");
        address2.setState("WI");
        address2.setZipCode("533188");
        address2.setPhone("2816787562");
        address2.setEmail("roshan@yahoo.com");

        if (address1.equals(address2)) {
            System.out.println(" Same Address");
        } else {
            System.out.println(" Different Address");
        }
        
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        dog1.setName("Brownie");
        dog1.setRabiesId(12345);
        dog2.setName("Fido");
        dog2.setRabiesId(67890);
        dog3.setName("Brownie");
        dog3.setRabiesId(12345);
        dog4.setName("Max");
        dog4.setRabiesId(12345);
        if(dog1.equals(dog2)){
            System.out.println("Dog1 ang Dog2 are same");
        }else{
            System.out.println("Dog1 and Dog2 are different.");
        }
        // Lab4 Use set
        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
        Set<Dog> noDuplicate = new HashSet<>(dogList);
        dogList = new ArrayList<>(noDuplicate);
        for(Dog d:dogList){
            System.out.println(d);
        }
    }

   
}
