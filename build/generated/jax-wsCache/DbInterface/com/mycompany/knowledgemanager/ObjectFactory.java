
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
    private final static QName _LoadArticle_QNAME = new QName("http://knowledgemanager.mycompany.com/", "loadArticle");
    private final static QName _LoadArticleResponse_QNAME = new QName("http://knowledgemanager.mycompany.com/", "loadArticleResponse");
    private final static QName _NewArticle_QNAME = new QName("http://knowledgemanager.mycompany.com/", "newArticle");
    private final static QName _NewArticleResponse_QNAME = new QName("http://knowledgemanager.mycompany.com/", "newArticleResponse");
    private final static QName _SaveArticleResponse_QNAME = new QName("http://knowledgemanager.mycompany.com/", "saveArticleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.knowledgemanager
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NewArticleResponse }
     * 
     */
    public NewArticleResponse createNewArticleResponse() {
        return new NewArticleResponse();
    }

    /**
     * Create an instance of {@link SaveArticleResponse }
     * 
     */
    public SaveArticleResponse createSaveArticleResponse() {
        return new SaveArticleResponse();
    }

    /**
     * Create an instance of {@link LoadArticle }
     * 
     */
    public LoadArticle createLoadArticle() {
        return new LoadArticle();
    }

    /**
     * Create an instance of {@link SaveArticle }
     * 
     */
    public SaveArticle createSaveArticle() {
        return new SaveArticle();
    }

    /**
     * Create an instance of {@link LoadArticleResponse }
     * 
     */
    public LoadArticleResponse createLoadArticleResponse() {
        return new LoadArticleResponse();
    }

    /**
     * Create an instance of {@link NewArticle }
     * 
     */
    public NewArticle createNewArticle() {
        return new NewArticle();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadArticle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://knowledgemanager.mycompany.com/", name = "loadArticle")
    public JAXBElement<LoadArticle> createLoadArticle(LoadArticle value) {
        return new JAXBElement<LoadArticle>(_LoadArticle_QNAME, LoadArticle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://knowledgemanager.mycompany.com/", name = "loadArticleResponse")
    public JAXBElement<LoadArticleResponse> createLoadArticleResponse(LoadArticleResponse value) {
        return new JAXBElement<LoadArticleResponse>(_LoadArticleResponse_QNAME, LoadArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewArticle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://knowledgemanager.mycompany.com/", name = "newArticle")
    public JAXBElement<NewArticle> createNewArticle(NewArticle value) {
        return new JAXBElement<NewArticle>(_NewArticle_QNAME, NewArticle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://knowledgemanager.mycompany.com/", name = "newArticleResponse")
    public JAXBElement<NewArticleResponse> createNewArticleResponse(NewArticleResponse value) {
        return new JAXBElement<NewArticleResponse>(_NewArticleResponse_QNAME, NewArticleResponse.class, null, value);
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
