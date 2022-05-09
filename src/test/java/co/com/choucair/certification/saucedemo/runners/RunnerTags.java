package co.com.choucair.certification.saucedemo.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/compraProducto.feature",
        tags = "@HistoriaDeUsuario",
        glue = "co/com/choucair/certification/saucedemo/definitions",
                snippets = CucumberOptions.SnippetType.CAMELCASE)   //organiza con CamelCase al feature imprime
public class RunnerTags {
}
