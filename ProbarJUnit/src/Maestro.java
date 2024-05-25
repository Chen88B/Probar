public class Maestro {
    private String nombre;
    private int identifcador;

    public Maestro(String nombre,int identifcador){
        this.nombre=nombre;
        this.identifcador=identifcador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdentifcador(int identifcador) {
        this.identifcador = identifcador;
    }

    public int getIdentifcador() {
        return identifcador;
    }

    @Override
    public String toString() {
        return "Maestro{" + "\n"+
                "Nombre='" + nombre + "\n" +
                "Identifcador=" + identifcador + "\n"+
                '}';
    }
}