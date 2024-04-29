import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HorarioDeSueño extends JPanel implements ActionListener {
    private JLabel bienvenido_texto;
    private JLabel preguntas_texto;
    private JLabel p1_texto;
    private JComboBox<String> r1_caja;
    private JLabel p2_texto;
    private JComboBox<String> r2_caja;
    private JLabel p3_texto;
    private JComboBox<String> r3_caja;
    private JLabel p4_texto;
    private JComboBox<String> r4_caja;
    private JLabel p5_texto;
    private JComboBox<String> r5_caja;
    private JLabel p6_texto;
    private JComboBox<String> r6_caja;
    private JButton enviarr_boton;
    

    public HorarioDeSueño() {

        String p1, p2, p3, p4, p5, p6;
        p1 = "\n1. ¿Cuántas horas duermes con normalidad cada noche?";
        SmartTime.preguntasHS.add(p1);
        p2 = "\n2. Según los últimos 3 meses, ¿A qué horas te has acostado normalmente?";
        SmartTime.preguntasHS.add(p2);
        p3 = "\n3. ¿Usas dispositivos tecnológicos 30m-1h antes de dormir?";
        SmartTime.preguntasHS.add(p3);
        p4 = "\n4. ¿Cuánto tiempo sueles tardar en conciliar el sueño?";
        SmartTime.preguntasHS.add(p4);
        p5 = "\n5. ¿Despiertas durante la noche con frecuencia?";
        SmartTime.preguntasHS.add(p5);
        p6 = "<html>6. ¿Has notado cambios en tu energía o estado de ánimo cuando duermes más o menos de lo habitual?";
        SmartTime.preguntasHS.add(p6);

        //construct preComponents
        String[] r1_cajaItems = {"1. Menos de 6 horas.", "2. 6-7 horas.", "3. 7-8 horas.", "4. Más de 8 horas"};
        String[] r2_cajaItems = {"1. Luego de la 1 a.m.  ", "2. Entre las 11 p.m. y 12 a.m. ", "3. Entre las 10 p.m. y las 11 p.m.", "4. Antes de las 7-9 p.m."};
        String[] r3_cajaItems = {"1. Siempre lo hago.", "2. Algunas veces sí, otras no.", "3. Casi nunca.", "4.Nunca lo hago, solo me centro en descansar."};
        String[] r4_cajaItems = {"1. Duración irregular cada día. ", "2. Más de 30 minutos.", "3. Entre 15 y 30 minutos.", "4. Menos de 15 minutos."};
        String[] r5_cajaItems = {"1. Si, siempre me sucede", "2. Sí, no siempre, pero con mucha frecuencia.", "3. A veces, una o dos ocasiones.", "4. No, nunca me pasa"};
        String[] r6_cajaItems = {"1. Si he notado cambios, pero siendo demasiado negativos.", "2. No he notado nada, solo me siento un poco más desanimado/a.", "3. No he notado ningún tipo de cambio.", "4. Claro, me siento mucho mejor y más activo."};

        //construct components
        bienvenido_texto = new JLabel ("¡Bienvenido a Horario de Sueño!");
        preguntas_texto = new JLabel ("<html><center>A continuacion te realizaremos algunas preguntas para realizar un diagnostico sobre tu estado actual, y asi poder darte algunas recomendaciones.");
        p1_texto = new JLabel (SmartTime.preguntasHS.get(0));
        r1_caja = new JComboBox<String> (r1_cajaItems);
        p2_texto = new JLabel (SmartTime.preguntasHS.get(1));
        r2_caja = new JComboBox<String> (r2_cajaItems);
        p3_texto = new JLabel (SmartTime.preguntasHS.get(2));
        r3_caja = new JComboBox<String> (r3_cajaItems);
        p4_texto = new JLabel (SmartTime.preguntasHS.get(3));
        r4_caja = new JComboBox<String> (r4_cajaItems);
        p5_texto = new JLabel (SmartTime.preguntasHS.get(4));
        r5_caja = new JComboBox<String> (r5_cajaItems);
        p6_texto = new JLabel (SmartTime.preguntasHS.get(5));
        r6_caja = new JComboBox<String> (r6_cajaItems);
        enviarr_boton = new JButton ("Enviar Respuestas");

        //adjust size and set layout
        setPreferredSize (new Dimension (485, 669));
        setLayout (null);

        //add components
        add (bienvenido_texto);
        add (preguntas_texto);
        add (p1_texto);
        add (r1_caja);
        add (p2_texto);
        add (r2_caja);
        add (p3_texto);
        add (r3_caja);
        add (p4_texto);
        add (r4_caja);
        add (p5_texto);
        add (r5_caja);
        add (p6_texto);
        add (r6_caja);
        add (enviarr_boton);
        enviarr_boton.addActionListener(this);

        //set component bounds (only needed by Absolute Positioning)
        bienvenido_texto.setBounds (150, 25, 195, 20);
        preguntas_texto.setBounds (75, 60, 335, 50);
        p1_texto.setBounds (20, 125, 330, 20);
        r1_caja.setBounds (35, 150, 155, 25);
        p2_texto.setBounds (20, 195, 435, 25);
        r2_caja.setBounds (35, 225, 210, 25);
        p3_texto.setBounds (20, 265, 360, 25);
        r3_caja.setBounds (35, 300, 300, 25);
        p4_texto.setBounds (20, 340, 320, 25);
        r4_caja.setBounds (35, 375, 200, 25);
        p5_texto.setBounds (20, 420, 315, 25);
        r5_caja.setBounds (35, 455, 285, 25);
        p6_texto.setBounds (20, 500, 430, 35);
        r6_caja.setBounds (35, 550, 400, 25);
        enviarr_boton.setBounds (170, 605, 140, 30);
    }

    public float calcularEstado(){
        SmartTime.respuestas.clear();
        String r1caja = (String) r1_caja.getSelectedItem();
        String r2caja = (String) r2_caja.getSelectedItem();
        String r3caja = (String) r3_caja.getSelectedItem();
        String r4caja = (String) r4_caja.getSelectedItem();
        String r5caja = (String) r5_caja.getSelectedItem();
        String r6caja = (String) r6_caja.getSelectedItem();

        int r1 = Integer.parseInt(r1caja.substring(0, 1)); 
        int r2 = Integer.parseInt(r2caja.substring(0, 1));
        int r3 = Integer.parseInt(r3caja.substring(0, 1));
        int r4 = Integer.parseInt(r4caja.substring(0, 1));
        int r5 = Integer.parseInt(r5caja.substring(0, 1));
        int r6 = Integer.parseInt(r6caja.substring(0, 1));

        SmartTime.respuestas.add(r1);
        SmartTime.respuestas.add(r2);
        SmartTime.respuestas.add(r3);
        SmartTime.respuestas.add(r4);
        SmartTime.respuestas.add(r5);
        SmartTime.respuestas.add(r6);

        int acum = 0;
        for (Integer r : SmartTime.respuestas) {
            acum = acum + r;
        }

        float promedio = 0;
        promedio = acum/6;

        return promedio;
    }

    public void actionPerformed(ActionEvent e) {
    
        if (e.getSource() == enviarr_boton) {
            
            calcularEstado();

            float promedio = 0;
            promedio = calcularEstado();

            if (promedio >= 1 && promedio < 1.33f){
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                currentFrame.dispose();

                JFrame frame = new JFrame("SmartTime");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new MaloHS());
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
            }

            if (promedio >= 1.33f && promedio < 2.66f){
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                currentFrame.dispose();

                JFrame frame = new JFrame("SmartTime");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new RegularHS());
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
            }

            if (promedio >= 2.66f && promedio <= 4){
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                currentFrame.dispose();

                JFrame frame = new JFrame("SmartTime");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new BuenoHS());
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
            }
        }
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame ("SmartTime");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new HorarioDeSueño());
        frame.pack();
        frame.setVisible (true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}
