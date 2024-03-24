import java.util.Scanner;

public class Funcionalidades {

  public static void Usuario_encuesta(String a, String b) {
    System.out.println("Bienvenido a SmartTime "+a+" "+b+" ¿Qué encuesta te gustaría realizar?");
    //coming soon...
  }

  public static String Admin_ingreso(String a) {
  
    String c1,c2,c3,c4;
     c1 = "smazog@eafit.edu.co";
     c2 = "afveleza@eafit.edu.co";
     c3 = "jpduqueo@eafit.edu.co";
     c4 = "mrestrepa1@eafit.edu.co";
    
    if (a.equals(c1) || a.equals(c2) || a.equals(c3) || a.equals(c4)){
      System.out.println("bienvenido admin");
    } else {
        System.out.println ("El correo no coincide");
      }
    return a;
  }
  
  public static void Funcional(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String usuario;
    String rol;
   
    System.out.println ("Ingrese su rol (estudiante o administrador)");
    rol= sc.next();
    
    if (rol.equalsIgnoreCase("administrador")){
      
      System.out.println("Ingrese su correo institucional");
        usuario = sc.next();
       Admin_ingreso(usuario);
      
    } else {
      
      if (rol.equalsIgnoreCase("estudiante")){
        
        String nombre;
        String apellido;
        System.out.println ("Ingrese su nombre");
        nombre = sc.next();
        System.out.println ("Ingrese su apellido");
        apellido = sc.next();
        Usuario_encuesta(nombre, apellido);
        
      } else {
          System.out.println("Ingrese un rol valido");
        }
    sc.close();
  }
 }
}
