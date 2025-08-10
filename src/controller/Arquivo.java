package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import model.Usuario;

public class Arquivo {

	public Arquivo() {
		
	}
	public void salvar(Usuario usuario, boolean opcao) throws IOException {
		OutputStream os = new FileOutputStream("cadastro.txt", opcao);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		//texto
		String texto = usuario.getNome()+","+usuario.getIdade()+","+usuario.getSexo()+".";
		bw.append(texto);
		bw.newLine();
		
		bw.close();
		osw.close();
		os.close();
		
		System.out.println("Usuario: "+usuario.getNome()+" foi cadastrado com Sucesso!");
		
	}
	
	public ArrayList<String> lerDadosDoArquivo() throws IOException {
		ArrayList<String> linhas = new ArrayList<String>();
		
		InputStream is = new FileInputStream("cadastro.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		while(linha != null) {
			System.out.println(linha);
			linhas.add(linha);
			linha = br.readLine();
		
		}
		
		br.close();
		isr.close();
		is.close();
		
		System.out.println("A leitura do arquivo foi concluída com sucesso!");
		return linhas;
		
		
	}
}
