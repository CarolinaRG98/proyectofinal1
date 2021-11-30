package cl.carolina.proyectofinal.modelo;

public class Servicios {
    private String idservicio;
    private String nombreservicio;
    private String direccion;

    public Servicios(){
        this.idservicio="";
        this.nombreservicio="";
        this.direccion="";
    }

    public Servicios(String idservicio, String nombreservicio, String direccion) {
        this.idservicio = idservicio;
        this.nombreservicio = nombreservicio;
        this.direccion = direccion;
    }

    public String getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(String idservicio) {
        this.idservicio = idservicio;
    }

    public String getNombreservicio() {
        return nombreservicio;
    }

    public void setNombreservicio(String nombreservicio) {
        this.nombreservicio = nombreservicio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Servicios{" +
                "idservicio='" + idservicio + '\'' +
                ", nombreservicio='" + nombreservicio + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
