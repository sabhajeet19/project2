package pkg;

public class Employee extends Manager {
public void info(int id,int sal,String name) {
	String s = id+","+sal+","+name;
	System.out.println(s);
}
	public void move() {
		System.out.println("Child class move");
	
}
	public static void main(String[] args) {
		Employee em = new Employee();
		em.info(26, 15000, "Sanjay1");
		em.info(27, 16000, "Sanjay2");
		em.info(28, 17000, "Sanjay3");
		em.info(29, 18000, "Sanjay4");
		em.info(30, 19000, "Sanjay5");

	}

}
