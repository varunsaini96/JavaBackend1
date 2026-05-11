package Others;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.compare;

public class ComparatorInterface {
    static class Point{
        int x,y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        public String toString(){
            return "(" + x + ","+ y+")";
        }
    }
//    1st method
static class MyComp implements Comparator<Point>{
        public int compare(Point p1, Point p2){
            return p1.x-p2.x;
        }
}
//2nd method use lambda
public static void main(String[] args) {
    Point []arr = {new Point(10,20), new Point(5,45), new Point(25,35)};
    Arrays.sort(arr,new MyComp());
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr,(a1,a2)->a1.x-a2.x);
    System.out.println(Arrays.toString(arr));
}
}
