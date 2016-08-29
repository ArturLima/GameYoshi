package Trabalhojava;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Fundo extends Desenho {
	private JLabel fundo;
	private ArrayList<Cogumelo> Cogumelos = new ArrayList<Cogumelo>();
	
	public Fundo(){
		this.setImagem(new ImageIcon(getClass().getResource("Fundo2.png")));
		fundo = new JLabel(this.getImagem());
		fundo.setBounds(0, 0, 600, 385);
	}

	public JLabel getFundo() {
		return fundo;
	}
	
	public void AddCogumelo(Cogumelo c1) throws CogumeloRepetidoException{
		for(int i=0; i<Cogumelos.size(); i++){
			if(Cogumelos.get(i).equals(c1)){
				throw new CogumeloRepetidoException(c1);
			}else{
				Cogumelos.add(c1);
			}
		}
	}
}
