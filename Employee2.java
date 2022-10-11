public class Employee2 
{

   int empId;  
   String empName;  
	    

public Employee2(int id, String name)
{  
    empId = id;  
    empName = name;  
}  
void info()
{
    System.out.println("Id: "+empId+" Name: "+empName);
}  
	   
 public static void main(String args[])
 {  
	Employee2 obj1 = new Employee2(10245,"MURALI");  
	Employee2 obj2 = new Employee2(92232,"KAVIN");  
	obj1.info();  
	obj2.info();  
   }  
}
