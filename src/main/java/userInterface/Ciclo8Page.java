package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class Ciclo8Page {

    public static final Target OPERACION1_CICLO8 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'218-134+169*72+153+81*254*50+82=?')]");

    public static final Target OPERACION2_CICLO8 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'100-279-297-22*163-109')]");

    public static final Target ESCRIBIR_LETRA_INPUT_8 = Target.the("Numero de veces para escribir letra")
            .locatedBy("//p[contains(text(),'Escriba 454 veces la letra \"M\"')]");
}
