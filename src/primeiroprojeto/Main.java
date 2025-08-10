package primeiroprojeto;

import java.io.IOException;
import java.util.ArrayList;

import controller.Arquivo;
import model.Usuario;

public class Main {

	public static void main(String[] args) throws IOException {
		// usuario (nome, idade, sexo)
		
		Usuario obj1 = new Usuario("Naiara", 30, 'F');
		Usuario obj2 = new Usuario("Mehreen", 30, 'F');
	    Usuario obj3 = new Usuario("Lucas", 31, 'M');
	    Usuario obj4 = new Usuario("Vitor", 29, 'M');
	    Usuario obj5 = new Usuario("Desirée", 31, 'F');
	    
	    Arquivo arquivo = new Arquivo();
	    arquivo.salvar(obj1, false);
	    arquivo.salvar(obj2, true);
	    arquivo.salvar(obj3, true);
	    arquivo.salvar(obj4, true);
	    arquivo.salvar(obj5, true);
	    
	    
	    System.out.println("----------");
	    ArrayList<String> linhas = arquivo.lerDadosDoArquivo();
	    
	    obj1.setNome(linhas.get(0).split(",")[0]+" Cristina Cardoso Ribeiro");
	    obj1.setIdade(Integer.parseInt(linhas.get(0).split(",")[1]));
	    obj1.setSexo(linhas.get(0).split(",")[0].charAt(0));
	    
	    arquivo.salvar(obj1, false);
	    arquivo.salvar(obj2, true);
	    arquivo.salvar(obj3, true);
	    arquivo.salvar(obj4, true);
	    arquivo.salvar(obj5, true);
	    
	    
	    
	 
	    	
	    }
	    
	    
	    
	
		

}
