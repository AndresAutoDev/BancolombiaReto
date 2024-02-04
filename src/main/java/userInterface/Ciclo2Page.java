package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class Ciclo2Page {

    public static final Target OPERACION1_CICLO2 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'199-103-159+221+273+230+74+259=?')]");

    public static final Target OPERACION2_CICLO2 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'283*196-95+21-21-63*46')]");

    public static final Target ESCRIBIR_LETRA_INPUT_2 = Target.the("Numero de veces para escribir letra")
            .locatedBy("//p[contains(text(),'Escriba 415 veces la letra \"n\"')]");
}
