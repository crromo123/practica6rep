/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manel
 */
public class Socios {
    private int clienteNum;
    private String nif;
    private String nombre;
    private String email;
    private String nacim;
    private String pobla;
    private int postal;
    private String telf1;
    private String telf2;
    private String direccion;
    private String provincia;
    private String antiguedad;

    public Socios(int clienteNum, String nif, String nombre, String email, String nacim, String pobla, int postal, String telf1, String telf2, String direccion, String provincia, String antiguedad) {
        this.clienteNum = clienteNum;
        this.nif = nif;
        this.nombre = nombre;
        this.email = email;
        this.nacim = nacim;
        this.pobla = pobla;
        this.postal = postal;
        this.telf1 = telf1;
        this.telf2 = telf2;
        this.direccion = direccion;
        this.provincia = provincia;
        this.antiguedad = antiguedad;
    }

    public int getClienteNum() {
        return clienteNum;
    }

    public void setClienteNum(int clienteNum) {
        this.clienteNum = clienteNum;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacim() {
        return nacim;
    }

    public void setNacim(String nacim) {
        this.nacim = nacim;
    }

    public String getPobla() {
        return pobla;
    }

    public void setPobla(String pobla) {
        this.pobla = pobla;
    }

    public int getPostal() {
        return postal;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }

    public String getTelf1() {
        return telf1;
    }

    public void setTelf1(String telf1) {
        this.telf1 = telf1;
    }

    public String getTelf2() {
        return telf2;
    }

    public void setTelf2(String telf2) {
        this.telf2 = telf2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }
    
}
