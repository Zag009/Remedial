public class empleados {
    private String nombre;
    private boolean barato;
    private boolean tiempoCompleto;
    private String tipo;
    private boolean amigable;
    private boolean colaboradores;
    private boolean experiencia;
    private boolean crativo;


    public empleados(String nombre, boolean barato, boolean tiempoCompleto, String tipo, boolean amigable, boolean colaboradores,boolean experiencia,boolean creativo) {
        this.nombre = nombre;
        this.barato = barato;
        this.tiempoCompleto = tiempoCompleto;
        this.tipo = tipo;
        this.amigable = amigable;
        this.colaboradores = colaboradores;
        this.experiencia=experiencia;
        this.crativo=creativo;
    }

    public boolean isCrativo() {
        return this.crativo;
    }

    public boolean getCrativo() {
        return this.crativo;
    }

    public void setCrativo(boolean crativo) {
        this.crativo = crativo;
    }


    public boolean isExperiencia() {
        return this.experiencia;
    }

    public boolean getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isBarato() {
        return this.barato;
    }

    public boolean getBarato() {
        return this.barato;
    }

    public void setBarato(boolean barato) {
        this.barato = barato;
    }

    public boolean isTiempoCompleto() {
        return this.tiempoCompleto;
    }

    public boolean getTiempoCompleto() {
        return this.tiempoCompleto;
    }

    public void setTiempoCompleto(boolean tiempoCompleto) {
        this.tiempoCompleto = tiempoCompleto;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAmigable() {
        return this.amigable;
    }

    public boolean getAmigable() {
        return this.amigable;
    }

    public void setAmigable(boolean amigable) {
        this.amigable = amigable;
    }

    public boolean isColaboradores() {
        return this.colaboradores;
    }

    public boolean getColaboradores() {
        return this.colaboradores;
    }

    public void setColaboradores(boolean colaboradores) {
        this.colaboradores = colaboradores;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", barato='" + isBarato() + "'" +
            ", tiempoCompleto='" + isTiempoCompleto() + "'" +
            ", tipo='" + getTipo() + "'" +
            ", amigable='" + isAmigable() + "'" +
            ", colaboradores='" + isColaboradores() + "'" +
            "}";
    }

}
