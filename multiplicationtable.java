public class multiplicationtable {
    public static void main(String[] args) {
        int[][] table = new int[10][10];
        table[0][0]=0;

        // Fill the 2D array with multiplication values
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                table[i][j] = i * j;
            }
        }

        // Print the multiplication table
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d ", table[i][j]);
            }
            System.out.println();
        }
    }
}
