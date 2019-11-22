package TebakOutputUrutan;

public class TebakOutputUrutan {
    public static void main( String args[] ) {
        String cetak = "";
        int x;
        for ( x = 1; x <= 10; x++ ) {
            if ( x == 5 )
                continue;
            cetak = cetak + x + " ";
            }
            System.out.println(cetak);
        }
    }
