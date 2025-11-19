public class bort {
    public boolean won = false;
    private char[][] borty;

    // Constructor to initialize the array
    public void bort() {
        borty = new char[3][3]; // Initialize the array first

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                borty[i][j] = '-';
            }
        }
    }
    final char[][] getBorty (){
    	return borty;
    }
}
