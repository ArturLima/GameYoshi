package Trabalhojava;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Yoshi extends DesenhoMovel {
	
	 private JLabel lYoshi;
	 private int count = 0;
	
	public Yoshi() {
		this.setImagem(new ImageIcon(getClass().getResource("FrenteParado.png")));
		this.setX(120);
		System.out.println(getX() + ","  +getY());
		this.setY(250);
		this.setVelocidade(15);
		this.lYoshi = new JLabel();
		this.lYoshi.setIcon(this.getImagem());
		this.lYoshi.setBounds(this.getX(), this.getY(),60, 60);
	}

	public JLabel getlYoshi() {
		return lYoshi;
	}
	
	public void MoverCima(){
		if(this.getY()>=0){
			super.MoverCima();
		this.setImagem(new ImageIcon (getClass().getResource("yoshiFrente.gif")));
		this.lYoshi.setIcon(this.getImagem());
		lYoshi.setBounds(this.getX(), this.getY(), 60, 60);}
	}
	public void MoverBaixo(){
		if(this.getY()<= 250)
			super.MoverBaixo();
		this.setImagem(new ImageIcon (getClass().getResource("yoshiBaixo.gif")));
		this.lYoshi.setIcon(this.getImagem());
		lYoshi.setBounds(this.getX(), this.getY(), 60, 60);
		
	}
	
	public void MoverDireita(){
		if(this.getX() <= 250)
			super.MoverDireita();
		this.setImagem(new ImageIcon (getClass().getResource("yoshiDireita.gif")));
		this.lYoshi.setIcon(this.getImagem());
		lYoshi.setBounds(this.getX(), this.getY(), 60, 60);
		
	}
	
	public void MoverEsquerda(){
		if(this.getX() >= 0)
			super.MoverEsquerda();
		this.setImagem(new ImageIcon (getClass().getResource("yoshiEsquerda1.gif")));
		this.lYoshi.setIcon(this.getImagem());
		lYoshi.setBounds(this.getX(), this.getY(), 60, 60);
	}
	
	public void Parado(){
		this.setImagem(new ImageIcon(getClass().getResource("FrenteParado.png")));
		this.lYoshi.setIcon(this.getImagem());
	}
	
	public void pegou(Cogumelo c1, Cogumelo c2, Cogumelo c3 ){
		if(c1.getY()+33 > this.getY() && c1.getY() < this.getY()+60 && c1.getX()+29 > this.getX() && c1.getX() < this.getX() + 60){
			c1.setY(-30);
			count++;
		    System.out.println("yoshi:" + count);
		}
		if( c2.getY()+33 > this.getY() && c2.getY() < this.getY()+60 && c2.getX()+29 > this.getX() && c2.getX() < this.getX() + 60){
			c2.setY(-30);
			count++;
		    System.out.println("yoshi:" + count);
		}
		if (c3.getY()+33 > this.getY() && c3.getY() < this.getY()+60 && c3.getX()+29 > this.getX() && c3.getX() < this.getX() + 60){
			c3.setY(-30);
			count++;
		    System.out.println("yoshi:" + count);
		}
	}

		public boolean acabou(){
		if(count >= 5){
			return false;
		}
		return true;
	}
	
}

