public class HeronsFormula {
  public static void main(String[] args) {
    double a, g;
    String tws = "A triangle with sides ";

    a = triangleArea(3, 3, 3);
    System.out.println("A triangle with side 3,3,3 has area " + a);

    a = triangleArea(3, 4, 5);
    System.out.println("A triangle with sides 3,4,5 has area " + a);
    g = triangleArea(7, 8, 9);
    System.out.println(tws + "7,8,9 ahs area " + g);

    System.out.println(tws + "5,12,13 has area " + triangleArea(5, 12, 13) );
    System.out.println(tws + "10,9,11 has area " + triangleArea(10, 9, 11) );
    System.out.println(tws + "8,15,17 has area " + triangleArea(8, 15, 17) );



  }

  // This function computes the area of a triangle wih side lengths a, b, & c.
  public static double triangleArea( double a, double b, double c ) {
    // Fixed 'throwing away the remainders' by using double instead of integer
    double s, A;

    s = (a+b+c) / 2;
    A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );

    // After computing the area, you must "return" the computed value:
    return A;



  }



}
