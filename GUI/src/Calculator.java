import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    JFrame jFrame;
    JTextField num1, num2;
    JLabel answer;
    JButton add,divide;

    Calculator(){
        jFrame = new JFrame();
        ImageIcon logo = new ImageIcon("calc.jpg");
        jFrame.setIconImage(logo.getImage());
        jFrame.setTitle("Titan Calculator");
        jFrame.setSize(440,400);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        num1 = new JTextField();
        num1.setBounds(50,50,320,50);
        jFrame.add(num1);

        num2 = new JTextField();
        num2.setBounds(50,120,320,50);
        jFrame.add(num2);

        add = new JButton();
        add.setBounds(50,180,150,50);
        add.setText("SUM");
        add.addActionListener(this);
        jFrame.add(add);

        divide = new JButton();
        divide.setBounds(220,180,150,50);
        divide.setText("DIVIDE");
        divide.addActionListener(this);
        jFrame.add(divide);

        answer = new JLabel();
        answer.setBounds(50,220,250,50);
        answer.setText("Answer Here!");
        jFrame.add(answer);

        jFrame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==add){
            try {
                 int a = Integer.parseInt(num1.getText());
                 int b = Integer.parseInt(num2.getText());
                 int sum = a + b;
                 answer.setText("The sum of " + a + " and " + b + " is " + sum);
            }
            catch (NumberFormatException err){
                System.out.println("Input should be numbers");
            }
            catch (NullPointerException err){
                System.out.println("Supply Inputs");
            }
            catch (Exception exception){
                System.out.println("An error occurred");
            }
            finally {
                System.out.println("Captured all errors");
            }
        }

        if (e.getSource()==divide){
            try {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int quotient = a / b;
                answer.setText("The quotient of " + a + " and " + b + " is " + quotient);
            }
            catch (NumberFormatException err){
                System.out.println("Input should be numbers");
            }
            catch (NullPointerException err){
                System.out.println("Supply Inputs");
            }
            catch (Exception exception){
                System.out.println("An error occurred");
            }
            finally {
                System.out.println("Captured all errors");
            }

        }
    }
}
