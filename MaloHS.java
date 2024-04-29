import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MaloHS extends JPanel implements ActionListener {
    private JLabel muybien_texto;
    private JLabel gracias_texto;
    private JLabel diagnostico_texto;
    private JLabel estado_texto;
    private JLabel reco_texto;
    private JLabel reco1_texto;
    private JLabel reco2_texto;
    private JLabel reco3_texto;
    private JLabel reco4_texto;
    private JLabel reco5_texto;
    private JButton inicio_boton;
    private JButton salir_boton;

    public MaloHS() {
        //construct components
        muybien_texto = new JLabel ("¡Muy bien!");
        gracias_texto = new JLabel ("Gracias por utilizar este servicio.");
        diagnostico_texto = new JLabel ("Segun los resultados de la encuesta se obtuvo el siguiente diagnostico.");
        estado_texto = new JLabel ("Tu estado actual es: Malo :(");
        estado_texto.setForeground(Color.red);
        reco_texto = new JLabel ("Algunas recomendaciones segun tu estado son:");
        reco1_texto = new JLabel (SmartTime.maloHS[0]);
        reco1_texto.setFont(new Font("Arial", Font.PLAIN, 12));
        reco2_texto = new JLabel (SmartTime.maloHS[1]);
        reco2_texto.setFont(new Font("Arial", Font.PLAIN, 12));
        reco3_texto = new JLabel (SmartTime.maloHS[2]);
        reco3_texto.setFont(new Font("Arial", Font.PLAIN, 12));
        reco4_texto = new JLabel (SmartTime.maloHS[3]);
        reco4_texto.setFont(new Font("Arial", Font.PLAIN, 12));
        reco5_texto = new JLabel (SmartTime.maloHS[4]);
        reco5_texto.setFont(new Font("Arial", Font.PLAIN, 12));
        inicio_boton = new JButton ("Inicio");
        salir_boton = new JButton ("Salir");

        //adjust size and set layout
        setPreferredSize (new Dimension (484, 591));
        setLayout (null);

        //add components
        add (muybien_texto);
        add (gracias_texto);
        add (diagnostico_texto);
        add (estado_texto);
        add (reco_texto);
        add (reco1_texto);
        add (reco2_texto);
        add (reco3_texto);
        add (reco4_texto);
        add (reco5_texto);
        add (inicio_boton);
        inicio_boton.addActionListener(this);
        add (salir_boton);
        salir_boton.addActionListener(this);

        //set component bounds (only needed by Absolute Positioning)
        muybien_texto.setBounds (210, 15, 65, 25);
        gracias_texto.setBounds (135, 40, 190, 20);
        diagnostico_texto.setBounds (35, 65, 410, 30);
        estado_texto.setBounds (155, 100, 155, 20);
        reco_texto.setBounds (100, 125, 280, 20);
        reco1_texto.setBounds (25, 155, 440, 55);
        reco2_texto.setBounds (25, 220, 440, 80);
        reco3_texto.setBounds (25, 310, 435, 65);
        reco4_texto.setBounds (25, 385, 440, 65);
        reco5_texto.setBounds (25, 455, 440, 75);
        inicio_boton.setBounds (130, 545, 100, 25);
        salir_boton.setBounds (245, 545, 100, 25);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == inicio_boton) {
            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            currentFrame.dispose();

            SmartTime.main(null);

        } else if (e.getSource() == salir_boton){
            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            currentFrame.dispose();
        }
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame ("SmartTime");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MaloHS());
        frame.pack();
        frame.setVisible (true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}