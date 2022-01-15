package pkg;

public class Cuboid {
	int width;
	int height;
	int depth;
	Cuboid(int width,int height,int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	Cuboid(int width,int height){
		this.width = width;
		this.height= height;
		this.depth = 10;
	}
	Cuboid(int dimension){
		this.width = dimension;
		this.height = dimension;
		this.depth = dimension;
	}
    Cuboid(){
    	this.width = 10;
    	this.height = 10;
    	this.depth = 10;
    }
    int volume() {
    	return width*height*depth;
    }
	public static void main(String[] args) {
		int volume;
		Cuboid stdcuboid = new Cuboid(10,25,35);
		volume = stdcuboid.volume();
		System.out.println("volume of simple cuboid is: "+volume);
		Cuboid cuboidwithdefaults = new Cuboid(10,20);
		volume = cuboidwithdefaults.volume();
		System.out.println("volume of cuboid with defaults depth is: "+volume);
		Cuboid cube = new Cuboid(10);
		volume = cube.volume();
		System.out.println("volume of cube is: "+volume);
		Cuboid defaultCuboid = new Cuboid();
		defaultCuboid.volume();
		System.out.println("volume of default cuboid is: "+volume);
			/*int sum = 0;
		for(int i = 1;i<=100;i++) {
			sum = sum+i;
			System.out.println(sum+" ");
			
		}
		System.out.println(sum);*/
		

	}

}
