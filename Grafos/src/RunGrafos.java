import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RunGrafos {

	public static void main(String[] args) throws IOException {

		FuncoesExtras of = new FuncoesExtras();

		BufferedReader br = new BufferedReader(new FileReader("Exemplo.txt"));
		
		String linha = null;
		of.analisarEntradaPrimeiraLinha(br.readLine());
		while( (linha = br.readLine()) != null)
			of.addAOGrafo(linha);
		br.close();

		of.ExecFunc();

	}

}
