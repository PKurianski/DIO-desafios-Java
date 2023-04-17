package desafios.src.idade;

import java.util.Scanner;
import java.text.DecimalFormat;

public class IdadePlanetaria {
    private static final double MARTE_ANOS_TERRA = 1.88;
    private static final double VENUS_ANOS_TERRA = 0.62;
    private static final double JUPITER_ANOS_TERRA = 11.86;
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.00");

    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        double idadeTerrestre = scanner.nextDouble();
        String planeta = scanner.next();
        scanner.close();
        String output = "";
        double idadePlaneta = 0.0;
  
        switch(planeta){
            case "Marte":
                idadePlaneta = idadeTerrestre / MARTE_ANOS_TERRA;
                output = "Idade equivalente em Marte: ";
                break;
            case "Venus":
                idadePlaneta = idadeTerrestre / VENUS_ANOS_TERRA;
                output = "Idade equivalente em Venus: ";
                break;
            case "Jupiter":
                idadePlaneta = idadeTerrestre / JUPITER_ANOS_TERRA;
                output = "Idade equivalente em Jupiter: ";
                break;
            default:
                System.out.println("Planeta invalido.");
                return;
        }

        String idadePlanetaFormat = DECIMAL_FORMAT.format(idadePlaneta);
        System.out.println(output + idadePlanetaFormat + " anos");

    }
}
