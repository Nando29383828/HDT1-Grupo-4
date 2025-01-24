
// LicuadoraSimple.java
public class LicuadoraSimple implements Licuadora {
    private boolean encendida;
    private boolean llena;
    private int velocidadActual;
    private String ingrediente;

    public LicuadoraSimple() {
        this.encendida = false;
        this.llena = false;
        this.velocidadActual = 0;
        this.ingrediente = null;
    }

    @Override
    public void encender() {
        if (!llena) {
            System.out.println("La licuadora está vacía. Llénala antes de encenderla.");
            return;
        }
        encendida = true;
        System.out.println("Licuadora encendida.");
    }

    @Override
    public void apagar() {
        encendida = false;
        velocidadActual = 0;
        System.out.println("Licuadora apagada.");
    }

    @Override
    public void llenar(String ingrediente) {
        if (llena) {
            System.out.println("La licuadora ya está llena.");
            return;
        }
        this.ingrediente = ingrediente;
        this.llena = true;
        System.out.println("Licuadora llenada con: " + ingrediente);
    }

    @Override
    public void vaciar() {
        this.ingrediente = null;
        this.llena = false;
        System.out.println("La licuadora está vacía.");
    }

    @Override
    public void aumentarVelocidad() {
        if (!encendida) {
            System.out.println("La licuadora está apagada. Enciéndela primero.");
            return;
        }
        if (velocidadActual < 10) {
            velocidadActual++;
            System.out.println("Velocidad de la licuadora incrementada a: " + velocidadActual);
        } else {
            System.out.println("La licuadora ya está a la máxima velocidad.");
        }
    }

    @Override
    public int obtenerVelocidadActual() {
        return velocidadActual;
    }

    @Override
    public boolean estaLlena() {
        return llena;
    }
}


