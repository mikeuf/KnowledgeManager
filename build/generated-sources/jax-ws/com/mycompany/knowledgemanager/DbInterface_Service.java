
package com.mycompany.knowledgemanager;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DbInterface", targetNamespace = "http://knowledgemanager.mycompany.com/", wsdlLocation = "http://178.128.148.167:8080/DbInterface/DbInterface?wsdl")
public class DbInterface_Service
    extends Service
{

    private final static URL DBINTERFACE_WSDL_LOCATION;
    private final static WebServiceException DBINTERFACE_EXCEPTION;
    private final static QName DBINTERFACE_QNAME = new QName("http://knowledgemanager.mycompany.com/", "DbInterface");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://178.128.148.167:8080/DbInterface/DbInterface?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DBINTERFACE_WSDL_LOCATION = url;
        DBINTERFACE_EXCEPTION = e;
    }

    public DbInterface_Service() {
        super(__getWsdlLocation(), DBINTERFACE_QNAME);
    }

    public DbInterface_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DBINTERFACE_QNAME, features);
    }

    public DbInterface_Service(URL wsdlLocation) {
        super(wsdlLocation, DBINTERFACE_QNAME);
    }

    public DbInterface_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DBINTERFACE_QNAME, features);
    }

    public DbInterface_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DbInterface_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DbInterface
     */
    @WebEndpoint(name = "DbInterfacePort")
    public DbInterface getDbInterfacePort() {
        return super.getPort(new QName("http://knowledgemanager.mycompany.com/", "DbInterfacePort"), DbInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DbInterface
     */
    @WebEndpoint(name = "DbInterfacePort")
    public DbInterface getDbInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://knowledgemanager.mycompany.com/", "DbInterfacePort"), DbInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DBINTERFACE_EXCEPTION!= null) {
            throw DBINTERFACE_EXCEPTION;
        }
        return DBINTERFACE_WSDL_LOCATION;
    }

}
