
public class SoftwareEngineer extends Employee {

	private int bonus;

	public SoftwareEngineer(int id, String name, int salary, int bonus) {
		super(id, name, salary);
		this.bonus=bonus;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SoftwareEngineer E= new SoftwareEngineer (666, "Subodh" , 100000,6000);
		System.out.println("Name:"+ E.name);
		System.out.println("ID:"+ ""+E.id);
		System.out.println("Salary:"+E.salary);
		System.out.println("Bonus:"+E.bonus);

	}

}
