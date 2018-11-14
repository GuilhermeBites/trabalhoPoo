package terminal_totem;

import java.util.*;

import classes.Cliente;

public class MainClass {
	static int idSequence = 0;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList();
		
		int op = 0;
		
		do {
			System.out.println("Selecione a opção desejada: ");
			System.out.println("< 1 - Novo Cadastro >");
			System.out.println("< 2 - Fazer Login >");
			System.out.println("< 0 - Sair >");
			System.out.print("Opção -> ");
			op = scan.nextInt();
			scan.nextLine();
			switch(op) {
			case 1:
				Cliente novoCliente = new Cliente();
				cadPessoa(novoCliente);
				clientes.add(novoCliente);
				break;
			case 2:
				break;
			case 0:
				System.out.println("Obrigado pela visita!");
				break;
			}
		}while(op != 0);
		
		for(Cliente cliente : clientes) {
			System.out.println("Nome: " + cliente.getNome());
		}
		
		
	}
	
	
	public static void cadPessoa(Cliente pessoa) {
		System.out.println("Favor preecher os campos a baixo:");
		System.out.print("Nome: ");
		pessoa.setNome(scan.nextLine());
		System.out.println("\nLogin: ");
		pessoa.setLogin(scan.nextLine());
		System.out.println("\nSenha: ");
		pessoa.setSenha(scan.nextLine());
		pessoa.setId(idSequence);
		
		idSequence += 1;
	}

}
