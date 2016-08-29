package Trabalhojava;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ricardo extends DesenhoMovel implements Runnable {
	 private JLabel lRicardo;
	 private int count = 0;
	public Ricardo(){
		
	this.setImagem(new ImageIcon(getClass().getResource("Ricardo.png")));
	this.setX(400);
	System.out.println(getX() + ","  +getY());
	this.setY(250);
	this.setVelocidade(30);
	this.lRicardo = new JLabel();
	this.lRicardo.setIcon(this.getImagem());
	this.lRicardo.setBounds(this.getX(), this.getY(),60, 45);
	}
	public JLabel lRicardo() {
		return lRicardo;
	}
	
	
	public void run() {
		
		while(true) {
		try{
			Thread.sleep(300);
		}catch(Exception e){
			
		}
		if(this.getX() > 260){
			this.MoverEsquerda();
			this.lRicardo.setBounds(getX(), getY(), 60, 45);
		}
		
		
		while(getX() < 260){
			
			this.setX(550); 
			this.lRicardo.setBounds(this.getX(), this.getY(), 60, 45);
		}
	}
	
 }

	
	public void pegou(Cogumelo c4, Cogumelo c5, Cogumelo c6 ){
		if(c4.getY()+33 > this.getY() && c4.getY() < this.getY()+60 && c4.getX()+29 > this.getX() && c4.getX() < this.getX() + 60){
			c4.setY(-30);
			count++;
			System.out.println("ricardo:  " + count);
		}
		if( c5.getY()+33 > this.getY() && c5.getY() < this.getY()+60 && c5.getX()+29 > this.getX() && c5.getX() < this.getX() + 60){
			c5.setY(-30);
			count++;
			System.out.println("ricardo:  " + count);
		}
		if (c6.getY()+33 > this.getY() && c6.getY() < this.getY()+60 && c6.getX()+29 > this.getX() && c6.getX() < this.getX() + 60){
			c6.setY(-30);
			count++;
			System.out.println("ricardo:  " + count);
		}
	}
	public boolean acabou(){
		if(count >= 5){
			return false;
			
		}
		
		return true;
	}
}	