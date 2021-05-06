import java.lang.*;
/*
There are many ways to create object in java
1. By new Keyword
2.By newInstance()
3.By clone()
4.By deserialization
5.By factory method

 */
/*
There are three ways to initialize object in Java
1.By reference variable
2.By method
3.By Constructor
 */
class Human{
    int age;
    String name;
}
class Car{
    int carNo;
    String carName;

    void insert(int no,String str){
        carNo = no;
        carName = str;
    }
    void display(){
        System.out.println("Car No:"+carNo+"\t"+"Car Name:"+"\t"+carName);
    }
}
class Employee{
    int id;
    String name;
    double salary;

    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void displayData(){
        System.out.println("Id No: "+id+"\n"+"Name : "+name+"\n"+"Salary: "+salary);
    }
}
class SumOfNumber{
    int num1;
    int num2;
    SumOfNumber(int n1,int n2){
        num1=n1;
        num2=n2;
    }
    void display(){
        System.out.println("Sum :\t"+(num1+num2));
    }
}
public class Practice {
    int id;
    String name;
//Object in main within the class
    public static void main(String[] args) {
        Practice obj = new Practice();//
        obj.id=25;
        obj.name = "CodexRitik";
        System.out.println("Id\s"+obj.id+"Name\s"+obj.name);

        // 1.Object Initialization through reference

        //Human Class Object
        Human human = new Human();//Object Outside the class
        human.age=15;
        human.name="Ritik";

        //2. Initialization through Method

        //Car Class Object
        Car car = new Car();
        car.insert(20,"Tata Nano");
        car.display();

        //3.Initialization through Constructor

        //Employee Class Object
        Employee emp = new Employee(25,"CodexRitik",75000.00);
        emp.displayData();

        //Anonymous Object
        // SumOfNumber Class Object
        new SumOfNumber(5,6).display();

    }
}
