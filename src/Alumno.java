import java.util.ArrayList;
import java.util.Objects;

public class Alumno {
    private String nombreCompleto;
    private long legajo;
    private ArrayList<Nota> Nota;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Nota> getNota() {
        return Nota;
    }

    public void setNota(ArrayList<Nota> nota) {
        Nota = nota;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}
