public class TestCotxe_Adan_Inarejos {
    public static void main(String[] args){
        try {
            //Instanciamos un choche automatico.
            System.out.println("- Coche Automatico");
            CotxeSegonaPart_Adan_Inarejos c1= new CotxeSegonaPart_Adan_Inarejos("Audi", "r8", TipusCanvi.CanviAutomatic);
            c1.arrancarMotor();
            c1.CanviarMarxaAutomatic('+');
            c1.CanviarMarxaAutomatic('-');
            c1.CanviarMarxaAutomatic('-');

            System.out.println(" ");

            //Instanciamos un choche manual.
            System.out.println("- Coche Manual");
            CotxeSegonaPart_Adan_Inarejos c2=new CotxeSegonaPart_Adan_Inarejos("Audi", "r8", TipusCanvi.CanviManual);
            c2.arrancarMotor();
            c2.CamviarMarxaManual('+');
            c2.CamviarMarxaManual('+');
            c2.CamviarMarxaManual('-');
            c2.CamviarMarxaManual('-');
            c2.CamviarMarxaManual('-');
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
