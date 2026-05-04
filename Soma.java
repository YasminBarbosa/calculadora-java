public class Soma extends OperacoesMatematicas {
    @Override
    double calcular(double a, double b){
        double soma;

        soma = a + b;

        System.out.println("Resultado: " + a + " + " + b + " = " + soma);

        return soma;
    }
}
