

public class Licuadora implements ILicuadora {

    private int velocidad;
    private boolean lleno;

    public Licuadora(){
        this.velocidad = 0;
        this.lleno = false;
    }

    public setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean endenderLicuadora(){
        if (velocidad = 0) {
            System.out.println("Se encendio la licuadora");
            Licuadora.setVelocidad(obtenerVelocidadActual()+ 1);
        }
        else {
            System.out.println("La Licuadora ya estaba endendida");
        }
    }

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

    public boolean incrementarVelocidad(int velocidad) {
        if (!llena){
            System.out.println("No se puede cambiar velocidad. Esta vacia");
        }

        if (velocidad >= 10){
            System.out.println("No se puede cambiar velocidad. Esta al maximo");
        }

        if (velocidad = 0){
            System.out.println("No se puede cambiar velocidad. Esta apagada");
            return false;
        }

        else {
            licuadora.setVelocidad(obtenerVelocidadActual()+1);
            System.out.println("Se subio la velocidad a:" + obtenerVelocidadActual());
        }
    }

    public int obtenerVelocidadActual(){
        return velocidad;
    }

    public boolean estaLlena(){
        return lleno;
    }

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