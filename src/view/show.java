package view;
import controller.logsistema; 

public class show {

	public static void main(String[] args) {
		for(int i  = 1; i<= 300;i++) {
			int qtd = (int)((Math.random()*4)+1);
			 logsistema sistem = new  logsistema(qtd,i);
			 sistem.start();
		}
	}

}