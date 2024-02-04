package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class Ciclo4Page {

    public static final Target OPERACION1_CICLO4 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'170+214*71-164-219*249*237+119=?')]");

    public static final Target OPERACION2_CICLO4 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'277+212-38*53+221+110-257*250')]");

    public static final Target ESCRIBIR_LETRA_INPUT_4 = Target.the("Numero de veces para escribir letra")
            .locatedBy("//p[contains(text(),'Escriba 372 veces la letra \"C\"')]");
}
