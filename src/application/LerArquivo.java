package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoFile;

public class LerArquivo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Caminho arquivo");
		String path = sc.nextLine();
		File pathDest = new File(path);		
		String fileDest = pathDest.getParent() + "\\summary.txt";		
		List<ProdutoFile> listProd = new ArrayList<>();
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			
			
			String line = br.readLine();
			
			while (line != null) {
				
				String campos[] = new String[3];
				campos = line.split(",");
				
				String nome = campos[0];
				double valor = Double.parseDouble(campos[1]);
				int qty = Integer.parseInt(campos[2]);
				listProd.add(new ProdutoFile(nome, valor, qty));			
				
				line = br.readLine();
			}
			
			
			
			br.close();		
			
			
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileDest, true))){
			
			
			for(ProdutoFile list : listProd) {
				
				String newLine = list.getNome() + ","+ list.getValor()*list.getQty();				
				bw.write(newLine);
				bw.newLine();
				
				}
			
			bw.close();
			
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		
		
		
		sc.close();
		

	}

}
