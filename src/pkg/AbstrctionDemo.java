package pkg;


public class AbstrctionDemo {

	public static void main(String[] args) {
		GraphicObject circle = new Circle();
		circle.draw();
		circle.resize();
		GraphicObject  rectangle = new Rectangle();
		rectangle.draw();
		rectangle.resize();
	}

}
