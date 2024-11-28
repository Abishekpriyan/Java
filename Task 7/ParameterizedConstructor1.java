package AllProgramming;

public class ParameterizedConstructor1 {

int eid;
String ename;
float salary;
String location;

ParameterizedConstructor1(int id,String name,float sal,String loc){
	this.eid=id;
	this.ename=name;
	this.salary=sal;
	this.location=loc;
}

void Display() {
	System.out.println("Emp ID   : "+eid+"\n"+"Emp Name : "+ename+"\n"+"Salary   : "+salary+"\n"+"Location : "+location+"\n");
}

public static void main(String[] args) {
	ParameterizedConstructor1 p1=new ParameterizedConstructor1(101,"Ram",70000.00f,"Chennai");
	ParameterizedConstructor1 p2=new ParameterizedConstructor1(102,"Ramu",50000.00f,"Madurai");
	ParameterizedConstructor1 p3=new ParameterizedConstructor1(103,"Ramesh",60000.00f,"Arcot");
	ParameterizedConstructor1 p4=new ParameterizedConstructor1(104,"Rajesh",40000.00f,"Vellore");
	p1.Display();
	p2.Display();
	p3.Display();
	p4.Display();
}
}