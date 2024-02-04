package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import static userInterface.Ciclo1Page.*;


public class ResolverOperacionYClickTask implements Task {


    private final Target targetOperacion;

    private final Target targetOperacion2;

    private final Target targetOperacion3;

    public ResolverOperacionYClickTask(Target targetOperacion,Target targetOperacion2,Target targetOperacion3 ) {
        this.targetOperacion = targetOperacion;
        this.targetOperacion2 = targetOperacion2;
        this.targetOperacion3 = targetOperacion3;
    }

    public static ResolverOperacionYClickTask conTargets(Target targetOperacion, Target targetOperacion2, Target targetOperacion3 ) {
        return new ResolverOperacionYClickTask(targetOperacion,targetOperacion2,targetOperacion3);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Obtener la operación del Target
        String expresion = targetOperacion.resolveFor(actor).getText();

        // Manipular la expresión para evitar problemas con caracteres especiales
        String expresionManipulada = manipularExpresion(expresion);

        // Resolver la operación y guardar el resultado
        String resultado = resolverOperacion(expresionManipulada);

        actor.attemptsTo(
                Click.on("//input[@name='radio' and @value ="+resultado+"]")
        );

        String expresion2 = targetOperacion2.resolveFor(actor).getText();

        // Manipular la expresión para evitar problemas con caracteres especiales
        String expresionManipulada2 = manipularExpresion(expresion2);

        // Resolver la operación y guardar el resultado
        String resultado2 = resolverOperacion(expresionManipulada2);

        actor.attemptsTo(
                Click.on(ANSWER_INPUT),
                Click.on("//option[contains(text(),'"+resultado2+"')]")
        );

        InfoXPath infoXPath = obtenerInfoDeXPath(targetOperacion3, actor);
        int numero = infoXPath.getNumero();
        char letra = infoXPath.getLetra();

        StringBuilder accumulatedValue = new StringBuilder();
        for (int i = 0; i < numero; i++) {
            accumulatedValue.append(letra);
        }

        actor.attemptsTo(
                Enter.theValue(accumulatedValue.toString()).into(TEXT_G_INPUT)
        );

        actor.attemptsTo(
                Click.on(BUTTON_ENVIAR)
        );
    }

    private String manipularExpresion(String expresion) {
        // Eliminar caracteres especiales que pueden causar problemas
        return expresion.replaceAll("[=?]", "");
    }

    private String resolverOperacion(String expresion) {
        // Evaluar la operación utilizando la clase ScriptEngine
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        try {
            // Evaluar la expresión y convertir el resultado a una cadena
            Object result = engine.eval(expresion);

            // Convertir el resultado a cadena con formato específico
            return String.format("%.0f", Double.parseDouble(result.toString()));
        } catch (ScriptException | NumberFormatException e) {
            e.printStackTrace();
            // Manejar la excepción según tus necesidades
            return "Error en la evaluación";
        }
    }
    private InfoXPath obtenerInfoDeXPath(Target target, Actor actor) {
        // Obtener el texto del elemento
        String texto = target.resolveFor(actor).getText();

        // Usar una expresión regular para extraer el número y la letra
        // Suponemos que el formato es 'Escriba [número] veces la letra "[letra]"'
        String regex = "Escriba (\\d+) veces la letra \"([^\"]+)\"";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(texto);

        if (matcher.find()) {
            int numero = Integer.parseInt(matcher.group(1));
            char letra = matcher.group(2).charAt(0);
            return new InfoXPath(numero, letra);
        } else {
            throw new IllegalArgumentException("El formato del texto no coincide con la expresión esperada.");
        }
    }

    private static class InfoXPath {
        private final int numero;
        private final char letra;

        public InfoXPath(int numero, char letra) {
            this.numero = numero;
            this.letra = letra;
        }

        public int getNumero() {
            return numero;
        }

        public char getLetra() {
            return letra;
        }
    }

}