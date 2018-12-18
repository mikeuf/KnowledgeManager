
package com.mycompany.knowledgemanager;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.knowledgemanager package. 
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

    private final static QName _SaveArticle_QNAME = new QName("http://knowledgemanager.mycompany.com/", "saveArticle");
    private final static QName _Hello_QNAME = new QName("http://knowledgemanager.mycompany.com/", "hello");
    private final static QName _BusinessMethodResponse_QNAME = new QName("http://knowledgemanager.mycompany.com/", "businessMethodResponse");
    private final static QName _BusinessMethod_QNAME = new QName("http://knowledgemanager.mycompany.com/", "businessMethod");
    private final static QName _HelloResponse_QNAME = new QName("http://knowledgemanager.mycompany.com/", "helloResponse");
    private final static QName _SaveArticleResponse_QNAME = new QName("http://knowledgemanager.mycompany.com/", "saveArticleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.knowledgemanager
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
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link SaveArticleResponse }
     * 
     */
    public SaveArticleResponse createSaveArticleResponse() {
        return new SaveArticleResponse();
    }

    /**
     * Create an instance of {@link SaveArticle }
     * 
     */
    public SaveArticle createSaveArticle() {
        return new SaveArticle();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link BusinessMethodResponse }
     * 
     */
    public BusinessMethodResponse createBusinessMethodResponse() {
        return new BusinessMethodResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveArticle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://knowledgemanager.mycompany.com/", name = "saveArticle")
    public JAXBElement<SaveArticle> createSaveArticle(SaveArticle value) {
        return new JAXBElement<SaveArticle>(_SaveArticle_QNAME, SaveArticle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://knowledgemanager.mycompany.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://knowledgemanager.mycompany.com/", name = "businessMethodResponse")
    public JAXBElement<BusinessMethodResponse> createBusinessMethodResponse(BusinessMethodResponse value) {
        return new JAXBElement<BusinessMethodResponse>(_BusinessMethodResponse_QNAME, BusinessMethodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://knowledgemanager.mycompany.com/", name = "businessMethod")
    public JAXBElement<BusinessMethod> createBusinessMethod(BusinessMethod value) {
        return new JAXBElement<BusinessMethod>(_BusinessMethod_QNAME, BusinessMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://knowledgemanager.mycompany.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://knowledgemanager.mycompany.com/", name = "saveArticleResponse")
    public JAXBElement<SaveArticleResponse> createSaveArticleResponse(SaveArticleResponse value) {
        return new JAXBElement<SaveArticleResponse>(_SaveArticleResponse_QNAME, SaveArticleResponse.class, null, value);
    }

}
