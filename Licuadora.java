import org.junit.*;

public class Licuadora implements ILicuadora {

    private int velocidad;
    private boolean lleno;

    public Licuadora(){
        this.velocidad = 0;
        this.lleno = false;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public boolean endenderLicuadora(){
        if (velocidad == 0) {
            System.out.println("Se encendio la licuadora");
            setVelocidad(obtenerVelocidadActual()+ 1);
            return false;
        }
        else {
            System.out.println("La Licuadora ya estaba endendida");
            return true;
        }
    }

    @Override
    public boolean llenarLicuadora(){
        if (!lleno){
            lleno = true;
            System.out.println("Se lleno la licuadora");
            return true;
        }
        else {
            System.out.println("La licuadora ya estaba llena");
            return false;
        }
    }

    @Override
    @Test
    public boolean incrementarVelocidad(int velocidad) {
        if (!lleno){
            System.out.println("No se puede cambiar velocidad. Esta vacia");
            return true;
        }

        if (velocidad >= 10){
            System.out.println("No se puede cambiar velocidad. Esta al maximo");
            return true;
        }

        if (velocidad == 0){
            System.out.println("No se puede cambiar velocidad. Esta apagada");
            return false;
        }

        else {
            setVelocidad(obtenerVelocidadActual()+1);
            System.out.println("Se subio la velocidad a:" + obtenerVelocidadActual());
            return true;
        }
    }

    @Override
    public int obtenerVelocidadActual(){
        return velocidad;
    }

    @Override
    public boolean estaLlena(){
        return lleno;
    }

    @Override
    public boolean vaciarLicuadora(){
        if (lleno){
            System.out.println("La Licuadora se vacio");
            lleno = false;
            return true;
        }

        else {
            System.out.println("La Licuadora ya estaba vacia");
            return false;
        }
    }

    @Override
    public boolean apagarLicuadora(){
        if (velocidad != 0) {
            System.out.println("La licuadora se a apagado");
            velocidad = 0;
            return true;
        } 

        else {
            System.out.println("La licuadora ya estaba apagada.");
            return false;
        }
    }
}