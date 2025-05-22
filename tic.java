import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends Frame implements ActionListener {
    private Button[] buttons = new Button[9]; // Array of buttons for the grid
    private int turn = 1; // Variable to keep track of turns

    // Constructor to set up the game
    public TicTacToe() {
        setLayout(new GridLayout(4, 3)); // Layout for the grid
        for (int i = 0; i < 9; i++) {
            buttons[i] = new Button(""); // Create a button
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 60)); // Set font size
            buttons[i].addActionListener(this); // Add action listener
            add(buttons[i]); // Add button to the frame
        }

        Button startButton = new Button("Start"); // Start button
        startButton.setFont(new Font("Arial", Font.BOLD, 30));
        startButton.addActionListener(e -> visible()); // Show buttons on start
        add(startButton);

        setTitle("Tic-Tac-Toe"); // Set the title of the window
        setSize(400, 400); // Set the size of the window
        setVisible(true); // Make the window visible
    }

    // Method to make the game buttons visible
    public void visible() {
        for (Button button : buttons) {
            button.setEnabled(true); // Enable the buttons
        }
        turn = 1; // Reset turn
    }

    // Method to restart the game
    public void restart() {
        for (Button button : buttons) {
            button.setLabel(""); // Clear the labels
        }
        turn = 1; // Reset turn
    }

    // Method to check for a winner
    public void winner() {
        String[][] board = new String[3][3];
        for (int i = 0; i < 9; i++) {
            board[i / 3][i % 3] = buttons[i].getLabel(); // Create a board array
        }

        String winner = null; // Variable to store the winner
        for (int i = 0; i < 3; i++) {
            // Check rows and columns
            if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && !board[i][0].equals("")) {
                winner = board[i][0];
            }
            if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && !board[0][i].equals("")) {
                winner = board[0][i];
            }
        }

        // Check diagonals
        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals("")) {
            winner = board[0][0];
        }
        if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals("")) {
            winner = board[0][2];
        }

        // Display winner or draw
        if (winner != null) {
            showDialog(winner.equals("*") ? "Winner Player 1" : "Winner Player 2");
            restart();
        } else if (turn > 9) {
            showDialog("Draw");
            restart();
        }
    }

    // Action performed method for button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        Button source = (Button) e.getSource(); // Get the source button
        if (source.getLabel().equals("")) {
            if (turn % 2 == 1) {
                source.setLabel("*");
            } else {
                source.setLabel("0");
            }
            turn++;
            winner(); // Check for winner after each move
        }
    }

    // Method to show a dialog with the result
    public void showDialog(String message) {
        Dialog d = new Dialog(this, "Result", true);
        d.setLayout(new FlowLayout());
        d.add(new Label(message));
        Button b = new Button("OK");
        b.addActionListener(e -> d.setVisible(false));
        d.add(b);
        d.setSize(200, 100);
        d.setVisible(true);
    }

    // Main method to start the game
    public static void main(String[] args) {
        new TicTacToe();
    }
}
