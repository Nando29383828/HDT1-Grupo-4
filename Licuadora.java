// Licuadora.java
public interface Licuadora {
    void encender();
    void apagar();
    void llenar(String ingrediente);
    void vaciar();
    void aumentarVelocidad();
    int obtenerVelocidadActual();
    boolean estaLlena();
}
