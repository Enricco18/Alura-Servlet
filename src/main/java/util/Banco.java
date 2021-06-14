package util;

import java.util.ArrayList;
import java.util.List;

import model.Empresa;

public class Banco {
	private static List<Empresa> empresasLista = new ArrayList<>();
	
	static {
		Empresa empresa1 = new Empresa();
		Empresa empresa2 = new Empresa();
		empresa1.setNome("Zup");
		empresa2.setNome("Alura");
		Banco.empresasLista.add(empresa1);
		Banco.empresasLista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		Banco.empresasLista.add(empresa);
	}
	
	public List<Empresa> getAllEmpresa(){
		return Banco.empresasLista;
	}
}
