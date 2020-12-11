public class CotxeSegonaPart_Adan_Inarejos extends Cotxe_Adan_Inarejos{
    private EstatsMotorCotxe estado=EstatsMotorCotxe.Aturat;
    private int revoluciones=0;
    private MarxasAutomatic marxasA=MarxasAutomatic.N;
    private MarxasManual marxasM=MarxasManual.N;
    public CotxeSegonaPart_Adan_Inarejos(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }
    public void CanviarMarxaAutomatic(char a){
        if (tipuscanvi.equals(TipusCanvi.CanviAutomatic)){
            if (a=='+'){
                marxasA=MarxasAutomatic.F;
                System.out.println(marxasA);
            }
        }
    }

    public void CambiarMarxaManual(char a){
        if (tipuscanvi.equals(TipusCanvi.CanviManual)){

        }
    }

    public MarxasAutomatic getMarxasA() {
        return marxasA;
    }

}
