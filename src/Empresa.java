import java.util.ArrayList;
import java.util.HashMap;

public class Empresa {
	
	//--- Private Variables:
	private String nome_empresa;
	private HashMap<Integer,Funcionario> hashmap_funcionarios = new HashMap<Integer,Funcionario>();
	private HashMap<Integer, String> hashmap_projetos = new HashMap<Integer, String>();
	
	// Constructor
	public Empresa(String nome) {
		this.nome_empresa = nome;
	}

	public String getNomeEmpresa(){
		
		return nome_empresa;
		
	}
	
	public Funcionario AddFuncionario(Integer codigo, String nome) {
		
		Funcionario novo_funcionario = new Funcionario(nome);
		hashmap_funcionarios.put(codigo, novo_funcionario);
				
		return hashmap_funcionarios.get(codigo);
	
	}
	
	public String getFuncionarioByIndex(int codigo) {
			
			Funcionario funcionario = hashmap_funcionarios.get(codigo);
		
		return funcionario.getNomeFuncionario();

	}

	public Integer getNumeroFuncionarios() {
		
		return hashmap_funcionarios.size();
		
	}

	public String AddProjeto(Integer codigo, String nome) {
		
		hashmap_projetos.put(codigo, nome);
		
		return hashmap_projetos.get(codigo);
	}
	
	public String getProjetoByIndex(int i) {
		
		return hashmap_projetos.get(i);

	}

	public Integer getNumeroProjetos() {
		
		return hashmap_projetos.size();
		
	}
	

}
