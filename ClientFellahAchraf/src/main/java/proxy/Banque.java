
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "Banque", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:9191/Banque?wsdl")
public class Banque
    extends Service
{

    private static final URL BANQUE_WSDL_LOCATION;
    private static final WebServiceException BANQUE_EXCEPTION;
    private static final QName BANQUE_QNAME = new QName("http://ws/", "Banque");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9191/Banque?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANQUE_WSDL_LOCATION = url;
        BANQUE_EXCEPTION = e;
    }

    public Banque() {
        super(__getWsdlLocation(), BANQUE_QNAME);
    }

    public Banque(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANQUE_QNAME, features);
    }

    public Banque(URL wsdlLocation) {
        super(wsdlLocation, BANQUE_QNAME);
    }

    public Banque(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANQUE_QNAME, features);
    }

    public Banque(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Banque(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort() {
        return super.getPort(new QName("http://ws/", "BanqueServicePort"), BanqueService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "BanqueServicePort"), BanqueService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANQUE_EXCEPTION!= null) {
            throw BANQUE_EXCEPTION;
        }
        return BANQUE_WSDL_LOCATION;
    }

}
