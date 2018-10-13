import java.util.HashMap;
import java.util.Map;

public class Funcionario implements InterfaceGerenciador{
	
	//--- Private Variables:
	private String nome_funcionario;
	private Integer codigo_funcionario;
	
	private Map<Integer,Projeto> hashmap_projetos_vinculados = new HashMap<Integer,Projeto>();
	private Map<Integer,Ocorrencia> hashmap_ocorrencias_vinculadas = new HashMap<Integer,Ocorrencia>();
	
	private Integer cont_ocorrencias = 0;
	private Integer max_ocorrencias_funcionarios = 10;
	
	//--- Constructor:
	public Funcionario(Integer codigo, String nome) {

		this.codigo_funcionario = codigo;
		this.nome_funcionario = nome;
		
	}

	public String getNomeFuncionario() {
		
		return nome_funcionario;
	}
	
	public Integer getCodigoFuncionario() {
	
		return codigo_funcionario;
	}

	public Projeto addVinculaProjeto(Projeto projeto) {
		
		hashmap_projetos_vinculados.put(projeto.getCodigoProjeto(), projeto);
		
		return hashmap_projetos_vinculados.get(projeto.getCodigoProjeto());
	}

	public Integer getNumeroProjetosVinculados() {
		
		return hashmap_projetos_vinculados.size();
	}

	public Projeto deletaVinculoProjeto(Projeto projeto) {
		
		//Testa para saber se o projeto vinculado existe neste funcionario
		if( hashmap_projetos_vinculados.containsValue(projeto) ) {
			hashmap_projetos_vinculados.remove(projeto.getCodigoProjeto(), projeto);
			return projeto;
		}
		else{ return null; }
		
	}

	public Ocorrencia addVinculaOcorrencia(Ocorrencia ocorrencia) throws Exception {
		
		conta_ocorrencias(+1);
		hashmap_ocorrencias_vinculadas.put(ocorrencia.getCodigoOcorrencia(), ocorrencia);
		
		return ocorrencia;
	}

	private void conta_ocorrencias(Integer i) throws Exception {
		
		if ( (cont_ocorrencias + i) < max_ocorrencias_funcionarios ) {
			cont_ocorrencias += i;
		}
		
		else {
			throw new Exception();
		}
		
	}

	public Integer getNumeroOcorrenciasVinculadas() {
		
		return hashmap_ocorrencias_vinculadas.size();
	}

	public Ocorrencia deletaVinculoOcorrencia(Ocorrencia ocorrencia) {
		
		//Testa para saber se a ocorrencia vinculada existe neste funcionario
		if( hashmap_ocorrencias_vinculadas.containsValue(ocorrencia) ) {
			hashmap_ocorrencias_vinculadas.remove(ocorrencia.getCodigoOcorrencia(), ocorrencia);
			return ocorrencia;
		}
		else{ return null; }		
		
		
	}

}
