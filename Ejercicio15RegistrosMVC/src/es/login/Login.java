package es.login;

import es.login.controller.ControllerLogin;
import es.login.view.ViewLogin;

public class Login {

	public static void main(String[] args) {
		ViewLogin viewLogin = new ViewLogin();
		ControllerLogin controller = new ControllerLogin(viewLogin);
		controller.loginUsuarios();

	}

}
