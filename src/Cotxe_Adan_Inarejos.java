public class Cotxe_Adan_Inarejos extends CotxeAbstracte implements InterfaceCotxe{
    //En esta parte del codigo se definen las variables estado del motor y la variable revoluciones.
    private EstatsMotorCotxe estado=EstatsMotorCotxe.Aturat;
    private int revoluciones=0;
    //Este es el metodo constructor.
    public Cotxe_Adan_Inarejos(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }
    // A partir de aqui se sobrescriben los metodos de la interfaz y se define que hacen cada uno de ellos.
    @Override
    //Este metodo lanza una excepcion si el coche ya esta en marxa y si esta parado lo arranca.
    public void arrancarMotor() throws Exception {
        if (this.estado.equals(EstatsMotorCotxe.EnMarxa)){
            throw new Exception("El cotxe ya esta en marxa");
        } else {
            this.estado=EstatsMotorCotxe.EnMarxa;
        }
    }

    @Override
    //Este metodo nos devuelve el estado el estado del motor, si esta parado o en marcha.
    public EstatsMotorCotxe comprovaMotor() {
        return estado;
    }

    @Override
    //Este metodo nos devuelve las revoluciones, si el coche esta parado nos devuelve 0, y si el coche esta en marcha nos devuelve un numero aleatorio entre 1 y 6500.
    public int getRevolucions() {
        if (this.estado.equals(EstatsMotorCotxe.Aturat)){
            return 0;
        } else {
             revoluciones=(int)(Math.random()*6500+1);
             return revoluciones;
        }
    }

    @Override
    //Por ultimo este metodo lanza una excepcion si el coche esta parado, y si esta en marcha lo para.
    public void aturarMotor() throws Exception {
        if(this.estado.equals(EstatsMotorCotxe.Aturat)){
            throw new Exception("El cotxe ya esta aturat");
        } else {
            this.estado=EstatsMotorCotxe.Aturat;
        }
    }


}

