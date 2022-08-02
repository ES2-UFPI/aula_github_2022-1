import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Cadastrar Cliente",
		 "Abrir Conta", "Realizar Saque","Realizar Deposito","Ver Saldo", "Extrato", "Sair"));

		while (true) {
			switch (mainMenu.getSelection()) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;		
				case 7:
				System.exit(0);
					break;	
				default:
					break;
			 }
		}
		
	}

}