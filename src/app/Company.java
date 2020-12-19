package app;

import java.util.*;
import app.interfaces.*;
import app.abstracts.*;
import app.departaments.*;

public class Company {
	public List<People> employees;
	public List<Salary> salarys;
	public Finance financeDepartament;
	
	public Company () {
		this.employees = new ArrayList<>();
		this.financeDepartament = new Finance();
		this.salarys = new ArrayList<>();
	}
}
/*
Empresa
Funcionários
Calculo por tipo de funcionário

Funcionários

Pessoa (Classe Abstrata)
|-> nome, RG, CPF
|-> Professor
| interface Funcionário(Salario Bruto, valor Desconto Folha)
|-> Motorista


public interface Funcionario{
public double valorSalarioBruto();
public double descontoSalario();
}

Empresa
|-> lista de funcionários
|-> Financeiro
|-> lista de Salarios
|-> valor total dos Salarios
|-> calculoSalário

CalculoSalario (Interface Salario) - ValorSalarioLiquido

public interface Salario{
public double valorSalarioLiquido();
}

public class Empresa{
Financeiro departamentoFinanceiro

public Empresa(Financeiro financeiro){
this.departamentoFinanceiro = financeiro;
}
}
*/