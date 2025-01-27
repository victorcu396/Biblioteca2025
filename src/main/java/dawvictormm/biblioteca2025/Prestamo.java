/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dawvictormm.biblioteca2025;

import java.time.LocalDate;
/**
 *
 * @author alu16d
 */
public class Prestamo {
    private Libro libroPrest;
    private Usuario usuarioPrest;
    private LocalDate fechaPrest;
    private LocalDate fechaDev;

    public Prestamo(Libro libroPrest, Usuario usuarioPrest, LocalDate fechaPrest, LocalDate fechaDev) {
        this.libroPrest = libroPrest;
        this.usuarioPrest = usuarioPrest;
        this.fechaPrest = fechaPrest;
        this.fechaDev = fechaDev;
    }
 /**   Lo que hace esta clase es clonar un prestamo ya existente
  * 
    public Prestamo(Prestamo otroPrestamo) {
    this.libroPrest = otroPrestamo.getLibroPrest();
    this.usuarioPrest = otroPrestamo.getUsuarioPrest();
    this.fechaPrest = otroPrestamo.getFechaPrest();
    this.fechaDev = otroPrestamo.getFechaDev();
}
*/ 
    public Libro getLibroPrest() {
        return libroPrest;
    }

    public Usuario getUsuarioPrest() {
        return usuarioPrest;
    }

    public LocalDate getFechaPrest() {
        return fechaPrest;
    }

    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setLibroPrest(Libro libroPrest) {
        this.libroPrest = libroPrest;
    }

    public void setUsuarioPrest(Usuario usuarioPrest) {
        this.usuarioPrest = usuarioPrest;
    }

    public void setFechaPrest(LocalDate fechaPrest) {
        this.fechaPrest = fechaPrest;
    }

    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }
    
    @Override
    public String toString() {
        return libroPrest + "-" + usuarioPrest + "-" + fechaPrest + "-" + fechaDev;
    }
}
/** Con esta clase puedes decir tu el número de días del prestamo
 * 
    public Prestamo(Libro libro, Usuario usuario, int diasPrestamo) {
       this.libroPrest = libro;
       this.usuarioPrest = usuario;
       this.fechaPrest = LocalDate.now();
       this.fechaDev = LocalDate.now().plusDays(diasPrestamo);
    }
 */

 /**   Lo que hace esta clase es añadir un parámetro nuevo a los prestamos que se llmaria estado
  * 
    public Prestamo(Libro libro, Usuario usuario, String estado) {
            this.libroPrest = libro;
            this.usuarioPrest = usuario;
            this.fechaPrest = LocalDate.now();
            this.fechaDev = LocalDate.now().plusDays(15);
            this.estado = estado;  // Nuevo atributo
        }
*/