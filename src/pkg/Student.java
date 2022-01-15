package pkg;

public class Student {

	
		String name;
		int age;
		String address;
		public Student(String name,int age,String address) {
			this.name = name;
			this.age = age;
			this.address = address;
			
		}
		public void setName(String name) {
			this.name = name;
			
		}
		public void setAge(int age) {
			this.age = age;
			
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getName() {
			return name;
		}
		public int getAge(){
			return age;
		}
		public String getAddress() {
			return address;
		}
		@Override
		public String toString() {
			return("Student name is "+this.getName()+", age is "+this.getAge()+" and address is :"+
		this.getAddress());
		}
		
		public static void main(String[] args) {
    Student john = new Student("Jhon",25,"155,Sector-22, noida");
    System.out.println(john.toString());
    Student mohan = new Student("Mohan" , 36,"166, noida, India ");
    System.out.println(mohan.getName());
    System.out.println(mohan.getAge());
    System.out.println(mohan.getAddress());
	}

}
