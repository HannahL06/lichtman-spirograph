import javax.swing.*;
import java.awt.*;

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
        JLabel nsLabel = new JLabel("8000");
        JLabel apsLabel = new JLabel("0.007");

        JLabel lrLabel = new JLabel("Outer Radius: ");
        JLabel srLabel = new JLabel("Inner Radius: ");
        JLabel pdLabel = new JLabel("Pen Distance: ");

        SpirographController sc = new SpirographController(
                lrField, srField, pdField, nsLabel, apsLabel
        );

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
        constraints.gridx = 0;
        constraints.gridy = 4;
        add(apsLabel, constraints);

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
