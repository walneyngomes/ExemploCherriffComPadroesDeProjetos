
public class FabricarArma {

	public Arma criarArma(String tipo) {
		Arma produto = null;
		if ("Pistola".equals(tipo)) {
			produto = new Pistola();
			produto.numeroDeBalas();
			produto.pesoDaArma();
			produto.embalar();
		} else if ("revolver22".equals(tipo)) {
			produto = new Revolver22();
			produto.numeroDeBalas();
			produto.pesoDaArma();
			produto.embalar();

		}
		return produto;
	}

}
