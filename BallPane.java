/**
 * BallPane: This program demonstrates how to move a ball using buttons.
 * It also includes a simple menu system that allows the user to exit the program.
 *
 * @author Cinthia Mariana Ochoa Torre
 * @version 1.0
 * @since 12 May 2023
 */
import javax.swing.*;
import java.awt.*;
// BallPane is used to create a custom JPanel
public class BallPane extends JPanel {
    private int ballX = 50;
    private int ballY = 50;
    private int ballDiameter = 50;

    /**
     * moveBallLeft: This method moves the ball to the left by 10 pixels, as
     * long as it is not already at the left boundary of the JPanel.
     */
    public void moveBallLeft() {
        if (ballX > 0) {
            ballX -= 10;
            repaint();
        }
    } // End of method moveBallLeft

    /**
     * moveBallRight: This method moves the ball to the right by 10 pixels, as
     * long as it is not already at the right boundary of the JPanel.
     */
    public void moveBallRight() {
        if (ballX < getWidth() - ballDiameter) {
            ballX += 10;
            repaint();
        }
    } // End of method moveBallRight

    /**
     * moveBallUp :This method moves the ball up by 10 pixels, as long as it is
     * not already at the top boundary of the JPanel.
     */
    public void moveBallUp() {
        if (ballY > 0) {
            ballY -= 10;
            repaint();
        }
    } // End of method moveBallUp

    /**
     * moveBallDown : This method moves the ball down by 10 pixels, as long as it
     * is not already at the bottom boundary of the JPanel.
     */
    public void moveBallDown() {
        if (ballY < getHeight() - ballDiameter) {
            ballY += 10;
            repaint();
        }
    } // End of method moveBallDown

    /**
     * paintComponent(Graphics g) : This method paints the blue ball on the JPanel.
     *
     * @param g: the Graphics object used to paint the ball
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(ballX, ballY, ballDiameter, ballDiameter);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Move the Ball");
        BallPane ballPane = new BallPane();
        frame.getContentPane().add(ballPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");
        buttonPanel.add(leftButton);
        buttonPanel.add(rightButton);
        buttonPanel.add(upButton);
        buttonPanel.add(downButton);
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        leftButton.addActionListener(e -> ballPane.moveBallLeft());
        rightButton.addActionListener(e -> ballPane.moveBallRight());
        upButton.addActionListener(e -> ballPane.moveBallUp());
        downButton.addActionListener(e -> ballPane.moveBallDown());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }  // End of method paintComponent(Graphics g)
} // End of class BallPane