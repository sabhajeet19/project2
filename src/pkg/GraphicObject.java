package pkg;

public abstract class GraphicObject {
	int x;
	int y;
	void moveTo(int newX, int newY) {
		System.out.println("move to x: "+x+" and y: "+y);
		
	}
	abstract void draw();
	abstract void resize();

	public static void main(String[] args) {
		

	}
	

}
