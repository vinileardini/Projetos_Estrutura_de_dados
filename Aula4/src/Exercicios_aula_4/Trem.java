
package Exercicios_aula_4;

public class Trem 
{

        private Vagao vagao_inicio;
	private Vagao vagao_final;
	private int quantidade;
	
	public Trem() 
        {
		vagao_inicio = new Vagao();
		vagao_final = new Vagao();
		
		vagao_inicio.proximo = vagao_final;
		vagao_final.anterior = vagao_inicio;
                
	}
	
	public Vagao encontrar(String Nome) 
        {
		Vagao before = vagao_inicio;
		
		while(!before.proximo.Nome.equals(Nome) && before.proximo != vagao_final) {
			before = before.proximo;
		}
		
		if(before.proximo.Nome.equals(Nome)) 
                {
			return before.proximo;
		}
		
		return null;
	}
	
	public void adicionarNaFrente(String Nome) 
        {
		adicionarDepois(vagao_inicio, Nome);
	}
	
	public void adicionarNoFinal(String Nome) 
        {
		adicionarAntes(vagao_final, Nome);
	}
	
	public void adicionarAfter(String ref, String Nome) 
        {
		Vagao novoVagao = new Vagao(Nome);
		
		Vagao vagaoReferencia = this.encontrar(ref);
		if(vagaoReferencia != null) {
			vagaoReferencia.adicionarAfter(novoVagao);
			quantidade++;
		}
	}
	
	public void adicionarDepois(Vagao vagaoReferencia, String Nome) 
        {
		Vagao novoVagao = new Vagao(Nome);
		
		if(vagaoReferencia != null) {
			vagaoReferencia.adicionarAfter(novoVagao);
			quantidade++;
		}
	}
	
	public void adicionarAntes(Vagao vagaoReferencia, String Nome) 
        {
		Vagao novoVagao = new Vagao(Nome);
		
		if(vagaoReferencia != null) {
			vagaoReferencia.adicionarBefore(novoVagao);
			quantidade++;
		}
	}
	
	public void remover(String Nome) 
        {
		Vagao x = this.encontrar(Nome);
		
		if(x != null) {
			x.remove();
			quantidade--;
		}
	}
	
	public boolean ehVazia() 
        {
		return quantidade == 0;
	}
	
	public int quantidade() 
        {
		return quantidade;
	}
	
	public void printar() 
        {
		System.out.print("Vagões: ");
		
		if(this.ehVazia()) {
			System.out.print("Vazia");
		}
		
		for(Vagao atual = vagao_inicio.proximo; atual != vagao_final; atual = atual.proximo) {
			System.out.printf("%s ", atual.Nome);
		}
		System.out.printf("\n");
	}
	
}



