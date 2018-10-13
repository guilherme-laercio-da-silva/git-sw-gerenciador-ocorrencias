import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Projeto implements InterfaceGerenciador {

	//--- Private Variables:
	private Map<Integer,Ocorrencia> hashmap_ocorrencia = new HashMap<Integer,Ocorrencia>();
	private Map<Integer, Funcionario> hashmap_funcionarios = new HashMap<Integer,Funcionario>();
	private Integer codigo_projeto;
	private String nome_projeto;
	
	//--- Constructor:
	public Projeto(Integer codigo, String nome, Funcionario funcionario) {
		
		this.codigo_projeto = codigo;
		this.nome_projeto = nome;
		vinculaFuncionario(funcionario);
		
	}

	public Integer getCodigoProjeto() {

		return codigo_projeto;
	}

	public String getNomeProjeto() {

		return nome_projeto;
	}

	public Funcionario vinculaFuncionario(Funcionario funcionario) {
		
		hashmap_funcionarios.put(funcionario.getCodigoFuncionario(), funcionario);
		funcionario.addVinculaProjeto(Projeto.this);
		
		return funcionario;
		
	}

	public Integer getNumeroFuncionarios() {

		return hashmap_funcionarios.size();
	}

	public Funcionario deletaFuncionarioVinculado(Funcionario funcionario) {
		
		//Testa para saber se o funcionario vinculado existe neste projeto
		if( hashmap_funcionarios.containsValue(funcionario) ) {
			hashmap_funcionarios.remove(funcionario);
			funcionario.deletaVinculoProjeto(Projeto.this);
			return funcionario;
		}
		
		else{ return null; }
		
	}

	//--- Ocorrencias:
		public Ocorrencia criaOcorrencia(Ocorrencia ocorrencia) {
			
			//Testa se a ocorrencia é deste projeto
				Projeto aux_projeto = ocorrencia.getProjetoVinculado();
			if( aux_projeto.codigo_projeto == codigo_projeto) {
				
				hashmap_ocorrencia.put(ocorrencia.getCodigoOcorrencia(), ocorrencia);
				return ocorrencia;
			}
			
			else{ return null; }
			
		}
	
		public Integer getNumeroOcorrencias() {
			return hashmap_ocorrencia.size();
		}
	
		public Ocorrencia atualizaEstadoOcorrencia(Ocorrencia ocorrencia, Estado estado) {
			
			Ocorrencia old_ocorrencia = ocorrencia;
			
			//Testa se a ocorrencia existe
			if( hashmap_ocorrencia.containsKey(ocorrencia.getCodigoOcorrencia()) ) {
				ocorrencia.setEstadoOcorrencia(estado);
				hashmap_ocorrencia.replace(old_ocorrencia.getCodigoOcorrencia(), ocorrencia);
				return ocorrencia;
			}
			
			else{ return null; }
			
		}
	
		public Ocorrencia atualizaFuncionarioOcorrencia(Ocorrencia ocorrencia, Funcionario funcionario) {
			
			Ocorrencia old_ocorrencia = ocorrencia;
			
			//Testa se a ocorrencia existe
			if( (hashmap_ocorrencia.containsKey(ocorrencia.getCodigoOcorrencia()) == true) && (ocorrencia.getEstadoOcorrencia() == Estado.ABERTA) ) {
				ocorrencia.setFuncionatioResponsavel(funcionario);
				hashmap_ocorrencia.replace(old_ocorrencia.getCodigoOcorrencia(), ocorrencia);
				return ocorrencia;
			}
			
			else{ return null; }
		}

}
