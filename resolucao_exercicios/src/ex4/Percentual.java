package ex4;

public class Percentual {
    public static void main(String[] args) {
        //PERCENTUAL DE CADA ESTADO



        double SP, RJ, MG, ES, outros, total;
        SP = 67836.43;
        RJ = 36678.66;
        MG = 29229.88;
        ES = 27165.48;
        outros = 19849.53;
        total = SP + RJ + MG + ES + outros;
        System.out.println("\n---------------------------------------------------\n");
        System.out.println("Faturamento mensal por estado:\n");
        System.out.println("SP R$ "+SP);
        System.out.println("RJ R$ "+RJ);
        System.out.println("MG R$ "+MG);
        System.out.println("ES R$ "+ES);
        System.out.println("outros R$ "+outros);
        System.out.println("\nFaturamento total: R$ " + total);
        System.out.println("\n---------------------------------------------------\n");
        
        //percentual dos estados
        SP = SP * 100 / total;
        RJ = RJ * 100 / total;
        MG = MG * 100 / total;
        ES = ES * 100 / total;
        outros = outros * 100 / total;
        System.out.println("Percentual (%) do faturamento mensal por estado:\n");
        System.out.println("SP "+SP+" %");
        System.out.println("RJ "+RJ+" %");
        System.out.println("MG "+MG+" %");
        System.out.println("ES "+ES+" %");
        System.out.println("outros "+outros+" %");
        System.out.println("\n---------------------------------------------------\n");
        
    }
}
