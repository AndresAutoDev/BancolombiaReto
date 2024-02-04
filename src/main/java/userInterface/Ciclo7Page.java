package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class Ciclo7Page {

    public static final Target OPERACION1_CICLO7 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'217-239+144-236*43*270=?')]");

    public static final Target OPERACION2_CICLO7 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'57*156-39+73*79-99*172-299*253')]");

    public static final Target ESCRIBIR_LETRA_INPUT_7 = Target.the("Numero de veces para escribir letra")
            .locatedBy("//p[contains(text(),'Escriba 191 veces la letra \"D\"')]");
}
