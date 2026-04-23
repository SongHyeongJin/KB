package day_0423.practice.exam04_02;

public class TestShape {
	public static void main(String[] args) {
		// 부모 타입 배열 생성
		Shape[] shape = new Shape[2];

		// 자식 객체 생성하여 부모 타입 배열에 저장
		shape[0] = new Circle("원", 10);
		shape[1] = new Rectangular("직사각형", 10, 20);

		// 배열 내 모든 도형 객체 순회
		for (Shape s : shape) {
			s.calculationArea(); // 면적 계산
			s.print(); // 출력
		}
	}
}