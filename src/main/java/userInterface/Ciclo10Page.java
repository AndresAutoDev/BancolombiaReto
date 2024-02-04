package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class Ciclo10Page {

    public static final Target OPERACION1_CICLO10 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'265-108*68*96*134*199-163=?')]");

    public static final Target OPERACION2_CICLO10 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'181-299*270+29*105-148*39')]");

    public static final Target ESCRIBIR_LETRA_INPUT_10 = Target.the("Numero de veces para escribir letra")
            .locatedBy("//p[contains(text(),'Escriba 478 veces la letra \"Q\"')]");

    public static final Target MSG_EXITO = Target.the("Mensaje de exito")
            .locatedBy("//h1[contains(text(),'Felicidades, has terminado la prueba exitosamente ')]");
}
