
package Cajero;

public class Usuarios {
    private String nombre;
    private String contraseña1;
    private String usuario;
    private String saldo;
    private String empresa;
    private String montomaximo;

    public Usuarios(String nombre, String contraseña1, String usuario, String saldo, String empresa, String montomaximo) {
        this.nombre = nombre;
        this.contraseña1 = contraseña1;
        this.usuario = usuario;
        this.saldo = saldo;
        this.empresa = empresa;
        this.montomaximo = montomaximo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña1() {
        return contraseña1;
    }

    public void setContraseña1(String contraseña1) {
        this.contraseña1 = contraseña1;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getMontomaximo() {
        return montomaximo;
    }

    public void setMontomaximo(String montomaximo) {
        this.montomaximo = montomaximo;
    }
    
    
    
    
    
}
