package geometrie;
class Rectangle extends Quadrilatere
{
   public Rectangle()
   {
      for(int i = 0; i < 4; i++)
      {
         lesSegments[i] = new Segment();
      }
      System.out.println("Constructeur de Rectangle");
   }
   public Rectangle(Point x, Point y)
    {
       Point z = new Point(x.getX(), y.getY());
       Point t = new Point(y.getX(), x.getY());
       super(x, z, y, t);
    }
}
