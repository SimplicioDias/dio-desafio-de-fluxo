import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = leia.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = leia.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) 
            throw new ParametrosInvalidosException();
        else{
            int contagem = parametroDois - parametroUm;
            for (int x=1; x <= contagem+1; x++){
                System.out.println("Imprimindo o número: "+ x);
            }
        }
	}
}
