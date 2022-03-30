import java.util.Random;

public class NewPassword {
    public static void main(String[] args) {

        System.out.println(NewPassword(17));
    }
    /********************************************************
     * nazwa funkcji: NewPassword
     * parametry wejściowe: int dlugosc
     * wartość zwracana: wartosc zwracana jest to
     * * Hasło które zostało Wygenerowane
     * autor: Damian Bednarski 2pp
     * ********************************************************/
    public static String NewPassword(int dlugosc) {
        if (dlugosc >= 12) {
            String pass = "";
            Random gen = new Random();
            int asci;
            for (int i = 0; i <= dlugosc; i++) {
                asci = (gen.nextInt(155) + 100);
                char znak = (char) asci;
                pass += znak;
            }
            return "Wygenerowane hasło: "+ pass;
        } else {
            System.out.println("Za krótkie hasło");
        }
        return null;
    }
}
