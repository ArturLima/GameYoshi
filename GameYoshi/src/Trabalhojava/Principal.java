package Trabalhojava;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;

public class Principal extends JFrame{
	
	public Principal(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600,385);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setLayout(null);
		this.setResizable(false);
	}
	public static void main(String[] args) {
		Yoshi yoshi = new Yoshi();
		Ricardo ricardo = new Ricardo();
		Fundo fundo = new Fundo();
		
		
		Cogumelo cogumelo1 = new Cogumelo(130, -30);
		cogumelo1.setVelocidade(3);
		Cogumelo cogumelo2 = new Cogumelo(45, -30);
		cogumelo2.setVelocidade(2);
		Cogumelo cogumelo3 = new Cogumelo(220, -30);
		cogumelo3.setVelocidade(1);
		
		Cogumelo cogumelo4 = new Cogumelo(300, -30);
		cogumelo4.setVelocidade(1);
		Cogumelo cogumelo5 = new Cogumelo(400, -30);
		cogumelo5.setVelocidade(2);
		Cogumelo cogumelo6 = new Cogumelo(500, -30);
		cogumelo6.setVelocidade(3);
		
		try {
			fundo.AddCogumelo(cogumelo1);
			fundo.AddCogumelo(cogumelo2);
			fundo.AddCogumelo(cogumelo3);
			fundo.AddCogumelo(cogumelo4);
			fundo.AddCogumelo(cogumelo5);
			fundo.AddCogumelo(cogumelo6);
			
		} catch (CogumeloRepetidoException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
			
		
		
		Principal janela = new Principal();
		
		
		janela.add(yoshi.getlYoshi());
		janela.add(ricardo.lRicardo());
		janela.add(cogumelo1.getCogumelo());
		janela.add(cogumelo2.getCogumelo());
		janela.add(cogumelo3.getCogumelo());
		janela.add(cogumelo4.getCogumelo());
		janela.add(cogumelo5.getCogumelo());
		janela.add(cogumelo6.getCogumelo());
		janela.add(fundo.getFundo());
		janela.addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode()==38){
					yoshi.MoverCima();
				}
				if(e.getKeyCode()==40){
					yoshi.MoverBaixo();
				}
				if(e.getKeyCode()==37){
					yoshi.MoverEsquerda();
				}
				if(e.getKeyCode()==39){
					yoshi.MoverDireita();
				}
			}
			public void keyReleased(KeyEvent arg0){
				yoshi.Parado();
			}
			public void keyTyped(KeyEvent arg0){}
		});
		
		Thread  t = new Thread(ricardo);
		t.start();
		while(ricardo.acabou() && yoshi.acabou()){
			cogumelo1.MoverBaixo();
			cogumelo2.MoverBaixo();
			cogumelo3.MoverBaixo();
			cogumelo4.MoverBaixo();
			cogumelo5.MoverBaixo();
			cogumelo6.MoverBaixo();
			yoshi.pegou(cogumelo1, cogumelo2, cogumelo3);
			ricardo.pegou(cogumelo4, cogumelo5, cogumelo6);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e2) {
				
			}
		}
		File file = new File("C:\\Users\\1510068\\Desktop\\Yoshi.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream ois = new  ObjectOutputStream(fos);
			ois.writeObject(ricardo.acabou());
			ois.writeObject(yoshi.acabou());
			
			ois.close();
			fos.close();
			
		} catch (IOException e1) {
		}
		
		
		
	}

}
