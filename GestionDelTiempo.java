import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GestionDelTiempo extends JPanel implements ActionListener {
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


    public GestionDelTiempo() {
        
        String p1, p2, p3, p4, p5, p6;
        p1 = "\n1. ¿Cómo planificas tu día a día?";
        SmartTime.preguntasGT.add(p1);
        p2 = "\n2. ¿Qué tan organizado te consideras en tu estudio o actividades diarias?";
        SmartTime.preguntasGT.add(p2);
        p3 = "\n3. ¿Cuánto tiempo dedicas a planificar tus actividades diarias?";
        SmartTime.preguntasGT.add(p3);
        p4 = "\n4. ¿Qué haces cuando te das cuenta de que estás perdiendo el tiempo?";
        SmartTime.preguntasGT.add(p4);
        p5 = "\n5. ¿Cuál es tu enfoque principal al manejar tu tiempo?";
        SmartTime.preguntasGT.add(p5);
        p6 = "\n6. ¿Cómo manejas las interrupciones mientras trabajas o realizas actividades importantes?";
        SmartTime.preguntasGT.add(p6);

        //construct preComponents
        String[] r1_cajaItems = {"1. Que sea lo que dios quiera.", "2. Solo planifico cosas muy puntuales.", "3. Tengo una idea general de lo que debo hacer, pero no soy tan estricto.", "4. Hago una lista detallada de tareas y horarios."};
        String[] r2_cajaItems = {"1. ¿Organizado? ¿Eso con que se come?", "2. No le doy tanta importancia a eso.", "3. Organizado, tengo un horario, pero puedo modificarlo de acuerdo con las conveniencias del momento.", "4. Muy organizado, planifico con anticipación y sigo un calendario estricto."};
        String[] r3_cajaItems = {"1. ¿Eso para qué?", "2. 15 minutos aproximadamente.", "3. Alrededor de media hora al día.", "4. Una hora o más al día."};
        String[] r4_cajaItems = {"1. Nada, seguir perdiéndolo me parece una mejor idea.", "2. Me llego a preocupar, pero no le doy importancia.", "3. Me preocupo, pero no actúo en el instante.", "4. Inmediatamente me pongo a hacer cosas de mayor nivel de importancia."};
        String[] r5_cajaItems = {"1. Antepongo lo que me divierte.", "2. Dejo que todo siga su curso y no manejo mi tiempo como tal.", "3. Equilibrio entre tareas importantes y cosas personales.", "4. Priorizar las tareas más importantes y urgentes."};
        String[] r6_cajaItems = {"1. Me distraigo fácilmente y cambio de tarea sin completar en la que ya estaba.", "2. Me distraigo un tiempo largo, y difícilmente vuelvo a lo que estaba haciendo. ", "3. Las atiendo inmediatamente si son urgentes, pero vuelvo a mi tarea principal después de solucionarlo.", "4. No les doy importancia y me concentro en terminar lo que estaba haciendo"};

        //construct components
        bienvenido_texto = new JLabel ("¡Bienvenido a Gestion del Tiempo!");
        preguntas_texto = new JLabel ("<html><center>A continuacion te realizaremos algunas preguntas para realizar un diagnostico sobre tu estado actual, y asi poder darte algunas recomendaciones.");
        p1_texto = new JLabel (SmartTime.preguntasGT.get(0));
        r1_caja = new JComboBox<String> (r1_cajaItems);
        p2_texto = new JLabel (SmartTime.preguntasGT.get(1));
        r2_caja = new JComboBox<String> (r2_cajaItems);
        p3_texto = new JLabel (SmartTime.preguntasGT.get(2));
        r3_caja = new JComboBox<String> (r3_cajaItems);
        p4_texto = new JLabel (SmartTime.preguntasGT.get(3));
        r4_caja = new JComboBox<String> (r4_cajaItems);
        p5_texto = new JLabel (SmartTime.preguntasGT.get(4));
        r5_caja = new JComboBox<String> (r5_cajaItems);
        p6_texto = new JLabel (SmartTime.preguntasGT.get(5));
        r6_caja = new JComboBox<String> (r6_cajaItems);
        enviarr_boton = new JButton ("Enviar Respuestas");

        //adjust size and set layout
        setPreferredSize (new Dimension (673, 641));
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
        bienvenido_texto.setBounds (235, 25, 195, 20);
        preguntas_texto.setBounds (60, 60, 575, 45);
        p1_texto.setBounds (20, 125, 195, 20);
        r1_caja.setBounds (35, 150, 450, 30);
        p2_texto.setBounds (20, 195, 435, 25);
        r2_caja.setBounds (35, 225, 620, 25);
        p3_texto.setBounds (20, 265, 360, 25);
        r3_caja.setBounds (35, 300, 225, 25);
        p4_texto.setBounds (20, 340, 420, 25);
        r4_caja.setBounds (35, 375, 460, 25);
        p5_texto.setBounds (20, 420, 315, 25);
        r5_caja.setBounds (35, 455, 390, 25);
        p6_texto.setBounds (20, 500, 530, 25);
        r6_caja.setBounds (30, 535, 625, 25);
        enviarr_boton.setBounds (265, 585, 140, 30);
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
    
            float promedio = calcularEstado();

            if (promedio >= 1 && promedio < 1.33f){
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                currentFrame.dispose();

                JFrame frame = new JFrame("SmartTime");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new MaloGT());
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
                frame.getContentPane().add(new RegularGT());
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
                frame.getContentPane().add(new BuenoGT());
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
            }

            
        }
    }

    public void main (String[] args, Estudiante E) {

        JFrame frame = new JFrame ("SmartTime");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new GestionDelTiempo());
        frame.pack();
        frame.setVisible (true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}