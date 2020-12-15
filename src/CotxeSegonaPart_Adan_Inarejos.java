//Se crea un enum para las marchas automaticas y manuales.
enum MarxasAutomatic {
    F,
    N,
    R
}
enum MarxasManual {
    R,
    N,
    M1,
    M2,
    M3,
    M4,
    M5,
    M6
}

public class CotxeSegonaPart_Adan_Inarejos extends Cotxe_Adan_Inarejos{
    private EstatsMotorCotxe estado=EstatsMotorCotxe.Aturat;
    private int revoluciones=0;
    private MarxasAutomatic marxasA=MarxasAutomatic.N;
    private MarxasManual marxasM=MarxasManual.N;
    //Contructor.
    public CotxeSegonaPart_Adan_Inarejos(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }
    public void CanviarMarxaAutomatic(char a) throws Exception {
        if (tipuscanvi.equals(TipusCanvi.CanviAutomatic)&&comprovaMotor().equals(EstatsMotorCotxe.EnMarxa)){
            if (a=='+'){
                switch (marxasA){
                    case R:
                        marxasA=MarxasAutomatic.N;
                        System.out.println("Ha cambiado a marcha: " + getMarxasA());
                        break;
                    case N:
                        marxasA=MarxasAutomatic.F;
                        System.out.println("Ha cambiado a marcha: " + getMarxasA());
                        break;
                    case F:
                        throw  new Exception("Ya estas en la marxa mas alta");
                }
            } else if (a=='-'){
                switch (marxasA){
                    case F:
                        marxasA=MarxasAutomatic.N;
                        System.out.println("Ha cambiado a marcha: " + getMarxasA());
                        break;
                    case N:
                        marxasA=MarxasAutomatic.R;
                        System.out.println("Ha cambiado a marcha: " + getMarxasA());
                        break;
                    case R:
                        throw new Exception("Ya esta en la marxa mas baja");
                }
            } else {
                throw new Exception("Los unicos valores validos son + o -.");
            }
        } else if (comprovaMotor().equals(EstatsMotorCotxe.EnMarxa)){
            throw new Exception("Este coche es manual, por lo tanto no puedes usar el metodo de marchas automaticas.");
        } else {
            throw new Exception("El coxhe esta apagado, por lo tanto no puedes cambiar de marxa");
        }
    }

    public void CamviarMarxaManual(char a) throws Exception {
        if (tipuscanvi.equals(TipusCanvi.CanviManual)&&comprovaMotor().equals(EstatsMotorCotxe.EnMarxa)){
            if (a=='+'){
                switch (marxasM){
                    case R:
                        marxasM=MarxasManual.N;
                        System.out.println("Has cambiado a la marxa: " + getMarxasM());
                        break;
                    case N:
                        marxasM=MarxasManual.M1;
                        System.out.println("Has cambiado a la marxa: " + getMarxasM());
                        break;
                    case M1:
                        marxasM=MarxasManual.M2;
                        System.out.println("Has cambiado a la marxa: " + getMarxasM());
                        break;
                    case M2:
                        marxasM=MarxasManual.M3;
                        System.out.println("Has cambiado a la marxa: " + getMarxasM());
                        break;
                    case M3:
                        marxasM=MarxasManual.M4;
                        System.out.println("Has cambiado a la marxa: " + getMarxasM());
                        break;
                    case M4:
                        marxasM=MarxasManual.M5;
                        System.out.println("Has cambiado a la marxa: " + getMarxasM());
                        break;
                    case M5:
                        marxasM=MarxasManual.M6;
                        System.out.println("Has cambiado a la marxa: " + getMarxasM());
                    case M6:
                        throw new Exception("Ya estas en la marxa mas alta");
                }
            } else if (a=='-'){
                switch (marxasM){
                    case M6:
                        marxasM=MarxasManual.M5;
                        System.out.println("Has cambiado a la marxa: " + getMarxasM());
                        break;
                    case M5:
                        marxasM=MarxasManual.M4;
                        System.out.println("Has cambiado a la marxa: " + getMarxasM());
                        break;
                    case M4:
                        marxasM=MarxasManual.M3;
                        System.out.println("Has cambiado a la marxa: " + getMarxasM());
                        break;
                    case M3:
                        marxasM=MarxasManual.M2;
                        System.out.println("Has cambiado a la marxa: " + getMarxasM());
                        break;
                    case M2:
                        marxasM=MarxasManual.M1;
                        System.out.println("Has cambiado a la marxa: " + getMarxasM());
                        break;
                    case M1:
                        marxasM=MarxasManual.N;
                        System.out.println("Has cambiado a la marxa: " + getMarxasM());
                        break;
                    case N:
                        marxasM=MarxasManual.R;
                        System.out.println("Has cambiado a la marxa: " + getMarxasM());
                        break;
                    case R:
                        throw new Exception("Ya estas en la marxa mas baja");
                }
            } else {
                throw new Exception("Solo puedes introducir los valores + o -.");
            }
        } else if (comprovaMotor().equals(EstatsMotorCotxe.EnMarxa)) {
            throw new Exception("Este coche es Automatico, por lo tanto no puedes usar el metodo de marchas Manuales.\"");
        } else {
            throw new Exception("El coche esta apagado, por lo tanto no puedes cambiar de marxa");
        }
    }

    public MarxasAutomatic getMarxasA() {
        return marxasA;
    }

    public MarxasManual getMarxasM() {
        return marxasM;
    }

    public EstatsMotorCotxe getEstado() {
        return estado;
    }
}
