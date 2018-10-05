import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TestEmpresa {

	//--- Private variables
	private Empresa empresa_CIA;
	
	@Before
	public void configurarEmpresa() {
		
		String nome_empresa = "CIA";
		empresa_CIA = new Empresa(nome_empresa);
		
	}
	
	@Test
	public void testCriaEmpresa() {
		
		Empresa empresa_NOVO = new Empresa("NOVO");
		String nome_empresa = empresa_NOVO.getNomeEmpresa();
		
		assertEquals("NOVO", nome_empresa);

	}
	
	@Test
	public void testAddFuncionario() {
		
		String nome = "Guilherme";
		Integer codigo_guilherme = 1;
		Funcionario funcionario_guilherme = empresa_CIA.AddFuncionario(codigo_guilherme, nome);
		
		assertEquals(nome, funcionario_guilherme.getNomeFuncionario());

	}
	
	@Test
	public void testGetFuncionario() {
		
		String nome = "Guilherme";
		Integer codigo_guilherme = 1;
		empresa_CIA.AddFuncionario(codigo_guilherme, nome);
		
		String funcionario_guilherme = empresa_CIA.getFuncionarioByIndex(codigo_guilherme);
		
		assertEquals(nome, funcionario_guilherme);

	}
	
	@Test
	public void testGetNumeroFuncionarios() {
		
		Integer codigo;
		empresa_CIA.AddFuncionario(codigo = 1, "Guilherme");
		empresa_CIA.AddFuncionario(codigo = 2, "Lucas");
		empresa_CIA.AddFuncionario(codigo = 3, "Carlos");
		Integer qtde = 3;
		
		Integer numero_funcionarios = empresa_CIA.getNumeroFuncionarios();
		
		assertEquals(qtde, numero_funcionarios);

	}
	
	@Test
	public void testAddProjeto() {
		
		String nome = "Sistema de Ocorrência";
		Integer codigo_projeto = 1;
		String projeto_ocorrencia = empresa_CIA.AddProjeto(codigo_projeto, nome);
		
		assertEquals(nome, projeto_ocorrencia);

	}
	
	@Test
	public void testGetProjeto() {
		
		String nome = "Sistema de Ocorrência";
		Integer codigo_projeto = 1;
		empresa_CIA.AddProjeto(codigo_projeto, nome);
		
		String projeto_ocorrencia = empresa_CIA.getProjetoByIndex(codigo_projeto);
		
		assertEquals(nome, projeto_ocorrencia);

	}
	
	@Test
	public void testGetNumeroProjetos() {
		
		Integer codigo_projeto;
		empresa_CIA.AddProjeto(codigo_projeto = 1, "Sistema de Ocorrência");
		empresa_CIA.AddProjeto(codigo_projeto = 2, "DIGICLAD");
		empresa_CIA.AddProjeto(codigo_projeto = 3, "ANECOM");
		
		Integer qtde = 3;
		Integer numero_projetos = empresa_CIA.getNumeroProjetos();
		
		assertEquals(qtde, numero_projetos);

	}
	
}
