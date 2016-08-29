package Trabalhojava;

import javax.swing.ImageIcon;

public class DesenhoMovel extends Desenho implements movimento {
	
	private int velocidade;
	public DesenhoMovel(){
		
	}
	public DesenhoMovel(int x, int y, ImageIcon imagem) {
		super(x, y, imagem);
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void MoverCima(){
		this.setY(this.getY() - this.velocidade); 
	}
	public void MoverEsquerda(){
		this.setX(this.getX() - this.velocidade);
	}
	public void MoverBaixo(){
		this.setY(this.getY() + this.velocidade);
	}
	public void MoverDireita(){
		this.setX(this.getX() + velocidade);
	}
	

}
