class Point {
	double x, y;
	
	//���췽�����ƺ��������뱣��һ��
	/*
	  ��������Ȼ�з���ֵ�������ܶ��巵��ֵ���ͣ��϶��Ǳ��ࣩ������
	 ��������ʹ��return����ĳ��ֵ
	 */
	//���û�ж��幹���������Զ�����һ���޲ι��캯��
	
	public Point(double _x, double _y) {
		x = _x;
		y = _y;
	}
	
	public double getDistance(Point q) {
		return Math.sqrt((x - q.x)*(x - q.x)+(y - q.y)*(y-q.y));
	}
}

public class TestConstructor {
	public static void main(String[] args) {
		Point p = new Point(3.0,4.0);
		Point origin = new Point(0.0,0.0);
		System.out.println(p.getDistance(origin));
	}
}
