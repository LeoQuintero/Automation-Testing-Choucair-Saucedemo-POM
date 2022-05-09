package co.com.choucair.certification.saucedemo.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompraProductoDefinitio {
    @Given("^Realizo el login con usuario {string} y clave {string}$")
    public void realizoElLoginConUsuarioYClave(String arg0, String arg1) {
    }

    @When("Agrego el primer producto backpack")
    public void agregoElPrimerProductoBackpack() {
    }

    @And("Ingreso al carrito de compras")
    public void ingresoAlCarritoDeCompras() {
    }

    @And("Realizo la validación de la compra con el botón CHECKOUT")
    public void realizoLaValidaciónDeLaCompraConElBotónCHECKOUT() {
    }

    @When("^DilIgencia el formulario de comprador$")
    public void diligenciaElFormularioDeComprador() {
    }

    @Then("Verifico los datos de compra exitoso")
    public void verificoLosDatosDeCompraExitoso() {
    }
}
