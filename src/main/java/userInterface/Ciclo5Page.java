package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class Ciclo5Page {

    public static final Target OPERACION1_CICLO5 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'99-57*194-27+218+91=?')]");

    public static final Target OPERACION2_CICLO5 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'106*256*216+153*32*165+68+128')]");

    public static final Target ESCRIBIR_LETRA_INPUT_5 = Target.the("Numero de veces para escribir letra")
            .locatedBy("//p[contains(text(),'Escriba 418 veces la letra \"A\"')]");
}
