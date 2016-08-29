package Trabalhojava;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Cogumelo extends DesenhoMovel {
	private JLabel Cogumelo;

	private static int count = 0;
	
	
	public Cogumelo(int x, int y){
		this.setImagem(new  ImageIcon(getClass().getResource("cogumelo.png")));
		this.setX(x);
		this.setY(y);
		this.setVelocidade(5);
		this.Cogumelo = new JLabel();
		this.Cogumelo.setIcon(this.getImagem());
		this.Cogumelo.setBounds(this.getX(), this.getY(),29 , 33);
	}
	


	public JLabel getCogumelo() {
		return Cogumelo;
	}
	/*public boolean acabou(){
		if(count >= 3){
			return false;
		}
		
		return true;
	}*/
	public void MoverBaixo(){
		this.Cogumelo.setBounds(getX(), getY(), 29, 33);
		super.MoverBaixo();
		if(getY() >= 320){
			this.setY(-30);
			//count++;
			//System.out.println(count);
		}
		
		
		
	}
	
}
