package Controller;

import Model.Contable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 * @author Cristian Romero
 * @author 1.0
 */
@ManagedBean(name="desprendible")
@RequestScoped
public class Desprendible {
    /**
     * Declaración del modelo Contable para poder acceder a su información
     */
    @ManagedProperty("#{contable}")
    private Contable contable;
    /**
     * Constructor vacio de Desprendible
     */
    public Desprendible() {
    }
    /**
     * get del modelo contable
     * @return Clase Contable
     */
    public Contable getContable() {
        return contable;
    }
    /**
     * Set del modelo contable
     * @param contable 
     */
    public void setContable(Contable contable) {
        this.contable = contable;
    }
    public String enviaNombre(){
        return contable.getNombre();
    }
    public int enviaSalario(){
        return contable.getSalario();
    }
    public int enviaDiasTrabajados(){
        return contable.getDiasTrabajado();
    }
    public String enviaIdiomas(){
        if(contable.getIdioma().size() == 0){
            return "no habla ningun idioma";
        }
        if(contable.getIdioma().size() == 1){
            return "habla un idioma";
        }
        if(contable.getIdioma().size() == 2){
            return "habla dos idiomas";
        }
        if(contable.getIdioma().size() == 3){
            return "habla tres idiomas";
        }
        if(contable.getIdioma().size() == 4){
            return "habla cuatro idiomas";
        }
        return "el idioma se mamo";
    }
    public List<String> enviaPrecios(){
        return contable.getIdioma();
    }
    public int salarioFinal(){
        int diasPesos = contable.getSalario() * contable.getDiasTrabajado();
        int idiomaPesos = 0;
        for(String i:contable.getIdioma()){
            idiomaPesos += Integer.parseInt(i);
        }
        int total = diasPesos + idiomaPesos;
        return total;
    }
}
