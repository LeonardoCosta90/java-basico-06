package br.fai.projeto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main app = new Main();
		app.start();

	}

	private void start() {
		// TODO Auto-generated method stub
		
		String[] carros = {"civic","gol","palio","uno"};
		
		for (String carro : carros) {
			System.out.println("Carro: " + carro);
		}
		
		System.out.println("----------");
		
	}

}
