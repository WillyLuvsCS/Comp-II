package Ex2;

public class Set implements Comparable <Set> {

    private int first;
    private int second;
    private int third;

    public Set( int first, int second, int third ) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public int compareTo( Set other ) {
        if ( first < other.first ) {
            return -1;
        }
        if ( first > other.first ) {
            return 1;
        }

        if ( second < other.second ) {
            return -1;
        }
        if ( second > other.second ) {
            return 1;
        }

        if ( third < other.third ) {
            return -1;
        }
        if ( third > other.third ) {
            return 1;
        }

        return 0;
    }

    public boolean equals( Set other ) {
        if ( other == null ) {
            return false;
        }

        return first == other.first && second == other.second && third == other.third;
    }

    public String toString() {
        return "(" + first + "," + second + "," + third + ")";
    }

}

