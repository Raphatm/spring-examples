/**
 * Autbank Projetos e Consultoria Ltda.
 * <br>
 * Criado em 10/09/2012 - 15:42:10
 * <br>
 * @version $Revision$ de $Date$<br>
 *           por $Author$<br>
 * @author luizricardo<br>
 */
package br.com.autbank.abutils.agendavisitas.models;


public enum TipoAcao {

	INCLUSAO("I", "Inclusão", "incluiu"), ALTERACAO("A", "Alteração", "alterou"), EXCLUSAO("E", "Exclusão", "excluiu");
	
	private String codigo;
	private String descricao;
	private String verbo;
	
	private TipoAcao(String codigo, String descricao, String verbo) {
		
		this.codigo = codigo;
		this.descricao = descricao;
		this.verbo = verbo;
		
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getVerbo() {
		return verbo;
	}
	
	public static TipoAcao getValue(String v) {
		
		TipoAcao[] acoes = values();
		for (int i = 0; i < acoes.length; i++) {
			
			if (acoes[i].getCodigo().equals(v)) {
				return acoes[i];
			}
			
		}
		return null;
		
	}
	
}