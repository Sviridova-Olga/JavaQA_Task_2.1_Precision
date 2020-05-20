import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal regularBonus = BigDecimal.valueOf(0.3);
        BigDecimal specialBonus = BigDecimal.valueOf(0.6);
        BigDecimal totalBonus;
        totalBonus = regularBonus.add(specialBonus);
        System.out.println(totalBonus);


    }
}




