import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CorreoInstitucional extends JPanel implements ActionListener {
    private JLabel label1_administrador;
    private JTextField CorreoInst;
    private JButton Boton_Ingresar;
    private String c1 = "smazog@eafit.edu.co";
    private String c2 = "afveleza@eafit.edu.co";
    private String c3 = "jpduqueo@eafit.edu.co";
    private String c4 = "mrestrepa1@eafit.edu.co";

    public CorreoInstitucional() {
        //construct components
        label1_administrador = new JLabel (" Ingresa tu correo institucional para ingresar");
        CorreoInst = new JTextField (5);
        Boton_Ingresar = new JButton ("Ingresar");
        Boton_Ingresar.addActionListener (this);

        //set components properties
        CorreoInst.setToolTipText ("ejemplo@eafit.edu.co");

        //adjust size and set layout
        setPreferredSize (new Dimension (378, 221));
        setLayout (null);

        //add components
        add (label1_administrador);
        add (CorreoInst);
        add (Boton_Ingresar);

        //set component bounds (only needed by Absolute Positioning)
        label1_administrador.setBounds (80, 20, 285, 45);
        CorreoInst.setBounds (140, 75, 140, 25);
        Boton_Ingresar.setBounds (160, 125, 100, 25);
    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource()==Boton_Ingresar){

            String Correo = CorreoInst.getText();

            if (Correo.equals(c1) || Correo.equals(c2) || Correo.equals(c3) || Correo.equals(c4)){
                SmartTime.crearUsuarioAdministrador(Correo);
                System.out.println ("bienvienido admin");

            }

        }
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("SmartTime");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new CorreoInstitucional());
        frame.pack();
        frame.setVisible (true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}