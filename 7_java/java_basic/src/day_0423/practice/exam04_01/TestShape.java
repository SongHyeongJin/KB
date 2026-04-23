package day_0423.practice.exam04_01;

public class TestShape {
	public static void main(String[] args) {
		Shape [] shape = new Shape[2];

		Circle c = new Circle();
		Rectangular r = new Rectangular();
		c.setRadius(10);

		r.setName("직사각형");
		r.setWidth(20);
		r.setHight(10);

		shape[0] = c;
		shape[1] = r;

		for(int i = 0; i < shape.length; i++) {
			shape[i].calculationArea();
			shape[i].print();
		}
	}
}