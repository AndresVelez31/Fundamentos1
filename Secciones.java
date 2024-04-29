import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Secciones extends JPanel implements ActionListener {
    private JLabel hola_text;
    private JLabel pregunta_text;
    private JComboBox<String> opciones_box;
    private JButton continuar_boton;
    private Estudiante E1;

    public Secciones(Estudiante E) {
        this.E1 = E; 

        //construct preComponents
        String[] opciones_boxItems = {"Gestion del Tiempo", "Horario de Sueño"};

        //construct components
        hola_text = new JLabel ( "<html><center>¡Hola " + E1.getNombre() + "!"); // 
        pregunta_text = new JLabel ("¿Que te gustaria mejorar?");
        opciones_box = new JComboBox<String> (opciones_boxItems);
        continuar_boton = new JButton ("Continuar");

        //adjust size and set layout
        setPreferredSize (new Dimension (334, 213));
        setLayout (null);

        //add components
        add (hola_text);
        add (pregunta_text);
        add (opciones_box);
        add (continuar_boton);
        continuar_boton.addActionListener(this);

        //set component bounds (only needed by Absolute Positioning)
        hola_text.setBounds (95, 35, 300, 20);
        pregunta_text.setBounds (95, 70, 155, 20);
        opciones_box.setBounds (100, 105, 145, 20);
        continuar_boton.setBounds (120, 140, 100, 25);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == continuar_boton) {
            if (opciones_box.getSelectedItem() == "Gestion del Tiempo") {
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                currentFrame.dispose();

                JFrame frame = new JFrame("SmartTime");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new GestionDelTiempo());
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
            }

            if (opciones_box.getSelectedItem() == "Horario de Sueño") {
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                currentFrame.dispose();

                JFrame frame = new JFrame("SmartTime");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new HorarioDeSueño());
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
            }
        }
    }

    public static void main (String[] args, Estudiante E) {
        JFrame frame = new JFrame ("Secciones");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Secciones(E));
        frame.pack();
        frame.setVisible (true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}
