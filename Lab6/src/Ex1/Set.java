package Ex1;

public class Set{

    private int first;
    private int second;
    private int third;

    public Set( int first, int second, int third ) {
        this.first = first;
        this.second = second;
        this.third = third;
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
