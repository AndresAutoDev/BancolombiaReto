package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class Ciclo9Page {

    public static final Target OPERACION1_CICLO9 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'274+170*42+137+276-259-295-145+171=?')]");

    public static final Target OPERACION2_CICLO9 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'166*223*80+243-43*87')]");

    public static final Target ESCRIBIR_LETRA_INPUT_9 = Target.the("Numero de veces para escribir letra")
            .locatedBy("//p[contains(text(),'Escriba 370 veces la letra \"r\"')]");
}
