package assignment2;

public class Task2_TrainerArray2 
{
	String name;
	String department;
	String email;
	int id;
	
	
	public void trainerDetails(String course)
	{
		System.out.println(name+" can teach "+course+", His department is "+department+", email is "+email+" and id is "+id);
	}

	public static void main(String[] args) 
	{
		Task2_TrainerArray2  Trainer[] = new Task2_TrainerArray2 [3];
		
		Trainer[0] = new Task2_TrainerArray2();
		Trainer[0].name="Mukesh";
		Trainer[0].department="Testing";
		Trainer[0].email="mukesh@gmail.com";
		Trainer[0].id=1;
		Trainer[0].trainerDetails("selenium");
		System.out.println();
		
		Trainer[1] = new Task2_TrainerArray2();
		Trainer[1].name="Hitesh";
		Trainer[1].department="Dev";
		Trainer[1].email="hitesh@gmail.com";
		Trainer[1].id=2;
		Trainer[1].trainerDetails("Web Development");
		System.out.println();
		
		Trainer[2] = new Task2_TrainerArray2();
		Trainer[2].name="Ramesh";
		Trainer[2].department="Devops";
		Trainer[2].email="ramesh@gmail.com";
		Trainer[2].id=3;
		Trainer[2].trainerDetails("Devops");

	}

}
