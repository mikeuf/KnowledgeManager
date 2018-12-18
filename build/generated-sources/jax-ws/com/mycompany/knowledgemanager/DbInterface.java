
package com.mycompany.knowledgemanager;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DbInterface", targetNamespace = "http://knowledgemanager.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DbInterface {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://knowledgemanager.mycompany.com/", className = "com.mycompany.knowledgemanager.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://knowledgemanager.mycompany.com/", className = "com.mycompany.knowledgemanager.HelloResponse")
    @Action(input = "http://knowledgemanager.mycompany.com/DbInterface/helloRequest", output = "http://knowledgemanager.mycompany.com/DbInterface/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "businessMethod", targetNamespace = "http://knowledgemanager.mycompany.com/", className = "com.mycompany.knowledgemanager.BusinessMethod")
    @ResponseWrapper(localName = "businessMethodResponse", targetNamespace = "http://knowledgemanager.mycompany.com/", className = "com.mycompany.knowledgemanager.BusinessMethodResponse")
    @Action(input = "http://knowledgemanager.mycompany.com/DbInterface/businessMethodRequest", output = "http://knowledgemanager.mycompany.com/DbInterface/businessMethodResponse")
    public List<String> businessMethod(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saveArticle", targetNamespace = "http://knowledgemanager.mycompany.com/", className = "com.mycompany.knowledgemanager.SaveArticle")
    @ResponseWrapper(localName = "saveArticleResponse", targetNamespace = "http://knowledgemanager.mycompany.com/", className = "com.mycompany.knowledgemanager.SaveArticleResponse")
    @Action(input = "http://knowledgemanager.mycompany.com/DbInterface/saveArticleRequest", output = "http://knowledgemanager.mycompany.com/DbInterface/saveArticleResponse")
    public boolean saveArticle(
        @WebParam(name = "arg0", targetNamespace = "")
        List<String> arg0);

}
