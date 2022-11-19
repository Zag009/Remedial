import java.util.ArrayList;

public class Proyecto {
    
        
    private String nombre;
    private String tipo;
    private Boolean barato;
    ArrayList<empleados> personal=new ArrayList<empleados>();
    
    public Proyecto(String nombre, String tipo) {
        this.nombre=nombre;
        this.tipo=tipo;
    }
    public String ver(){
        String tipoTrabajador="";
        if(this.tipo.equalsIgnoreCase("1")){
            tipoTrabajador="Ingeniero-practicante";
        }else if(this.tipo.equalsIgnoreCase("2")){
            tipoTrabajador="Practicante-administrador";
        }else if(this.tipo.equalsIgnoreCase("3")){
            tipoTrabajador="ingeniero-administrador";
        }else if(this.tipo.equalsIgnoreCase("4")){
            tipoTrabajador="Practicante-administrador";
        }
        return tipoTrabajador;
    }

    public void personal(empleados n1,empleados n2){
            personal.add(n1);
            personal.add(n2);
        
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public Boolean isBarato() {
        return this.barato;
    }

    public Boolean getBarato() {
        return this.barato;
    }

    public void setBarato(Boolean barato) {
        this.barato = barato;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", tipo='" + getTipo() + "'" +
            ", barato='" + isBarato() + "'" +
            "}";
    }



}
