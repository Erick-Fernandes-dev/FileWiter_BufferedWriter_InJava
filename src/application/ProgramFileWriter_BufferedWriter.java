package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ProgramFileWriter_BufferedWriter {
	
	public static void main(String[] args) {
		
		String[] names = new String[] {
				"Erick",
				"Jose",
				"Maria"
		};
		
		String path = "C:\\testArquive\\testeNomes.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			
			for (String name : names) {
				bw.write(name);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String lines = br.readLine();
			
			while (lines != null) {
				System.out.println(lines);
				lines = br.readLine();
				
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
