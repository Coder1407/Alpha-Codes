public class XII_GridWays {
    public static int gridWays(int i, int j, int n, int m) {
        //base case
        if(i==n-1 && j==m-1) { //last cell
            return 1;
        }
        else if(i==n || j==m) { // boundary cross condition
            return 0;
        }
        // down
        int w1 = gridWays(i+1, j, n, m);
        //right
        int w2 = gridWays(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3, m=3;
        System.out.println(gridWays(0,0,n,m));
    }
}
