package June25Program.twoDarray;

public class fourth {
    public static void main(String[] args) {
        int a[][]={{1,2,7},{2,4},{4,5,9}};
        int i=0;
        do {
            int j =0;
                        do {
                            System.out.println(a[i][j]);
                            j++;
                         } while (j<a[i].length);
            i++;
        } while (i<a.length);
        
}
}