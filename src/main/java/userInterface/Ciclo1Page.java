package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class Ciclo1Page {

    public static final Target ANSWER_INPUT = Target.the("Ingresar la respuesta de la operacion")
            .locatedBy("//option[contains(text(),'Respuesta')]");

    public static final Target OPERACION1_CICLO1 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'21-178+183*32+67+227=?')]");

    public static final Target OPERACION2_CICLO1 = Target.the("Operacion a realizar")
            .locatedBy("//p[contains(text(),'92+144+180-123-242*55*115+143+54')]");

    public static final Target ESCRIBIR_LETRA_INPUT = Target.the("Numero de veces para escribir letra")
            .locatedBy("//p[contains(text(),'Escriba 223 veces la letra \"G\"')]");

    public static final Target TEXT_G_INPUT = Target.the("Cuadro de texto")
            .locatedBy("//*[@name='text' and @placeholder= 'Texto']");

    public static final Target BUTTON_ENVIAR= Target.the("Boton enviar")
            .locatedBy("//button[contains(text(),'Enviar')]");
}
