package co.com.client.webproject.test.controllers;


import co.com.client.webproject.test.page.CarritoComprasPage;
import co.com.client.webproject.test.page.ContactUsPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import com.github.javafaker.Faker;

public class ContactUsController {
    Faker faker = new Faker();
    private WebAction webAction;

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public void verificarContactUs(){

        try{
            ContactUsPage contactUsPage = new ContactUsPage(webAction.getDriver());

            webAction.click(contactUsPage.getBTN_CONTACT_US(),2,true);
            webAction.selectByText(contactUsPage.getSUBJECT(),"Webmaster",true);
            webAction.sendText(contactUsPage.getEMAIL(), faker.internet().emailAddress(),2,true);
            webAction.sendText(contactUsPage.getMESSAGE(),faker.lorem().characters(),true);
            webAction.click(contactUsPage.getBTN_SEND(),2,true);








        }catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al intentar enviar el mensaje.", e);
        }

    }
    public String obtenerMensajeDeContactoExitoso(){
        String mensaje = "";
        try{
            ContactUsPage ContactUsPage = new ContactUsPage(webAction.getDriver());

            mensaje = webAction.getText(ContactUsPage.getMESSAGE_SUCCESSFULLY(), 2, true);

        } catch (WebActionsException e) {
            Report.reportFailure("Your message has been successfully sent to our team.", e);
        }

        return mensaje;
    }

    public void verificarContactUsFailed(){

        try{
            ContactUsPage contactUsPage = new ContactUsPage(webAction.getDriver());

            webAction.click(contactUsPage.getBTN_CONTACT_US(),2,true);
            webAction.selectByText(contactUsPage.getSUBJECT(),"Webmaster",true);
            //webAction.sendText(contactUsPage.getEMAIL(), faker.internet().emailAddress(),2,true);
            webAction.sendText(contactUsPage.getMESSAGE(),faker.lorem().characters(),true);
            webAction.click(contactUsPage.getBTN_SEND(),2,true);








        }catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al intentar enviar el mensaje.", e);
        }

    }
    public String obtenerMensajeDeContactoFallido(){
        String mensaje = "";
        try{
            ContactUsPage ContactUsPage = new ContactUsPage(webAction.getDriver());

            mensaje = webAction.getText(ContactUsPage.getMESSAGE_FAILED(), 2, true);

        } catch (WebActionsException e) {
            Report.reportFailure("Invalid email address.", e);
        }

        return mensaje;
    }

}
