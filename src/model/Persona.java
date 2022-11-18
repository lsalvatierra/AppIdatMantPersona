package model;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombres;
    private String apellidos;
    private String email;
    private String genero;
    private List<String> hobbies;

    public Persona() {
        this.hobbies = new ArrayList<>();
    }

    public Persona(String nombres, String apellidos, String email, String genero) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.genero = genero;
        this.hobbies = new ArrayList<>();
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
