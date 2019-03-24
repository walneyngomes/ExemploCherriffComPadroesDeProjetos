
public  class Posicao {
	public Medalha criarMedalha(String posicao) {
		Medalha medalha = null;
		if ("1".equals(posicao)) {
			medalha = new MedalhaDePrata();
			medalha.tipo();

		} else if ("2".equals(posicao)) {
			medalha = new MedalhaOuro();
			medalha.tipo();

		}
		return medalha;
	}

}
