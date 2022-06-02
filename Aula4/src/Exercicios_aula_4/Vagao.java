/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_aula_4;

public class Vagao 
{
	
	public String Nome;
	public Vagao anterior;
	public Vagao proximo;
	
	public Vagao(){
		String Nome = null;
		anterior = null;
		proximo = null;
	}
	
	public Vagao (String Nome) {
		this.Nome = Nome;
	}
	
	public void adicionarAfter(Vagao novoVagao) {
		novoVagao.proximo = this.proximo;
		novoVagao.anterior = this;
		
		this.proximo = novoVagao;
		novoVagao.proximo.anterior = novoVagao;
	}

	public void adicionarBefore(Vagao novoVagao) {
		novoVagao.proximo = this;
		novoVagao.anterior = this.anterior;
		
		this.anterior.proximo = novoVagao;
		this.anterior = novoVagao;
	}
	
	public void remove() {
		this.anterior.proximo = this.proximo;
		this.proximo.anterior = this.anterior;
	}
}
