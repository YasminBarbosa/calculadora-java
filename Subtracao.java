public class Subtracao extends OperacoesMatematicas {
    @Override
    double calcular(double a, double b){
        double subtrair;

        subtrair = a - b;

        System.out.println("Resultado: " + a + " - " + b + " = " + subtrair);

        return subtrair;
    }
}
