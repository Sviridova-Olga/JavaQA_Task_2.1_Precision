import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double regularBonus = 0.3;
        double specialBonus = 0.6;
        double totalBonus = regularBonus + specialBonus;
        DecimalFormat f = new DecimalFormat("##.##");
        System.out.println(f.format(totalBonus));
    }
}




