public class Multiplicacao extends OperacoesMatematicas{
    @Override
    double calcular(double a, double b){
        double multiplicar;

        multiplicar = a * b;

        System.out.println("Resultado: " + a + " * " + b + " = " + multiplicar);

        return multiplicar;
    }
}
