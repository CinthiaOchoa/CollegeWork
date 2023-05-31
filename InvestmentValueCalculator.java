/**
 *InvestmentValueCalculator : This class represents a GUI application for calculating the future
 *value of an investment based on its initial amount,
 *the annual interest rate, and the number of years it will be invested.
 *It uses a simple formula to calculate the future value
 *and displays it on the GUI when the user clicks the "Calculate" button.
 *@param none
 *@author Cinthia Mariana Ochoa Torre
 *@version 1.0
 *@since 13 May 2023
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InvestmentValueCalculator extends JFrame implements ActionListener {

    private JLabel labelInvestmentAmount, labelNumberOfYears, labelAnnualInterestRate, labelFutureValue;
    private JTextField textFieldInvestmentAmount, textFieldNumberOfYears, textFieldAnnualInterestRate, textFieldFutureValue;
    private JButton buttonCalculate;

    public InvestmentValueCalculator() {
        setTitle("Investment Value Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        labelInvestmentAmount = new JLabel("Investment Amount:");
        labelInvestmentAmount.setBounds(30, 30, 150, 20);
        add(labelInvestmentAmount);

        textFieldInvestmentAmount = new JTextField();
        textFieldInvestmentAmount.setBounds(180, 30, 150, 20);
        add(textFieldInvestmentAmount);

        labelNumberOfYears = new JLabel("Number of Years:");
        labelNumberOfYears.setBounds(30, 60, 150, 20);
        add(labelNumberOfYears);

        textFieldNumberOfYears = new JTextField();
        textFieldNumberOfYears.setBounds(180, 60, 150, 20);
        add(textFieldNumberOfYears);

        labelAnnualInterestRate = new JLabel("Annual Interest Rate:");
        labelAnnualInterestRate.setBounds(30, 90, 150, 20);
        add(labelAnnualInterestRate);

        textFieldAnnualInterestRate = new JTextField();
        textFieldAnnualInterestRate.setBounds(180, 90, 150, 20);
        add(textFieldAnnualInterestRate);

        buttonCalculate = new JButton("Calculate");
        buttonCalculate.setBounds(150, 130, 100, 30);
        buttonCalculate.addActionListener(this);
        add(buttonCalculate);

        labelFutureValue = new JLabel("Future Value:");
        labelFutureValue.setBounds(30, 180, 150, 20);
        add(labelFutureValue);

        textFieldFutureValue = new JTextField();
        textFieldFutureValue.setBounds(180, 180, 150, 20);
        add(textFieldFutureValue);

        setVisible(true);
    }

    /**
     *This method is the entry point of the application. It creates a new instance of the InvestmentValueCalculator class,
     *which launches the GUI application.
     *@param args The command-line arguments passed to the program (not used in this application).
     */
    public static void main(String[] args) {
        new InvestmentValueCalculator();
    }

    /**
     *This method is called when the user clicks the "Calculate" button. It retrieves the investment amount,
     *annual interest rate, and number of years from the text fields, calculates the future value of the investment,
     *and displays it in the appropriate text field on the GUI.
     *@param e The ActionEvent object representing the "Calculate" button click event.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonCalculate) {
            double investmentAmount = Double.parseDouble(textFieldInvestmentAmount.getText());
            int numberOfYears = Integer.parseInt(textFieldNumberOfYears.getText());
            double annualInterestRate = Double.parseDouble(textFieldAnnualInterestRate.getText());
            double monthlyInterestRate = annualInterestRate / 1200.0;
            double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
            textFieldFutureValue.setText(String.format("%.2f", futureValue));
        }
    }
} // End of InvestmentValueCalculator
