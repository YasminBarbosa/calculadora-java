public class Multiplicacao extends OperacoesMatematicas{
    @Override
    double calcular(double a, double b){
        double multiplicar;

        multiplicar = a * b;

        System.out.println("O resultado da multiplicação é: " + multiplicar);

        return multiplicar;
    }
}
