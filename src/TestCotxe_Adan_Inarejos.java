public class TestCotxe_Adan_Inarejos {
    public static void main(String[] args){
        try {
            Coche_Ismael_Martin c1= new Coche_Ismael_Martin("Audi", "r8", TipusCanvi.CanviManual);
            c1.arrancarMotor();
            System.out.println(c1.comprovaMotor());
            System.out.println(c1.getRevolucions());
            c1.aturarMotor();
            System.out.println(c1.comprovaMotor());
            System.out.println(c1.getRevolucions());
            c1.arrancarMotor();
            System.out.println(c1.comprovaMotor());
            System.out.println(c1.getRevolucions());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
