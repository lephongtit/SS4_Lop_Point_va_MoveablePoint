public class Main {
    public static void main(String[] args) {
        Point point =new Point();
        System.out.println(point);
        System.out.println();
        Point point1=new Point(6,5);
        System.out.println(point1);
        System.out.println();

        MovablePoint movablePoint=new MovablePoint();
        movablePoint.move();
        System.out.println(movablePoint);

        System.out.println();

        MovablePoint movablePoint1=new MovablePoint(2,3,6,5);
        movablePoint1.move();
        System.out.println(movablePoint1);



    }
}
