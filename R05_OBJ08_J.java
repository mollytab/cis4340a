
class Coordinates {
  private int x;
  private int y;
 
  private class Point {
    private void getPoint() {
      System.out.println("(" + x + "," + y + ")");
    }
  }
}
 
class AnotherClass {
  public static void main(String[] args) {
    Coordinates c = new Coordinates();
    Coordinates.Point p = c.new Point();    // Fails to compile
    p.getPoint();
  }
}
