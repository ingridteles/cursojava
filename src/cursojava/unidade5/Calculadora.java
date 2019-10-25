package cursojava.unidade5;

public class Calculadora {
	public static void main(String[] args) {

		IMatematica objeto = new IMatematica() {

			@Override
			public int subtrair(int a, int b) {
				return (a - b);
			}

			@Override
			public int somar(int a, int b) {
				return (a + b);
			}

			@Override
			public int multiplicar(int a, int b) {
				return (a * b);
			}

			@Override
			public int dividir(int a, int b) {
				return (a / b);
			}
		};
		
		System.out.println(objeto.getClass());
		System.out.println(objeto.somar(5, 5));
		System.out.println(objeto.subtrair(5, 5));
		System.out.println(objeto.multiplicar(5, 5));
		System.out.println(objeto.dividir(5, 5));
	}

}
