import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpirographFrame extends JFrame {
    public SpirographFrame() {
        setSize(800, 800);
        setTitle("Spirograph Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());
        SpirographView sv = new SpirographView();

        JTextField lrField = new JTextField("200");
        JTextField srField = new JTextField("75");
        JTextField pdField = new JTextField("55");
        JTextField nsField = new JTextField("8000");
        JTextField apsField = new JTextField("0.007");
        JButton button = new JButton("Draw");

        JLabel nsLabel = new JLabel("Number of Steps: ");
        JLabel apsLabel = new JLabel("Angle Per Step: ");
        JLabel lrLabel = new JLabel("Outer Radius: ");
        JLabel srLabel = new JLabel("Inner Radius: ");
        JLabel pdLabel = new JLabel("Pen Distance: ");


        SpirographController sc = new SpirographController(sv);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sc.draw(
                        Integer.parseInt(lrField.getText()),
                        Integer.parseInt(srField.getText()),
                        Integer.parseInt(pdField.getText()),
                        Integer.parseInt(nsField.getText()),
                        Double.parseDouble(apsField.getText())
                );
            }
        });

        GridBagConstraints constraints;

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(lrLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 0;
        add(lrField, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(srLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 1;
        add(srField, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 2;
        add(pdLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 2;
        add(pdField, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 3;
        add(nsLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 3;
        add(nsField, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 4;
        add(apsLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 4;
        add(apsField, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.anchor = GridBagConstraints.NORTH;
        add(button, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridheight = 7;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 1;
        add(sv, constraints);
    }

    public static void main(String[] args) {
        SpirographFrame frame = new SpirographFrame();
        frame.setVisible(true);
    }
}
