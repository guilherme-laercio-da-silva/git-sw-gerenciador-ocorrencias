import java.util.ArrayList;
import java.util.HashMap;

public class Funcionario {
	
	//--- Private Variables:
	private String nome_funcionario;
	private HashMap<Integer,String> hashmap_projetos_vinculados = new HashMap<Integer,String>();
	
	// Constructor
	public Funcionario(String nome) {

		this.nome_funcionario = nome;
		
	}

	public String getNomeFuncionario() {
		
		return nome_funcionario;
	}

	public String addVinculaProjeto(Integer codigo_projeto, String nome) {
		
		hashmap_projetos_vinculados.put(codigo_projeto, nome);
		
		return hashmap_projetos_vinculados.get(codigo_projeto);
	}

	public Integer getNumeroProjetosVinculados() {
		
		return hashmap_projetos_vinculados.size();
	}

	public void deletaVinculoProjeto(Integer codigo_projeto) {
		
		hashmap_projetos_vinculados.remove(codigo_projeto);
		
	}

	public Integer addVinculaOcorrencia(Integer integer, String nome_ocorrencia) {
		
		return 1;
	}	
	
	

}
