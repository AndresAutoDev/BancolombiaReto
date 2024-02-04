package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class Ciclo3Page {

    public static final Target OPERACION1_CICLO3 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'103-23*254-245*81+295=?')]");


    public static final Target OPERACION2_CICLO3 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'109-78-126*200-247+76*260*225')]");

    public static final Target ESCRIBIR_LETRA_INPUT_3 = Target.the("Numero de veces para escribir letra")
            .locatedBy("//p[contains(text(),'Escriba 82 veces la letra \"U\"')]");
}
