package controller;

public class logsistema extends Thread {
	
	private int qtd;
	private int cod;
	private static int Ingressos = 100;
	private int confirm = 0;
	
	public logsistema(int qtd, int cod) {
		this.qtd = qtd;
		this.cod = cod;
	}
	
	@Override
	public void run() {
		log();
		if(confirm == 0) {
			comprar();
			validacao();
		}
	}
	private void log() {
		int log = (int)((Math.random()*1951)+50);
		try {
			sleep(log);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	private void comprar() {
		int buy = (int)((Math.random()*2000)+1000);
		try {
			sleep(buy);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		if(buy > 2500) {
			System.out.println(cod+"Excedente atingido "+buy+"ms");
			cod = -1;
		}
	}
	private void validacao() {
		if(Ingressos >= qtd) {
			Ingressos -= qtd;
			System.out.println(cod+"(compra efetuada) PARABENS "+-qtd+"ingressos");
			System.out.println("## apenas tem"+Ingressos+"ingressos");
		}else {
			System.out.println(cod+"(-compra nao efetuada)");
			System.out.println(cod+"(-espere o proximo lote)");
			
		}
	}
	
}