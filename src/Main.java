import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int boardWidth = 360;
        int boardHeight = 640;
        JFrame frame = new JFrame("Flappy Bird");

        // Set frame size before setting it visible
        frame.setSize(boardWidth, boardHeight);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add your panel (FlappyBird)
        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Finally, make the frame visible
        frame.setVisible(true);
    }
}
