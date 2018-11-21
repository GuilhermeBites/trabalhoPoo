package terminal_totem;

import java.util.*;
import classes.*;

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
				/*Cliente novoCliente = new Cliente();
				cadPessoa(novoCliente);
				clientes.add(novoCliente);*/
				System.out.println("Deseja se cadastrar como "
						+"cliente ou administrador ?");
				System.out.println("< 1 - administrador (e necessario permissao do sistema)>");
				System.out.println("< 2 - cliente>");
				System.out.print("Opção -> ");
				int opcaoCadastro = scan.nextInt();
				if(opcaoCadastro == 1/*admin*/) {
					Administrador adminSistema = new Administrador();
					System.out.println("<Digite a senha de administrador para permitir o cadastro>");
					System.out.print("Senha -> ");
					int senhaAdmin = scan.nextInt();
					boolean permissao = permissaoAdmin(senhaAdmin,adminSistema);
					if(permissao == true) {
						Administrador adm = new Administrador();
						cadAdmin(adm);
					}else {
						System.out.println("nao foi possivel cadastrar o administrador");
					}
					
				}else if(opcaoCadastro == 2/*cliente*/) {
					Cliente novoCliente = new Cliente();
					cadPessoa(novoCliente);
					clientes.add(novoCliente);
				}
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
	
	public static boolean permissaoAdmin(int senha,Administrador admin) {
		if(senha == admin.senhaAdmin) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void cadAdmin(Administrador admin) {
		System.out.println("Favor preecher os campos a baixo:");
		System.out.print("Nome: ");
		admin.setNome(scan.nextLine());
		System.out.println("\nLogin: ");
		admin.setLogin(scan.nextLine());
		System.out.println("\nSenha: ");
		admin.setSenha(scan.nextLine());
	}
	

}
