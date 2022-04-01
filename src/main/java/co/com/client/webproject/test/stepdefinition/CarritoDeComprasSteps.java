package co.com.client.webproject.test.stepdefinition;

import co.com.client.webproject.test.controllers.CarritoCompraController;
import co.com.client.webproject.test.controllers.CreateAnAccountWebController;
import co.com.client.webproject.test.controllers.LoginPageController;
import co.com.client.webproject.test.controllers.openwebpage.StartBrowserWebController;
import co.com.client.webproject.test.data.objects.TestInfo;
import co.com.client.webproject.test.model.Customer;

import co.com.client.webproject.test.setup.Setup;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Assert;
import co.com.sofka.test.evidence.reports.Report;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;


public class CarritoDeComprasSteps  extends Setup {

    private WebAction webAction;
    private Customer customer;

    @Before
    public void setup(Scenario scenario){
        testInfo = new TestInfo(scenario);
        webAction = new WebAction(testInfo.getFeatureName());
        webAction.setScenario(testInfo.getScenarioName());
    }
    @Dado("que el cliente esta registrado en la pagina")
    public void que_el_cliente_esta_registrado_en_la_pagina() {
        StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
        startBrowserWebController.setWebAction(webAction);
        startBrowserWebController.setBrowser(browser());
        startBrowserWebController.setFeatue(testInfo.getFeatureName());
        startBrowserWebController.abrirTiendaOnline();

    }
    @Cuando("el cliente selecciona los productos y los agrega al carrito")
    public void el_cliente_selecciona_los_productos_y_los_agrega_al_carrito()  {

        LoginPageController loginPageController = new LoginPageController();
        loginPageController.setWebAction(webAction);
        loginPageController.irHaciaLoginPage();

        CreateAnAccountWebController createAnAccountWebController = new CreateAnAccountWebController();
        createAnAccountWebController.setWebAction(webAction);
        createAnAccountWebController.crearUnaCuenta();
        customer = createAnAccountWebController.getCustomer();

        CarritoCompraController carritoCompraController = new CarritoCompraController();
        carritoCompraController.setWebAction(webAction);
        carritoCompraController.verificarCarrito();



    }
    @Entonces("como resultado el usuario podra hacer el pago de los productos")
    public void como_resultado_el_usuario_podra_hacer_el_pago_de_los_productos() {

        CarritoCompraController carritoCompraController = new CarritoCompraController();
        carritoCompraController.setWebAction(webAction);
        //String userName = myAccountWebController.obtenerNombreDeNuevoUsuario();
        String message = carritoCompraController.obtenerMensajeDeCompraExitoso();
        Assert
                .Hard
                .thatString(message)
                .isEqualTo("Your order on My Store is complete.", message);

    }

    @After
    public void cerrarDriver() throws InterruptedException {

        Thread.sleep(5000);

        if (webAction != null && webAction.getDriver() != null)
            webAction.closeBrowser();

        Report.reportInfo("***** HA FINALIZADO LA PRUEBA DEL CARRITO DE COMPRAS******"
                .concat(testInfo.getFeatureName())
                .concat("-")
                .concat(testInfo.getScenarioName()));
    }

    @Dado("que el cliente se encuentra registrado")
    public void que_el_cliente_se_encuentra_registrado() {
        StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
        startBrowserWebController.setWebAction(webAction);
        startBrowserWebController.setBrowser(browser());
        startBrowserWebController.setFeatue(testInfo.getFeatureName());
        startBrowserWebController.abrirTiendaOnline();

    }
    @Cuando("el cliente no acepta los terminos y condiciones")
    public void el_cliente_no_acepta_los_terminos_y_condiciones() {
        LoginPageController loginPageController = new LoginPageController();
        loginPageController.setWebAction(webAction);
        loginPageController.irHaciaLoginPage();

        CreateAnAccountWebController createAnAccountWebController = new CreateAnAccountWebController();
        createAnAccountWebController.setWebAction(webAction);
        createAnAccountWebController.crearUnaCuenta();
        customer = createAnAccountWebController.getCustomer();

        CarritoCompraController carritoCompraController = new CarritoCompraController();
        carritoCompraController.setWebAction(webAction);
        carritoCompraController.verificarCarritoFailed();

    }
    @Entonces("como resultado el usuario no podra continuar con el proceso de compra")
    public void como_resultado_el_usuario_no_podra_continuar_con_el_proceso_de_compra() {
        CarritoCompraController carritoCompraController = new CarritoCompraController();
        carritoCompraController.setWebAction(webAction);
        String message = carritoCompraController.obtenerMensajeDeCompraFallido();
        Assert
                .Hard
                .thatString(message)
                .isEqualTo("You must agree to the terms of service before continuing.", message);

    }

}
