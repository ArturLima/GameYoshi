package Trabalhojava;

import javax.swing.ImageIcon;

public class Desenho{
	private int x;
	private int y;
	private ImageIcon imagem;
	
	public Desenho(){
		
	}
	
	public Desenho(int x, int y, ImageIcon imagem){
		this.setImagem(imagem);
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ImageIcon getImagem() {
		return imagem;
	}

	public void setImagem(ImageIcon imagem) {
		this.imagem = imagem;
	}
	
}
