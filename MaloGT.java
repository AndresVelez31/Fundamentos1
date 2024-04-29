import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MaloGT extends JPanel implements ActionListener{
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

    public MaloGT() {
        //construct components
        muybien_texto = new JLabel ("¡Muy bien!");
        gracias_texto = new JLabel ("Gracias por utilizar este servicio.");
        diagnostico_texto = new JLabel ("Segun los resultados de la encuesta se obtuvo el siguiente diagnostico.");
        estado_texto = new JLabel ("Tu estado actual es: Malo :(");
        estado_texto.setForeground(Color.red);
        reco_texto = new JLabel ("Algunas recomendaciones segun tu estado son:");
        reco1_texto = new JLabel (SmartTime.maloGT[0]);
        reco1_texto.setFont(new Font("Arial", Font.PLAIN, 12));
        reco2_texto = new JLabel (SmartTime.maloGT[1]);
        reco2_texto.setFont(new Font("Arial", Font.PLAIN, 12));
        reco3_texto = new JLabel (SmartTime.maloGT[2]);
        reco3_texto.setFont(new Font("Arial", Font.PLAIN, 12));
        reco4_texto = new JLabel (SmartTime.maloGT[3]);
        reco4_texto.setFont(new Font("Arial", Font.PLAIN, 12));
        reco5_texto = new JLabel (SmartTime.maloGT[4]);
        reco5_texto.setFont(new Font("Arial", Font.PLAIN, 12));
        inicio_boton = new JButton ("Inicio");
        salir_boton = new JButton ("Salir");

        //adjust size and set layout
        setPreferredSize (new Dimension (471, 583));
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
        muybien_texto.setBounds (200, 15, 65, 25);
        gracias_texto.setBounds (140, 40, 330, 25);
        diagnostico_texto.setBounds (35, 65, 410, 30);
        estado_texto.setBounds (155, 100, 170, 20);
        reco_texto.setBounds (95, 130, 280, 20);
        reco1_texto.setBounds (25, 160, 410, 55);
        reco2_texto.setBounds (25, 230, 420, 50);
        reco3_texto.setBounds (25, 295, 425, 55);
        reco4_texto.setBounds (25, 365, 430, 60);
        reco5_texto.setBounds (25, 440, 415, 70);
        inicio_boton.setBounds (120, 535, 100, 25);
        salir_boton.setBounds (250, 535, 100, 25);
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
        frame.getContentPane().add (new MaloGT());
        frame.pack();
        frame.setVisible (true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}
