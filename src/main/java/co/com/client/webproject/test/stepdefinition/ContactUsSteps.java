package co.com.client.webproject.test.stepdefinition;

import co.com.client.webproject.test.controllers.ContactUsController;
import co.com.client.webproject.test.controllers.openwebpage.StartBrowserWebController;
import co.com.client.webproject.test.data.objects.TestInfo;
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

public class ContactUsSteps extends Setup {

    private WebAction webAction;


    @Before
    public void setup(Scenario scenario){
        testInfo = new TestInfo(scenario);
        webAction = new WebAction(testInfo.getFeatureName());
        webAction.setScenario(testInfo.getScenarioName());
    }
    @Dado("que el cliente se encuentra en el apartado de contacus")
    public void que_el_cliente_se_encuentra_en_el_apartado_de_contacus() {
        StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
        startBrowserWebController.setWebAction(webAction);
        startBrowserWebController.setBrowser(browser());
        startBrowserWebController.setFeatue(testInfo.getFeatureName());
        startBrowserWebController.abrirTiendaOnline();

    }
    @Cuando("el usuario llena los campos correspondientes")
    public void el_usuario_llena_los_campos_correspondientes() {
        ContactUsController contactUsController = new ContactUsController();
        contactUsController.setWebAction(webAction);
        contactUsController.verificarContactUs();

    }
    @Entonces("el usuario debera ver un mensaje de envio exitoso")
    public void el_usuario_debera_ver_un_mensaje_de_envio_exitoso() {
        ContactUsController contactUsController = new ContactUsController();
        contactUsController.setWebAction(webAction);

        String message = contactUsController.obtenerMensajeDeContactoExitoso();
        Assert
                .Hard
                .thatString(message)
                .isEqualTo("Your message has been successfully sent to our team.", message);

    }
    @After
    public void cerrarDriver() throws InterruptedException {

        Thread.sleep(5000);

        if (webAction != null && webAction.getDriver() != null)
            webAction.closeBrowser();

        Report.reportInfo("***** HA FINALIZADO LA PRUEBA DEL CONTACT US******"
                .concat(testInfo.getFeatureName())
                .concat("-")
                .concat(testInfo.getScenarioName()));
    }


    @Dado("que el quiere enviar un mensaje a servicio al cliente")
    public void que_el_quiere_enviar_un_mensaje_a_servicio_al_cliente() {
        StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
        startBrowserWebController.setWebAction(webAction);
        startBrowserWebController.setBrowser(browser());
        startBrowserWebController.setFeatue(testInfo.getFeatureName());
        startBrowserWebController.abrirTiendaOnline();


    }
    @Cuando("el cliente no ingresa email")
    public void el_cliente_no_ingresa_email() {
        ContactUsController contactUsController = new ContactUsController();
        contactUsController.setWebAction(webAction);
        contactUsController.verificarContactUsFailed();

    }
    @Entonces("como resultado el usuario no podra enviar el mensaje")
    public void como_resultado_el_usuario_no_podra_enviar_el_mensaje() {
        ContactUsController contactUsController = new ContactUsController();
        contactUsController.setWebAction(webAction);
        String message = contactUsController.obtenerMensajeDeContactoFallido();
        Assert
                .Hard
                .thatString(message)
                .isEqualTo("Invalid email address.", message);

    }


}
