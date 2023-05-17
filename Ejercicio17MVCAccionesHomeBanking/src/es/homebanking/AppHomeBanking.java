package es.homebanking;

import es.homebanking.controller.HomeBankingController;
import es.homebanking.model.HomeBankingModel;
import es.homebanking.view.VentanaPrincipal;

public class AppHomeBanking {
	public static void main(String[] args) {
		HomeBankingModel model = new HomeBankingModel();
		VentanaPrincipal view = new VentanaPrincipal();
		HomeBankingController controller = new HomeBankingController(model, view);

	}
}
