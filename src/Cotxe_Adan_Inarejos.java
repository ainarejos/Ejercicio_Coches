public class Cotxe_Adan_Inarejos extends CotxeAbstracte implements InterfaceCotxe{
    private EstatsMotorCotxe estado=EstatsMotorCotxe.Aturat;
    private int revoluciones=0;
    public Cotxe_Adan_Inarejos(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }

    @Override
    public void arrancarMotor() throws Exception {
        if (this.estado.equals(EstatsMotorCotxe.EnMarxa)){
            throw new Exception("El coche ya esta en marcha");
        } else {
            this.estado=EstatsMotorCotxe.EnMarxa;
        }
    }

    @Override
    public EstatsMotorCotxe comprovaMotor() {
        return estado;
    }

    @Override
    public int getRevolucions() {
        if (this.estado.equals(EstatsMotorCotxe.Aturat)){
            return revoluciones;
        } else {
             revoluciones=(int)(Math.random()*6500+1);
             return revoluciones;
        }
    }

    @Override
    public void aturarMotor() throws Exception {

    }
}

