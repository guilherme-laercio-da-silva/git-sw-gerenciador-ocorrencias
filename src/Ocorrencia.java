
public class Ocorrencia implements InterfaceGerenciador{
	
	//--- Private Variables:
	private Integer codigo_ocorrencia;
	private String nome_ocorrencia;

	private Projeto projeto_vinculado;
	private Funcionario funcionario_responsavel;

	private Estado estado_ocorrencia;
	private Prioridade prioridade_ocorrencia;
	private Tipo tipo_ocorrencia;
	
	//--- Constructor:
	public Ocorrencia(Integer codigo, String nome, Funcionario funcionario, Projeto projeto,
						Estado estado, Prioridade prioridade, Tipo tipo) {
		
		this.codigo_ocorrencia = codigo;
		this.nome_ocorrencia = nome;
		this.projeto_vinculado = projeto;
		this.tipo_ocorrencia = tipo;
		
		setFuncionatioResponsavel(funcionario);
		setEstadoOcorrencia(estado);
		setPrioridadeOcorrencia(prioridade);

	}
	//--- Métodos set (modificaveis: estado, funcionario responsavel, prioridade):
		public void setEstadoOcorrencia(Estado estado) {
			this.estado_ocorrencia = estado;		
		}
		
		public void setFuncionatioResponsavel(Funcionario funcionario) {
			this.funcionario_responsavel = funcionario;
		}
		
		public void setPrioridadeOcorrencia(Prioridade prioridade) {
			this.prioridade_ocorrencia = prioridade;
		}
	
	//--- Métodos get:	
		public Integer getCodigoOcorrencia() {
			return codigo_ocorrencia;
		}
		
		public String getNomeOcorrencia() {
			return nome_ocorrencia;
		} 
		
		public Funcionario getFuncionarioResponsavel() {
			return funcionario_responsavel;
		}
	
		public Projeto getProjetoVinculado() {
			return projeto_vinculado;
			
		}
	
		public Estado getEstadoOcorrencia() {
			return estado_ocorrencia;
		}
	
		public Prioridade getPrioridadeOcorrencia() {
			return prioridade_ocorrencia;
		}
	
		public Tipo getTipoOcorrencia() {
			return tipo_ocorrencia;
		}
		
}
