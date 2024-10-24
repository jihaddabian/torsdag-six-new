package codeflow;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                this.seats[i][j] = "O"; // Initialiser alle sæder til "O"
            }
        }
        this.seats[0][0] = "X"; // Sædet til direktøren
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // Hvis sædet ikke er reserveret endnu, har det værdien "O".
    // I så fald ændres værdien til "X" og returner true.
    // Hvis sædet allerede er reserveret, returner false.
    public boolean reserve(int row, int seat) {
        if (seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) { // Korrigeret fra "x" til "X"
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        String result = ""; // Initialiser til en tom streng
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}
