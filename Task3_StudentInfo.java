package assignment2;

import java.util.Scanner;

public class Task3_StudentInfo 
{
	String name;
	long phone;
	String email;
	String address;
	String status;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of students");
		int num= sc.nextInt();
		
		Task3_StudentInfo students[] = new Task3_StudentInfo[num];
		
		for (int i=0; i<num;i++)
		{
			students[i]=new Task3_StudentInfo();
			System.out.println("Please enter name");
			students[i].name=sc.next();
			System.out.println("Please enter email");
			students[i].email=sc.next();
			System.out.println("Please enter phone");
			students[i].phone=sc.nextLong();
			System.out.println("Please enter address");
			students[i].address=sc.next();
			System.out.println("Please enter status");
			students[i].status=sc.next();
			System.out.println();
		}
		
		System.out.println("Please enter which student details you are looking for");
		int studentId = sc.nextInt();
		
		System.out.println(students[studentId].name);
		System.out.println(students[studentId].email);
		System.out.println(students[studentId].phone);
		System.out.println(students[studentId].address);
		System.out.println(students[studentId].status);
		sc.close();
	}

}
