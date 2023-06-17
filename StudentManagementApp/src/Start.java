import java.util.Scanner;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {
	
public static void main(String[] args) {
	System.out.println("welcome to student management app");
	Scanner sc=new Scanner(System.in);
	while(true) 
		System.out.println("press 1 to add student");
		System.out.println("press 2 to delete student");
		System.out.println("press 3 to display student");
		System.out.println("press 4 to exit app");
		int c= sc.nextInt();
	
		if(c==1) {
			
			//add student
			Scanner k=new Scanner(System.in);
			System.out.println("enter user name : ");
			String name = k.nextLine();
			
			System.out.println("enter user phone : ");
			String phone = k.nextLine();
			
			System.out.println("enter user city : ");
			String city = k.nextLine();
			
			
			Student st= new Student(name, phone, city);
			boolean answer = StudentDao.insertStudentToDB(st);
			if(answer) {
					System.out.println("student is added successfully");
			}else {
				System.out.println("something went wrong");
			}
			
			System.out.println(st);
			
		}
		else if(c==2) {
			//delete student
			System.out.println("enter id to delete student");
			int userId=sc.nextInt();
			boolean f = StudentDao.deleteStudent(userId);
			if(f) {
				System.out.println("Deleted.........");
			}else {
				System.out.println("something went wrong...........");
			}
			
			
		}
		else if(c==3) {
			
			//display all students	
			StudentDao.showAllStudent();
			
		}
		else if(c==4) {
			break;
		}
		else {
			
		}
	}
	
}
}
