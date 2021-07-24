package Exercicio06ITA;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	
	public static int ingredientesTotal = 0;
	
	public List<String> listaIngredientes = new ArrayList<>();
	public double preco;
	
	public static void zerarTotalIngredientes() {
		ingredientesTotal = 0;
	}
	
	public void adicionarIngrediente(String ingrediente) {
		listaIngredientes.add(ingrediente);
		contabilizaIngrediente();
	}
	
	public static int getIngredientesTotal() {
		return ingredientesTotal;
	}

	public static void setIngredientesTotal(int ingredientesTotal) {
		Pizza.ingredientesTotal = ingredientesTotal;
	}

	public List<String> getListaIngredientes() {
		return listaIngredientes;
	}

	public void setListaIngredientes(List<String> listaIngredientes) {
		this.listaIngredientes = listaIngredientes;
	}

	public static void contabilizaIngrediente() {
		ingredientesTotal++;
	}
	
	public double getPreco() {
		if(listaIngredientes.size() <= 0) return 0;
		if(listaIngredientes.size() >=1 && listaIngredientes.size() <= 2) return 15;
		if(listaIngredientes.size() >=3 && listaIngredientes.size() <= 5) return 20;
		return 23;
	}
	
	public void imprimeIngredientes() {
		for(String string : listaIngredientes) {
			System.out.println(string);
		}
	}

}
