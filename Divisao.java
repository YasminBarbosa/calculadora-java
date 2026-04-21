public class Divisao extends OperacoesMatematicas {
    @Override
    double calcular(double a, double b) throws DivisaoPorZero{
        

        if (b == 0) {
            throw new DivisaoPorZero();
        }
        else{
            
            double dividir;

            dividir = a / b;

            System.out.println("O resultado da divisão é: " + dividir);

            return dividir;
        }
        
    }    
}
