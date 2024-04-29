import java.util.ArrayList;

public class SmartTime{
  
  static public ArrayList<Integer> respuestas = new ArrayList<>();
  static public ArrayList<String> preguntasGT = new ArrayList<>();
  static public ArrayList<String> preguntasHS = new ArrayList<>();
  static public ArrayList<String[]> recomendacionesGT = new ArrayList<>();
  static public String[] maloGT = {"<html><b>1. Prioriza tus tareas:</b> Identifica las tareas más importantes y urgentes, y concéntrate en completarlas primero. Utiliza técnicas como la matriz de Eisenhower para distinguir entre lo importante y lo urgente.", "<html><b>2. Establece metas claras:</b> Define metas realistas y específicas para cada día, semana o mes. Esto te ayudará a mantenerte enfocado y a dirigir tus esfuerzos hacia lo que realmente importa.", "<html><b>3. Utiliza herramientas de planificación:</b> Aprovecha herramientas como agendas, aplicaciones de gestión del tiempo o técnicas de organización para planificar y seguir tus actividades diarias.", "<html><b>4. Elimina las distracciones:</b> Identifica las distracciones comunes que te hacen perder el tiempo y trata de eliminarlas o minimizarlas. Esto puede incluir el uso excesivo de redes sociales, notificaciones de correo electrónico o interrupciones constantes.", "<html><b>5. Practica la disciplina personal:</b> Cultiva hábitos de disciplina personal, como la capacidad de decir no a tareas que no contribuyen a tus objetivos, el establecimiento de límites de tiempo para cada tarea y la capacidad de mantenerte enfocado en una tarea a la vez." };
  static public String[] regularGT = {"<html><b>1. Refina tus técnicas de planificación: </b>Evalúa tus métodos actuales de planificación y busca formas de mejorarlos. Puede ser utilizando técnicas más avanzadas de organización o ajustando tu proceso de planificación para que sea más eficiente.", "<html><b>2. Optimiza tu agenda:</b>Revisa tu agenda regularmente para asegurarte de que estás asignando tiempo suficiente para cada tarea y actividad. Ajusta tu agenda según sea necesario para garantizar un equilibrio adecuado entre trabajo, descanso y recreación.","<html><b>3. Mejora tu habilidad para delegar:</b> Siempre que sea posible, delega tareas que no requieran tu atención personal. Esto te permitirá concentrarte en las actividades que realmente requieren tu experiencia y habilidades únicas.","<html><b>4. Implementa técnicas de gestión del tiempo avanzadas: </b> Explora técnicas más avanzadas de gestión del tiempo, como la técnica Pomodoro, la planificación inversa o el batching de tareas similares, para aumentar tu productividad y eficiencia.","<html><b>5. Mantén el equilibrio:</b>Asegúrate de mantener un equilibrio saludable entre el trabajo, la familia, el ocio y el autocuidado. No sacrifiques tu bienestar personal por el trabajo, y encuentra formas de integrar actividades que te traigan alegría y satisfacción en tu rutina diaria."};
  static public String[] buenoGT = {"<html><b>1.Busca la optimización continua: </b>Aunque ya seas excelente en la gestión del tiempo, siempre hay margen para mejorar. Continúa buscando formas de optimizar tu proceso de planificación y ejecución para aumentar tu eficiencia y productividad aún más.","<html><b>2. Fomenta la creatividad y la innovación: </b>Dedica tiempo a actividades que fomenten la creatividad y la innovación en tu trabajo. Esto puede incluir la exploración de nuevas ideas, la experimentación con diferentes enfoques o la colaboración con otros profesionales.","<html><b>3. Desarrolla habilidades de liderazgo:</b> Si aún no lo has hecho, considera desarrollar tus habilidades de liderazgo para poder influir y motivar a otros en la gestión del tiempo y la productividad. Esto puede incluir habilidades de comunicación, delegación y resolución de problemas.", "<html><b>4. Mantén un enfoque en el crecimiento personal: </b>Continúa invirtiendo en tu crecimiento personal y educativo mediante la adquisición de nuevas habilidades, la participación en programas de desarrollo profesional o la búsqueda de oportunidades de aprendizaje continuo.","<html><b>5. Comparte tu conocimiento: </b>Considera compartir tus conocimientos y experiencia en gestión del tiempo con otros a través de la mentoría, la escritura de blogs, la impartición de talleres o la participación en comunidades académicas. Ayudar a otros a mejorar su gestión del tiempo puede ser gratificante y significativo."};
  static public ArrayList<String[]> recomendacionesHS = new ArrayList<>();
  static public String[] maloHS = {"<html><b>1. Establece una rutina de sueño: </b>Intenta acostarte y levantarte a la misma hora todos los días, incluso los fines de semana. Esto ayuda a regular tu reloj interno y a mejorar la calidad del sueño. ", "<html><b>2. Reduce la exposición a pantallas antes de dormir: </b>Si estás usando dispositivos tecnológicos antes de acostarte, intenta reducir esta práctica al menos una hora antes de dormir. La luz azul emitida por las pantallas puede interferir con la producción de melatonina, la hormona responsable de regular el sueño.", "<html><b> 3. Practica la relajación antes de dormir: </b> Dedica tiempo a actividades relajantes antes de acostarte, como leer un libro, tomar un baño caliente o practicar técnicas de respiración profunda. Esto puede ayudar a preparar tu mente y cuerpo para dormir.", "<html><b> 4. Cuida tu ambiente de sueño: </b>Asegúrate de que tu habitación sea un entorno propicio para dormir. Mantén la habitación oscura, fresca y tranquila. Considera el uso de tapones para los oídos o una máscara para dormir si el ruido o la luz te molestan.", "<html><b> 5. Limita el consumo de cafeína y alcohol: </b> Evita consumir cafeína y alcohol varias horas antes de acostarte, ya que pueden interferir con la calidad del sueño. Opta por bebidas relajantes como la leche tibia o la infusión de manzanilla antes de dormir." };
  static public String[] regularHS = {"<html><b>1. Optimiza tu rutina de sueño: </b> Aunque ya mantengas un horario regular de sueño, asegúrate de que estés durmiendo la cantidad adecuada de horas para tus necesidades individuales. Si sientes que todavía estás fatigado durante el día, considera ajustar tu horario de sueño para asegurarte de obtener suficiente descanso. ", "<html><b> 2. Mejora la calidad de tu sueño: </b>Además de dormir la cantidad adecuada de horas, también es importante garantizar la calidad del sueño. Trata de crear un ambiente de dormitorio que sea lo más cómodo y relajante posible, y considera invertir en un colchón de calidad si es necesario. ", "<html><b>3. Evita el estrés antes de dormir: </b>Si bien puedes ser un poco cuidadoso en tu horario de sueño, el estrés y la ansiedad pueden interferir con tu capacidad para conciliar el sueño. Dedica tiempo antes de acostarte a actividades relajantes como la meditación, el yoga o la lectura para ayudar a calmar tu mente y prepararte para dormir.","<html><b> 4. Mantén un estilo de vida saludable: </b>El ejercicio regular y una dieta equilibrada también pueden contribuir a mejorar la calidad del sueño. Intenta hacer ejercicio regularmente durante el día, pero evita hacerlo demasiado cerca de la hora de acostarte, ya que puede tener un efecto estimulante en tu cuerpo.","<html><b> 5. Limita el consumo de estimulantes: </b> Aunque puedas ser medianamente bueno en tus hábitos de sueño, el consumo excesivo de cafeína, alcohol y nicotina puede afectar la calidad de tu sueño. Intenta limitar estos estimulantes, especialmente por la tarde y la noche, para garantizar un sueño reparador."};
  static public String[] buenoHS = {"<html><b>1.Mantén la consistencia: </b>Sigue manteniendo un horario regular de sueño, acostándote y levantándote a la misma hora todos los días, incluso los fines de semana. La consistencia ayuda a regular tu reloj interno y a optimizar la calidad del sueño.","<html><b> 2.Perfecciona tu entorno de sueño: </b>Asegúrate de que tu dormitorio sea un santuario para el sueño, libre de distracciones y diseñado para la máxima comodidad. Controla la temperatura, la luz y el ruido para crear un ambiente óptimo para dormir.", "<html><b> 3.Practica técnicas de relajación avanzadas: </b>Explora técnicas avanzadas de relajación, como la meditación profunda, la visualización guiada o la atención plena, para calmar aún más tu mente y prepararte para un sueño reparador.","<html><b> 4.Optimiza tu estilo de vida: </b>Continúa manteniendo un estilo de vida saludable, incluyendo ejercicio regular, una dieta equilibrada y la gestión efectiva del estrés. Estos hábitos promueven la salud general y contribuyen a un sueño de calidad.", "<html><b> 5. Prioriza el autocuidado: </b>Reconoce la importancia del autocuidado en tu rutina diaria y reserva tiempo para actividades que fomenten el bienestar físico, mental y emocional. Esto puede incluir masajes, baños relajantes, hobbies gratificantes o simplemente tomarse un tiempo para disfrutar de la tranquilidad"};
 
  public static void main (String[] args){

    recomendacionesGT.add(maloGT);
    recomendacionesGT.add(regularGT);
    recomendacionesGT.add(buenoGT);
    recomendacionesHS.add(maloHS);
    recomendacionesHS.add(regularHS);
    recomendacionesHS.add(buenoHS);
    recomendacionesGT.add(maloGT);
    recomendacionesGT.add(regularGT);
    recomendacionesGT.add(buenoGT);
    recomendacionesHS.add(maloHS);
    recomendacionesHS.add(regularHS);
    recomendacionesHS.add(buenoHS);
    
    EleccionRol.main(args);
        
  }

  

  public static void crearUsuarioAdministrador(String correoInst){
    Administrador A1 = new Administrador();
    A1.setCorreoInst(correoInst);
  }
}