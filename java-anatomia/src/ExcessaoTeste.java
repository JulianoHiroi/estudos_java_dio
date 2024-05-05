public class ExcessaoTeste {
    public static void main(String[] args) {
        String oi = "oi";
        System.out.println(oi == "oi");

    }

    public static String ValidaOi(String oi) throws FormatOiException {

        if (!(oi == "oi")) {
            System.err.println(oi == "oi");
            throw new FormatOiException();
        }

        return oi;
    }
}
