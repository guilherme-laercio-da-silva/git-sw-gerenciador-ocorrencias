import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Empresa {
	
	//--- Private Variables:
	private String nome_empresa;
	private Map<Integer, Funcionario> hashmap_funcionarios = new HashMap<Integer,Funcionario>();
	private Map<Integer, Projeto> hashmap_projetos = new HashMap<Integer, Projeto>();
	
	//--- Constructor:
	public Empresa(String nome) {
		this.nome_empresa = nome;
	}
	
	public String getNomeEmpresa(){
		
		return nome_empresa;
		
	}
	
	public Funcionario AddFuncionario(Funcionario funcionario) {
		
		hashmap_funcionarios.put(funcionario.getCodigoFuncionario(), funcionario);
				
		return funcionario;
	
	}
	
	public Funcionario getFuncionarioProcurado(Integer codigo_funcionario) {
			
		//Testa para saber se o funcionario existe nesta empresa
		if( hashmap_funcionarios.containsKey(codigo_funcionario)) {
			return hashmap_funcionarios.get(codigo_funcionario);
		}
				
		else{ return null; }

	}

	public Integer getNumeroFuncionarios() {
		
		return hashmap_funcionarios.size();
		
	}

	public Projeto AddProjeto(Projeto projeto) {
		
		hashmap_projetos.put(projeto.getCodigoProjeto(), projeto);
		
		return projeto;
	}
	
	public Projeto getProjetoProcurado(Integer codigo_projeto) {
		//Testa para saber se o funcionario existe nesta empresa
		if( hashmap_projetos.containsKey(codigo_projeto) ) {
			return hashmap_projetos.get(codigo_projeto);
		}
						
		else{ return null; }

	}

	public Integer getNumeroProjetos() {
		
		return hashmap_projetos.size();
		
	}
	

}
