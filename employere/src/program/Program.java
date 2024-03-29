package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregados;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Empregados> empregados = new ArrayList<>();
		
		System.out.print("quantos funcionarios serão registrados?: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		//leitura dos dados 
		
		for(int i=0;i<n;i++) {
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome:"); 
			String name = sc.nextLine();
			System.out.print("Salário: "); 
			Double salary = sc.nextDouble();
			sc.nextLine();
			
			//adicionando os elementos na lista
			empregados.add(new Empregados(id,name,salary));
		}
		
		System.out.println("digite o id do funcionário que receberá um aumento: ");
		int id_busca = sc.nextInt();
		int id_troca = retorna_id(empregados,id_busca);
		
		//buscando id de funcionário
		while(id_troca<0) {
			System.out.println("id inválido");
			id_busca = sc.nextInt();
			id_troca = retorna_id(empregados,id_busca);
		}
		
		//aumento de salário
		System.out.print("digite a porcentagem a ser aumentada: ");
		double porcent = sc.nextDouble();
		troca_salario(empregados,porcent, id_troca);
		
		//mostra no terminal os dados dos funcionários
		printar(empregados);
		
		sc.close();
	}
	
	//função para buscar funcionário pelo id
	public static int retorna_id(List <Empregados> empregados,int id_busca) {
		for(Empregados x:empregados) {
			if(x.getId()==id_busca) {
				int id_troca = x.getId();
				return id_troca;
			}
		}
		id_busca = -1;
		return id_busca;
	}
	
	//função print
	public static void printar(List<Empregados> empregados) {
		for(Empregados x:empregados) {
			System.out.println(x);
		}
	}
	
	//função para aumentar o salário
	public static void troca_salario(List <Empregados> empregados, double porcent, int id) {
		for(Empregados x:empregados) {
			if(x.getId()==id) {
				x.aumenta_salario(porcent);
			}
		}
	}
}
