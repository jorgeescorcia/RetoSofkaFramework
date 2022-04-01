package co.com.client.webproject.test.controllers;


import co.com.client.webproject.test.page.CarritoComprasPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

public class CarritoCompraController {
    private WebAction webAction;

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public void verificarCarrito()  {
        try{
            CarritoComprasPage carritoComprasPage = new CarritoComprasPage(webAction.getDriver());

            webAction.click(carritoComprasPage.getBTN_TSHIRTS(),2,true);
            webAction.click(carritoComprasPage.getFADED_SHORT(),true);

            webAction.click(carritoComprasPage.getADD_TO_CART(),2,true);
            webAction.click(carritoComprasPage.getPROCEED_TO_CHECKOUT(),2,true);
            webAction.click(carritoComprasPage.getBTN_PROCEED_TO_CHECKOUT_SUMMARY(),2,true);
            webAction.click(carritoComprasPage.getBTN_PROCEED_TO_CHECKOUT_ADDRESS(),2,true);
            webAction.click(carritoComprasPage.getINPUT_TERMS_CONDITIONS(),2,true);
            webAction.click(carritoComprasPage.getBTN_PROCEED_TO_CHECKOUT_SHIPPING(),2,true);
            webAction.click(carritoComprasPage.getBTN_BANK(),2,true);
            webAction.click(carritoComprasPage.getCONFIRM_ORDER(),2,true);
        }catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al intentar comprar.", e);


        }
    }


    public String obtenerMensajeDeCompraExitoso(){
        String mensaje = "";
        try{
            CarritoComprasPage carritoComprasPage = new CarritoComprasPage(webAction.getDriver());

            mensaje = webAction.getText(carritoComprasPage.getMESSAGE_ORDER(), 2, true);

        } catch (WebActionsException e) {
            Report.reportFailure("Your order on My Store is complete.", e);
        }

        return mensaje;
    }
    public void verificarCarritoFailed()  {
        try{
            CarritoComprasPage carritoComprasPage = new CarritoComprasPage(webAction.getDriver());

            webAction.click(carritoComprasPage.getBTN_TSHIRTS(),2,true);
            webAction.click(carritoComprasPage.getFADED_SHORT(),true);

            webAction.click(carritoComprasPage.getADD_TO_CART(),2,true);
            webAction.click(carritoComprasPage.getPROCEED_TO_CHECKOUT(),2,true);
            webAction.click(carritoComprasPage.getBTN_PROCEED_TO_CHECKOUT_SUMMARY(),2,true);
            webAction.click(carritoComprasPage.getBTN_PROCEED_TO_CHECKOUT_ADDRESS(),2,true);

            webAction.click(carritoComprasPage.getBTN_PROCEED_TO_CHECKOUT_SHIPPING(),2,true);
            webAction.click(carritoComprasPage.getMESSAGE_TERMS_CONDITIONS_DISABLED(),2,true);


        }catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al intentar comprar.", e);


        }
    }
    public String obtenerMensajeDeCompraFallido(){
        String mensajeFailed = "";
        try{
            CarritoComprasPage carritoComprasPage = new CarritoComprasPage(webAction.getDriver());

            mensajeFailed = webAction.getText(carritoComprasPage.getMESSAGE_TERMS_CONDITIONS_DISABLED(), 2, true);

        } catch (WebActionsException e) {
            Report.reportFailure("You must agree to the terms of service before continuing.", e);
        }

        return mensajeFailed;
    }


}
