package Model;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 * @author Cristian Romero
 * @version 1.0
 */
@ManagedBean(name="contable")
@RequestScoped
public class Contable {
    /**
     * Variable que se usa para guardar el nombre del empleado
     */
    private String nombre;
    private int salario;
    private int diasTrabajado;
    private List<String> idioma;
    /**
     * Constructor vacio
     */
    public Contable() {
    }
    /**
     * Constructor
     * @param nombre Nombre del empleado
     * @param salario Salario del empleado
     * @param diasTrabajado días trabajados por el empleado
     * @param idioma idiomas que habla el empleado
     */
    public Contable(String nombre, int salario, int diasTrabajado, List<String> idioma) {
        this.nombre = nombre;
        this.salario = salario;
        this.diasTrabajado = diasTrabajado;
        this.idioma = idioma;
    }
    /**
     * Get de nombre de empleado
     * @return String
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Set de nombre de empleado
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Get del salario de empleado
     * @return int
     */
    public int getSalario() {
        return salario;
    }
    /**
     * Set del salario de empleado
     * @param salario 
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }
    /**
     * Get de los días trabados del empleado
     * @return int
     */
    public int getDiasTrabajado() {
        return diasTrabajado;
    }
    /**
     * Set de los días trabajados del empleado
     * @param diasTrabajado 
     */
    public void setDiasTrabajado(int diasTrabajado) {
        this.diasTrabajado = diasTrabajado;
    }
    /**
     * Get de los idomas que el empleado habla
     * @return Lista de string
     */
    public List<String> getIdioma() {
        return idioma;
    }
    /**
     * Set de los idiomas que el empleado habla
     * @param idioma 
     */
    public void setIdioma(List<String> idioma) {
        this.idioma = idioma;
    }
    
}
