package stepDefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.bs.A;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.CompareQestion;
import tasks.*;

import java.util.Arrays;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static userInterface.Ciclo1Page.*;
import static userInterface.Ciclo2Page.*;
import static userInterface.Ciclo3Page.*;
import static userInterface.Ciclo4Page.*;
import static userInterface.Ciclo5Page.*;
import static userInterface.Ciclo6Page.*;
import static userInterface.Ciclo7Page.*;
import static userInterface.Ciclo8Page.*;
import static userInterface.Ciclo9Page.*;
import static userInterface.Ciclo10Page.*;
import static utils.Constants.*;

public class Ciclo1StepDefinition {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR);
    }
    @Dado("^el usuario ingreso a la pagina web$")
    public void elUsuarioIngresoALaPaginaWeb() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(PAGINA_WEB));

    }

    @Cuando("^el usuario ingrese \"([^\"]*)\" \"([^\"]*)\" y oprima enviar$")
    public void elUsuarioIngreseYOprimaEnviar(String arg1, String arg2) {
        OnStage.theActorCalled(ACTOR).attemptsTo(Loguin.OnThePage(USER, PASSWORD));

    }//199-103-159+221+273+230+74+259=?

    @Entonces("^el usuario realizara lo que indica el cilco uno")
    public void elUsuarioRealizaraLoQueIndicaElCilco() {
        OnStage.theActorCalled(ACTOR).attemptsTo(Ciclo1.withValues(Arrays.asList("20", "104", "88","112","42","76","26","32","140","90","178")));
        OnStage.theActorCalled(ACTOR).attemptsTo(ResolverOperacionYClickTask.conTargets(OPERACION1_CICLO1,OPERACION2_CICLO1,ESCRIBIR_LETRA_INPUT));
        OnStage.theActorCalled(ACTOR).attemptsTo(Ciclo1.withValues(Arrays.asList("27")));
        OnStage.theActorCalled(ACTOR).attemptsTo(ResolverOperacionYClickTask.conTargets(OPERACION1_CICLO2,OPERACION2_CICLO2,ESCRIBIR_LETRA_INPUT_2));
        OnStage.theActorCalled(ACTOR).attemptsTo(Ciclo1.withValues(Arrays.asList("160","170","95")));
        OnStage.theActorCalled(ACTOR).attemptsTo(ResolverOperacionYClickTask.conTargets(OPERACION1_CICLO3,OPERACION2_CICLO3,ESCRIBIR_LETRA_INPUT_3));
        OnStage.theActorCalled(ACTOR).attemptsTo(Ciclo1.withValues(Arrays.asList("106","170","166","162","98","174","140","102","22")));
        OnStage.theActorCalled(ACTOR).attemptsTo(ResolverOperacionYClickTask.conTargets(OPERACION1_CICLO4,OPERACION2_CICLO4,ESCRIBIR_LETRA_INPUT_4));
       // OnStage.theActorCalled(ACTOR).attemptsTo(Ciclo1.withValues(Arrays.asList("106","170","166","162","98","174","140","102","22")));
        OnStage.theActorCalled(ACTOR).attemptsTo(ResolverOperacionYClickTask.conTargets(OPERACION1_CICLO5,OPERACION2_CICLO5,ESCRIBIR_LETRA_INPUT_5));
        OnStage.theActorCalled(ACTOR).attemptsTo(Ciclo1.withValues(Arrays.asList("147","42","60","102","66","114","189")));
        OnStage.theActorCalled(ACTOR).attemptsTo(ResolverOperacionYClickTask.conTargets(OPERACION1_CICLO6,OPERACION2_CICLO6,ESCRIBIR_LETRA_INPUT_6));
        OnStage.theActorCalled(ACTOR).attemptsTo(Ciclo1.withValues(Arrays.asList("108","162")));
        OnStage.theActorCalled(ACTOR).attemptsTo(ResolverOperacionYClickTask.conTargets(OPERACION1_CICLO7,OPERACION2_CICLO7,ESCRIBIR_LETRA_INPUT_7));
        OnStage.theActorCalled(ACTOR).attemptsTo(Ciclo1.withValues(Arrays.asList("70","80","185")));
        OnStage.theActorCalled(ACTOR).attemptsTo(ResolverOperacionYClickTask.conTargets(OPERACION1_CICLO8,OPERACION2_CICLO8,ESCRIBIR_LETRA_INPUT_8));
        OnStage.theActorCalled(ACTOR).attemptsTo(ResolverOperacionYClickTask.conTargets(OPERACION1_CICLO9,OPERACION2_CICLO9,ESCRIBIR_LETRA_INPUT_9));
        OnStage.theActorCalled(ACTOR).attemptsTo(Ciclo1.withValues(Arrays.asList("72","174","66","114")));
        OnStage.theActorCalled(ACTOR).attemptsTo(ResolverOperacionYClickTask.conTargets(OPERACION1_CICLO10,OPERACION2_CICLO10,ESCRIBIR_LETRA_INPUT_10));

        OnStage.theActorCalled(ACTOR).should(seeThat(CompareQestion.withExpectedMessage
                (MSG_EXITO, MSG_EXITO_CONSTANTS), equalTo(true)));

    }
}
