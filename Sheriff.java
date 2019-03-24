import java.util.ArrayList;

public class Sheriff extends Pessoa {
	ArrayList<Arma> armarioDeArmas = new ArrayList();
	private Medalha medalhaSherife = null;
	private static Sheriff sheriff;
	private String posicao;

	private Sheriff(String cpf) {
		this.setCpf(cpf);

	}

	public static Sheriff intanceSheriff(String cpf) {
		if (sheriff == null) {
			sheriff = new Sheriff(cpf);
			sheriff.comprarArmaDoTipo("pistola");
		}
		return sheriff;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
		addPosicao( posicao);
		
		
	}
	public void comprarArmaDoTipo(String arma){
		
		armarioDeArmas.add(fabricarArma(arma));
		
	}
	private Arma fabricarArma(String tipo){
		FabricarArma arma= new FabricarArma();
		return arma.criarArma(tipo);
		
	}
	private void addPosicao(String tipo){
		Posicao posicao= new Posicao();
		this.medalhaSherife= posicao.criarMedalha(tipo);

	}

}
