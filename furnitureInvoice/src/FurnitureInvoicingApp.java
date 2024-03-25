import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FurnitureInvoicingApp extends JFrame {

    private JTextField widthField;
    private JTextField lengthField;
    private JComboBox<String> woodTypeComboBox;
    private JSpinner drawersSpinner;
    private JTextField tablesField;
    private JTextField amountTenderedField;
    private JTextArea resultTextArea;

    public FurnitureInvoicingApp() {
        setTitle("Antique Furniture Kenya Limited");
        setSize(400, 450); // Increase the height
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(9, 2, 10, 10)); // Adjust the layout
        initComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        JLabel widthLabel = new JLabel("Enter table width (cm): ");
        JLabel lengthLabel = new JLabel("Enter table length (cm): ");
        JLabel woodTypeLabel = new JLabel("Enter wood type (Mahogany/Oak/Pine): ");
        JLabel drawersLabel = new JLabel("Enter number of drawers (0-6): ");
        JLabel tablesLabel = new JLabel("Enter the number of tables: ");
        JLabel amountTenderedLabel = new JLabel("Enter amount tendered: ");
        JButton calculateButton = new JButton("Generate Invoice");

        widthField = new JTextField();
        lengthField = new JTextField();
        woodTypeComboBox = new JComboBox<>(new String[]{"Mahogany", "Oak", "Pine"});
        drawersSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 6, 1));
        tablesField = new JTextField();
        amountTenderedField = new JTextField();
        resultTextArea = new JTextArea(); // Change from JLabel to JTextArea
        resultTextArea.setEditable(false); // Make it non-editable
        JScrollPane scrollPane = new JScrollPane(resultTextArea); // Add a scroll pane

        add(widthLabel);
        add(widthField);
        add(lengthLabel);
        add(lengthField);
        add(woodTypeLabel);
        add(woodTypeComboBox);
        add(drawersLabel);
        add(drawersSpinner);
        add(tablesLabel);
        add(tablesField);
        add(amountTenderedLabel);
        add(amountTenderedField);
        add(calculateButton);
        add(scrollPane);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTotalCost();
            }
        });
    }

    private void calculateTotalCost() {
        try {
            int tableWidth = Integer.parseInt(widthField.getText());
            int tableLength = Integer.parseInt(lengthField.getText());
            String woodType = (String) woodTypeComboBox.getSelectedItem();
            int numDrawers = (int) drawersSpinner.getValue();
            int numTables = Integer.parseInt(tablesField.getText());
            double amountTendered = Double.parseDouble(amountTenderedField.getText());

            Table table = null;

            if (woodType.equalsIgnoreCase("Mahogany")) {
                table = new Mahogany(tableWidth, tableLength, numDrawers);
            } else if (woodType.equalsIgnoreCase("Oak")) {
                table = new Oak(tableWidth, tableLength, numDrawers);
            } else if (woodType.equalsIgnoreCase("Pine")) {
                table = new Pine(tableWidth, tableLength, numDrawers);
            } else {
                resultTextArea.setText("Invalid wood type. Please try again.");
                return;
            }

            double discount = (numTables > 1) ? 0.05 : 0.0;
            double totalCost = (table.calculateBasePrice() + table.calculateTotalCost()) * numTables;
            int drawerCost = table.getDrawerCost();
            double finalCost = (totalCost - (discount * totalCost));

            // Use append() instead of setText() for JTextArea
            resultTextArea.setText("-------- INVOICE --------\n" +
                    "Table dimensions: " + tableWidth + "cm x " + tableLength + "cm\n" +
                    "Table area: " + table.getArea() + "cm²\n" +
                    "Base price: Ksh " + table.calculateBasePrice() + "\n" +
                    "Wood type: " + woodType + "\n" +
                    "Extra cost for wood: Ksh " + table.woodPrice() + "\n" +
                    "Number of drawers: " + numDrawers + "\n" +
                    "Drawer Cost: Ksh " + drawerCost + "\n" +
                    "Total cost: Ksh " + totalCost + "\n" +
                    "Discount: Ksh " + (discount * totalCost) + "\n" +
                    "Final cost: Ksh " + finalCost + "\n" +
                    "Amount Tendered: Ksh " + amountTendered + "\n" +
                    "Change (Balance): Ksh " + (amountTendered - finalCost) + "\n" +
                    "\nThank you for choosing Antique Furniture Kenya Limited!\n" +
                    "We are located in Westlands, Nairobi. Come shop with us again.");
        } catch (NumberFormatException ex) {
            resultTextArea.setText("Invalid input. Please enter valid numeric values.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FurnitureInvoicingApp());
    }
}
