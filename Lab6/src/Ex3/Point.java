package Ex3;

class Point implements Comparable <Point> {
    private int x, y ;

    Point (int x, int y){
        this.x = x ;
        this.y = y ;
    }

    public void display() {
        System.out.println ( x + " " + y ) ;
    }

    public int compareTo (Point p) {
        int d1 = x * x + y * y;
        int d2 = p.x * p.x + p.y * p.y;

        if (d1 == d2) {
            return 0;
        }
        if (d1 > d2) {
            return 1;
        }
        return -1;
    }
}

