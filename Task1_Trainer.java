package assignment2;

public class Task1_Trainer 
{
	String name;
	String department;
	String email;
	int id;
	String subject;
	
	//Parameterized constructor
	public Task1_Trainer(String trainerName, String trainerDept, String trainerEmail, int trainerId, String trainerSubject)
	{
		name = trainerName;
		department = trainerDept;
		email = trainerEmail;
		id = trainerId;
		subject = trainerSubject;
	}
	//Method to print trainer details
	public void trainerDetails(String name)
	{
		System.out.println(name+" can teach "+subject+", His department is "+department+", email is "+email+" and id is "+id);
	}

	public static void main(String[] args) 
	{
		Task1_Trainer Trainer1 = new Task1_Trainer("Mukesh", "Testing", "mukesh@gmail.com", 1,"Selenium");
		Trainer1.trainerDetails("Mukesh");
		System.out.println();
		Task1_Trainer Trainer2 = new Task1_Trainer("Hitesh", "Dev", "hitesh@gmail.com", 2, "Web Development");
		Trainer2.trainerDetails("Hitesh");
		System.out.println();
		Task1_Trainer Trainer3 = new Task1_Trainer("Ramesh", "DevOps", "ramesh@gmail.com", 3, "Devops");
		Trainer3.trainerDetails("Ramesh");

	}

}
