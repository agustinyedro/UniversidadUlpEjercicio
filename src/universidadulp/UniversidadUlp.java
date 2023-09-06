
package universidadulp;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class UniversidadUlp {

   
    public static void main(String[] args) {
        //con nombre de la base de datos
        Conexion conexion = new Conexion("Universidadulp"); 
        conexion.conectar();
        
        Alumno alumno1= new Alumno(36314380, "Redondo", "Paula", LocalDate.of(1992, 10, 7), true);
        System.out.println(alumno1.toString());
        alumno1.agregarAlumno(alumno1);
        
//        String sql= "INSERT INTO alumno VALUES (null, 36314380, 'Redondo', 'Paula', '1992-10-07',true)";
//        
//        PreparedStatement ps;
//        try {
//            ps = conexion.conectar().prepareStatement(sql);
//            ps.executeQuery();
//        } catch (SQLException ex) {
//           JOptionPane.showMessageDialog(null,"Error en la consulta");
//        }
//        
    
   }
      
        
        
    }
    

