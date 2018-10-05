

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestFuncionario {
	
	//--- Private variables:
	private Funcionario funcionario;
	private Integer codigo_projeto;
	private Integer codigo_ocorrencia;
	
	@Before
	public void configuraFuncionario() {
		
		String nome = "Guilherme";
		funcionario = new Funcionario(nome);
		funcionario.addVinculaProjeto(codigo_projeto = 1, "DIGICLAD");
		funcionario.addVinculaProjeto(codigo_projeto = 2, "ANECOM");
		
	}
	
	
	@Test
	public void testGetNomeFuncionario() {
		
		Funcionario funcionario_carlos = new Funcionario("Carlos");
		
		String nome_funcionario = funcionario_carlos.getNomeFuncionario();

		assertEquals("Carlos", nome_funcionario);
		
	}
	
	@Test
	public void testAddVinculaProjeto() {
		
		String nome = "Calorimetro";
		String nome_projeto = funcionario.addVinculaProjeto(codigo_projeto = 3, nome);
		
		assertEquals(nome, nome_projeto);
		
	}
	
	@Test
	public void testGetNumeroProjetosVinculados() {
		
		Integer qtde = 2;
		Integer numero_vinculos = funcionario.getNumeroProjetosVinculados();
		
		assertEquals(qtde, numero_vinculos);
		
	}
	
	
	@Test
	public void testDeletaVinculoProjeto() {
		
		funcionario.deletaVinculoProjeto(codigo_projeto = 2);
		
		Integer numero_projetos = funcionario.getNumeroProjetosVinculados();
		Integer qtde = 1;
		
		assertEquals(qtde, numero_projetos);

	}
	
	@Test
	public void testAddVinculaOcorrencia() {
		
		String nome_ocorrencia = "Arrumar codigo";
		Integer test_codigo_ocorrencia = funcionario.addVinculaOcorrencia(codigo_ocorrencia = 1, nome_ocorrencia);
		
		assertEquals(codigo_ocorrencia, test_codigo_ocorrencia);
		
	}
	
	
}
