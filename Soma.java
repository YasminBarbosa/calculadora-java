public class Soma extends OperacoesMatematicas {
    @Override
    double calcular(double a, double b){
        double soma;

        soma = a + b;

        System.out.println("O resultado da soma é: " + soma);

        return soma;
    }
}
