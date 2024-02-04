package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class LoguinPage {
    public static final Target USER_INPUT = Target.the("Ingresar el usuario")
            .locatedBy("//input[(@name= 'username')]");

    public static final Target PASSWORD_INPUT = Target.the("Ingresar la contraseña")
            .locatedBy("//input[(@name= 'password')]");

    public static final Target GET_IN_BUTTON = Target.the("Boton de entrar")
            .locatedBy("//button[contains(text(),'Enviar')]");
}
