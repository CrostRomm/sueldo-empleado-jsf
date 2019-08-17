package Controller;

import Model.Contable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 * @author Cristian Romero
 * @version 1.0
 */
@ManagedBean(name="formulario")
@RequestScoped
public class Formulario {
    /**
     * variable temporal para el nombre de empleado
     */
    String name;
    /**
     * variable temporal para el salario de empleado
     */
    int salary; 
    /**
     * variable temporal para los dias trabajados de empleado
     */
    int days; 
    /**
     * variable temporal para los idiomas que habla el empleado
     */
    List<String> language;
    /**
     * Constructor vacio
     */
    public Formulario() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public Contable getContable() {
        return contable;
    }

    public void setContable(Contable contable) {
        this.contable = contable;
    }
    
    /**
     * instancia del Modelo contable
     */
    Contable contable = new Contable();
    public String calcularSalario(){
        
        FacesContext context = FacesContext.getCurrentInstance();
        contable = context.getApplication().evaluateExpressionGet(context, "#{contable}", Contable.class);
        contable.setNombre(this.name);
        contable.setSalario(this.salary);
        contable.setDiasTrabajado(this.days);
        contable.setIdioma(this.language);
        return "Reporte";
    }
}
