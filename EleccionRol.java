import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EleccionRol extends JPanel implements ActionListener {
    private JComboBox<String> jcomp1;
    private JComboBox<String> combo_box1_rol;
    private JLabel label1_bienvenida;
    private JLabel label2_rol;
    private JButton button1_continuar;

    public EleccionRol() {
        // construct preComponents
        String[] jcomp1Items = {"Item 1", "Item 2", "Item 3"};
        String[] combo_box1_rolItems = {"Estudiante", "Administrador"};

        // construct components
        jcomp1 = new JComboBox<String>(jcomp1Items);
        combo_box1_rol = new JComboBox<String>(combo_box1_rolItems);
        label1_bienvenida = new JLabel("BIENVENIDO A SMARTTIME");
        label2_rol = new JLabel(" Para ingresar seleccione su tipo de rol");
        button1_continuar = new JButton("Continuar");

        // set components properties
        combo_box1_rol.setToolTipText("Seleccione rol");
        button1_continuar.setToolTipText("Continuar");

        // adjust size and set layout
        setPreferredSize(new Dimension(391, 206));
        setLayout(null);

        // add components
        add(jcomp1);
        add(combo_box1_rol);
        add(label1_bienvenida);
        add(label2_rol);
        add(button1_continuar);
        button1_continuar.addActionListener(this);

        // set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds(-270, 185, 100, 25);
        combo_box1_rol.setBounds(140, 85, 120, 25);
        label1_bienvenida.setBounds(125, 15, 195, 20);
        label2_rol.setBounds(90, 40, 230, 30);
        button1_continuar.setBounds(150, 145, 100, 25);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1_continuar) {
            if (combo_box1_rol.getSelectedItem() == "Estudiante") {
                
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                currentFrame.dispose();

                JFrame frame = new JFrame("SmartTime");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new DatosPersonales());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setResizable(false);

            } else {
                
                if (combo_box1_rol.getSelectedItem()== "Administrador"){

                    JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                   currentFrame.dispose();

                   JFrame frame = new JFrame("SmartTime");
                   frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
                   frame.getContentPane().add (new CorreoInstitucional());
                   frame.pack();
                   frame.setVisible (true);
                   frame.setLocationRelativeTo(null);
                   frame.setResizable(false);

                }
            }
        }
    }

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("SmartTime");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new EleccionRol());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

    }
}
