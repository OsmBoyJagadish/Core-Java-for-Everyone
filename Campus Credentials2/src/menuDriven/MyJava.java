package menuDriven;
import java.util.*;

class Student{
	int sid[]=new int[10];
	String sname[]=new String[10];
	String scity[]=new String[10];
	String smob[]=new String[10];
	int i=0;
	
	Scanner sc = new Scanner(System.in);
	
	public void addStudent(){
		System.out.println("Enter id of Student : ");
		sid[i]=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name of Student : ");
		sname[i]=sc.nextLine();
		System.out.println("Enter city of Student : ");
		scity[i]=sc.nextLine();
		System.out.println("Enter mobile no. of Student : ");
		smob[i]=sc.nextLine();
		++i;
	}
	
	public void updateStudent(){
		System.out.println("Enter Student Id : ");
		int id=sc.nextInt();
		for(int j=0;j<i;j++){
			if(id==sid[j]){
				System.out.println("Student Id: "+sid[j]);
				System.out.println(("1. Student Name: "+sname[j]));
				System.out.println(("2. Student city: "+scity[j]));
				System.out.println(("3. Student mobile: "+smob[j]));
				System.out.println("Enter what to Update in this: ");
				int n1=sc.nextInt();
				sc.nextLine();
				switch(n1){
				case 1:
					System.out.println("Enter new Name of student");
					String name = sc.nextLine();
					sname[j]=name;
					System.out.println("Record updated successfully...");
				case 2:
					System.out.println("Enter new city of student");
					String city = sc.nextLine();
					scity[j]=city;
					System.out.println("Record updated successfully...");
				case 3:
					System.out.println("Enter new Mobile no. of student");
					String mob = sc.nextLine();
					smob[j]=mob;
					System.out.println("Record updated successfully...");
				default:
					System.out.println("Please Enter from the above choices");
				}
			}
		}
	}
	
	public void showStudent(){
		System.out.println("Id\t\tName\t\tCity\t\tMobile");
		for(int j=0;j<i;j++){
			System.out.println(sid[j]+"\t"+"\t"+sname[j]+"\t"+"\t"+scity[j]+"\t"+"\t"+smob[j]);
		}
		
	}
	
	public void deleteStudent(){
		System.out.println("Enter student id you want to delete: ");
		int id = sc.nextInt();
		for(int j=0;j<i;j++){
			if(id==sid[j]){
				for(int k=j;k<i;k++){
					sid[k]=sid[k+1];
					sname[k]=sname[k+1];
					scity[k]=scity[k+1];
					smob[k]=smob[k+1];
				}
				--i;
			}
		}
		System.out.println("Student Details Deleted Successfully...");
	}
}
public class MyJava{
	public static void main(String[] args) {
		Student s = new Student();

			Scanner sc = new Scanner(System.in);

			while(true){
				System.out.println("Select an Options: ");
				System.out.println("1. Add Student");
				System.out.println("2. Update Student");
				System.out.println("3. Delete Student");
				System.out.println("4. Show Student");
				System.out.println("5. Exit");
				int ch = sc.nextInt();

				switch(ch){
				case 1: 
					s.addStudent();
					break;
				case 2: 
					s.updateStudent();
					break;
				case 3: 
					s.deleteStudent();
					break;
				case 4: 
					s.showStudent();
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Please Enter from the above choices");
			}
		}

	}
}