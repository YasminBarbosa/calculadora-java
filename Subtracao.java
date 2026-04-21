public class Subtracao extends OperacoesMatematicas {
    @Override
    double calcular(double a, double b){
        double subtrair;

        subtrair = a - b;

        System.out.println("O resultado da subtração é: " + subtrair);

        return subtrair;
    }
}
