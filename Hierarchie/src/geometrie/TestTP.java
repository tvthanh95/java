package geometrie;

public class TestTP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point(5.1, 2.0, "A");
		Point p2 = new Point();
		Point p3 = new Point (1.1,6.0, "B");
		Point p4 = new Point (3.8,7.5, "C");
		
		System.out.println(p1 + "  " + p2 );
		System.out.println("Distance " + p1.distance(p2) );
		
		Quadrilatere quad=new Quadrilatere();
		System.out.println(quad);
		Quadrilatere quad2=new Quadrilatere(p1,p2,p3,p4);
		System.out.println(quad2);
	}

}
