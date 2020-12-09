public class TestCotxe_Adan_Inarejos {
    public static void main(String[] args) throws Exception {
        Cotxe_Adan_Inarejos c1= new Cotxe_Adan_Inarejos("Audi", "r8", TipusCanvi.CanviManual);
        c1.arrancarMotor();
        System.out.println(c1.comprovaMotor());
        System.out.println(c1.getRevolucions());
        c1.aturarMotor();
        System.out.println(c1.comprovaMotor());
        System.out.println(c1.getRevolucions());
        c1.arrancarMotor();
        System.out.println(c1.comprovaMotor());
        System.out.println(c1.getRevolucions());
    }

}
