package mx.com.joseperez.mascotas;

import java.io.Serializable;

public class MascotaModel implements Serializable {
    private int foto;
    private String nombre;
    private int meGusta;
    private int huedoMeGusta;

    public MascotaModel(int foto, String nombre, int meGusta, int huesoMeGusta) {
        this.foto = foto;
        this.nombre = nombre;
        this.meGusta = meGusta;
        this.huedoMeGusta = huesoMeGusta;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public int getHuedoMeGusta() {
        return huedoMeGusta;
    }

    public void setHuedoMeGusta(int huedoMeGusta) {
        this.huedoMeGusta = huedoMeGusta;
    }
}
