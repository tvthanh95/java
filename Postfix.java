import java.util.*;
class Postfix
{
  public static boolean precedent(String st1, String st2)
  {
    String p1 = new String("^");
    String p2 = new String("*/");
    String p3 = new String("+-");
    if(((p1.indexOf(st1) != -1) && ((p2.indexOf(st2) != -1) || p3.indexOf(st2) != -1))
      || ((p2.indexOf(st1) != -1) && (p3.indexOf(st2) != -1)))
    {
      return true;
    }
    return false;
  }
  public static boolean isOperator(String st)
  {
      String operator = "+-*/()^";
      if(operator.indexOf(st) != -1)
        return true;
      return false;
  }
  public static ArrayList<String> toPostfix(String exp)
  {
    ArrayList<String> post = new ArrayList<String>();
    Stack<String> stack = new Stack<String>();
    Scanner sc = new Scanner(exp);
    String input;
    String tmp;
    while(sc.hasNext())
    {
      input = sc.next();
      if(isOperator(input))
      {
        if(input.equals(")"))
        {
          while(!stack.peek().equals("("))
          {
            tmp = stack.pop();
            post.add(tmp);
          }
          tmp = stack.pop();
        }
        else
        {
          if(!stack.isEmpty() && precedent(stack.peek(), input))
          {
            tmp = stack.pop();
            post.add(tmp);
          }
          stack.push(input);
        }
      }
      else
        post.add(input);
    }
    while(!stack.isEmpty())
    {
      tmp = stack.pop();
      post.add(tmp);
    }
    return post;
  }
  public static void main(String[] args)
  {
    String exp = new String("( 12 * 3 ) + 5 / ( 6 + 3 )");
    ArrayList<String> ar = toPostfix(exp);
    System.out.println(ar.toString());
  }
}