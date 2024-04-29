import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DatosPersonales extends JPanel implements ActionListener {
    private JLabel bienvenido_texto;
    private JLabel Datospersonales_texto;
    private JTextArea edad_casilla;
    private JLabel nombre_texto;
    private JLabel edad_texto;
    private JTextArea nombre_casilla;
    private JButton continuar_boton;

    public DatosPersonales() {
        //construct components
        bienvenido_texto = new JLabel("BIENVENIDO A SMARTIME");
        Datospersonales_texto = new JLabel("Ingresa tus datos personales");
        edad_casilla = new JTextArea(5, 5);
        nombre_texto = new JLabel("Nombre Completo");
        edad_texto = new JLabel("Edad");
        nombre_casilla = new JTextArea(5, 5);
        continuar_boton = new JButton("Continuar");

        //adjust size and set layout
        setPreferredSize(new Dimension(396, 343));
        setLayout(null);

        //add components
        add(bienvenido_texto);
        add(Datospersonales_texto);
        add(edad_casilla);
        add(nombre_texto);
        add(edad_texto);
        add(nombre_casilla);
        add(continuar_boton);
        continuar_boton.addActionListener(this);


        //set component bounds (only needed by Absolute Positioning)
        bienvenido_texto.setBounds(135, 30, 155, 20);
        Datospersonales_texto.setBounds(125, 55, 170, 25);
        edad_casilla.setBounds(90, 205, 225, 30);
        nombre_texto.setBounds(95, 100, 115, 25);
        edad_texto.setBounds(95, 175, 100, 25);
        nombre_casilla.setBounds(90, 130, 225, 30);
        continuar_boton.setBounds(140, 260, 130, 35);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == continuar_boton) {
            String name = nombre_casilla.getText();
            String age_str = edad_casilla.getText();
            int age_int = Integer.parseInt(age_str);

            Estudiante E1 = new Estudiante();
            E1.setNombre(name);
            E1.setEdad(age_int);

            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            currentFrame.dispose();

            JFrame frame = new JFrame("SmartTime");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new Secciones(E1));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setResizable(false);
        }   
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DatosPersonales");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new DatosPersonales());
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}

