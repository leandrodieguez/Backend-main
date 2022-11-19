package com.portfolio.ld.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String img;
    private String about;
    private String title;
    private String banner;
    private String telefono;
    private String correo;
    private String provincia;
    private String pais;
    private String fechanacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String img, String about, String title, String banner, String telefono, String correo, String provincia, String pais, String fechanacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.about = about;
        this.title = title;
        this.banner = banner;
        this.telefono = telefono;
        this.correo = correo;
        this.provincia = provincia;
        this.pais = pais;
        this.fechanacimiento = fechanacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String proviencia) {
        this.provincia = proviencia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    
    
    
    
    
    
}