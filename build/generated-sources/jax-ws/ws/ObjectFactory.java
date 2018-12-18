
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BusinessMethod_QNAME = new QName("http://ws/", "businessMethod");
    private final static QName _BusinessMethodResponse_QNAME = new QName("http://ws/", "businessMethodResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BusinessMethod }
     * 
     */
    public BusinessMethod createBusinessMethod() {
        return new BusinessMethod();
    }

    /**
     * Create an instance of {@link BusinessMethodResponse }
     * 
     */
    public BusinessMethodResponse createBusinessMethodResponse() {
        return new BusinessMethodResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "businessMethod")
    public JAXBElement<BusinessMethod> createBusinessMethod(BusinessMethod value) {
        return new JAXBElement<BusinessMethod>(_BusinessMethod_QNAME, BusinessMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "businessMethodResponse")
    public JAXBElement<BusinessMethodResponse> createBusinessMethodResponse(BusinessMethodResponse value) {
        return new JAXBElement<BusinessMethodResponse>(_BusinessMethodResponse_QNAME, BusinessMethodResponse.class, null, value);
    }

}