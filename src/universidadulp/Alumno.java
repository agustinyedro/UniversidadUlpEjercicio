
package universidadulp;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class Alumno {
    
    private int idAlumno;
    private int dni;
    private String apellido, nombre;
    private LocalDate fechaNacimiento;
    private boolean estado;

    public Alumno(int dni, String apellido, String nombre, LocalDate fechaNacimiento, boolean estado) {
        
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", estado=" + estado + '}';
    }
    
    
    public void agregarAlumno(Alumno alumno ){
        Conexion conexion = new Conexion("Universidadulp");
        String sql= "INSERT INTO alumno VALUES(NULL,'"+alumno.getDni()+"','"+alumno.getNombre()+"','"+alumno.getApellido()+"','"+alumno.getFechaNacimiento()+"',"+alumno.isEstado()+")";
       
        try {
            PreparedStatement ps=conexion.conectar().prepareStatement(sql);            
            ps.executeUpdate();
         
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error en la consulta");
        }
    }
    
}
