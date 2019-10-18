class Point {
	double x, y;
	
	//构造方法名称和类名必须保持一致
	/*
	  构造器虽然有返回值，但不能定义返回值类型（肯定是本类）不能在
	 构造器里使用return返回某个值
	 */
	//如果没有定义构造器，会自动定义一个无参构造函数
	
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
