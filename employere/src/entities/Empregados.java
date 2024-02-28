package entities;

public class Empregados {
	private Integer id;
	private String name;
	private Double salary;
	
	public Empregados() {}
	
	public Empregados(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	
	//função para ajustar o salário
	public void aumenta_salario(double porcent) {
		salary = salary*(1+porcent/100);
	}
	
	//função de print
	public String toString() {
		return name + ", " + id +  ", R$" + String.format("%.2f", salary);
	}
}
