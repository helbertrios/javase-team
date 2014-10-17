package github.com.helbertrios.demo.javase.cast;

import java.util.Date;

public class SimplesCast {

	public static void main(String[] args) {
		Pessoa pessoa = getPessoa(1L);
		System.out.println(pessoa.getNome());

	}

	public static void testa(Pessoa pessoa ) {
		PessoaFisica pessoaFisica = null;
		PessoaJuridica pessoaJuridica = null;
		if (pessoa instanceof  PessoaFisica)  {
			pessoaFisica = (PessoaFisica) pessoa;
		}
				
		if (pessoa instanceof  PessoaJuridica)  {
			pessoaJuridica =  (PessoaJuridica) pessoa;
		}
		
		System.out.println(pessoa.getNome());
		
		if ( pessoaFisica != null ){
			System.out.println(pessoaFisica.getDataNascimento());
		}

		
		if ( pessoaJuridica != null ){
			System.out.println(pessoaJuridica.getDataFundacao());
		}
		
	}
	
	public static Pessoa getPessoa(Long id) {
		if (new Long(2).equals(id)) {
			PessoaJuridica pessoaJuridica = new PessoaJuridica();
			pessoaJuridica.setId(2L);
			pessoaJuridica.setNome("Digital conexao");
			pessoaJuridica.setDataFundacao(new Date());
			return pessoaJuridica;
		}
		if (new Long(1).equals(id)) {
			PessoaFisica pessoaFisica = new PessoaFisica();
			pessoaFisica.setId(1L);
			pessoaFisica.setNome("Helbert Vieira Rios");
			pessoaFisica.setDataNascimento(new Date());
			return pessoaFisica;
		}
		return null;

	}
}

class Pessoa {

	private Long id;
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

class PessoaFisica extends Pessoa {
	private Date dataNascimento;

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}

class PessoaJuridica extends Pessoa {
	private Date dataFundacao;

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

}