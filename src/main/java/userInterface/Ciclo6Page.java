package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class Ciclo6Page {

    public static final Target OPERACION1_CICLO6 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'209*119+189*275*124-138+283-74*132=?')]");

    public static final Target OPERACION2_CICLO6 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'162+209-30-179*68*57+31-287')]");

    public static final Target ESCRIBIR_LETRA_INPUT_6 = Target.the("Numero de veces para escribir letra")
            .locatedBy("//p[contains(text(),'Escriba 267 veces la letra \"O\"')]");
}
