package modelo;

public class Usuario {
    private String usuario;
    private String contraseña;

    public Usuario() {
        this.usuario = "";
        this.contraseña = "";
    }

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    

    public boolean validar(String user, String pass) {
        return this.usuario.equals(user) && this.contraseña.equals(pass);
    }
}