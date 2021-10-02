package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.IdentityHashMap;
import java.util.Objects;

@Entity
public class Autor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    private String nombre;
    private Integer anionacimiento;

    public Autor(){
        super();
    }

    public Autor(String nombre, Integer anionacimiento) {
        this.nombre = nombre;
        this.anionacimiento = anionacimiento;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnionacimiento() {
        return anionacimiento;
    }

    public void setAnionacimiento(Integer anionacimiento) {
        this.anionacimiento = anionacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(codigo, autor.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
