
package prod.businessLogic.webservices.clients;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the prod.businessLogic.webservices.clients package. 
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

    private final static QName _GetDevelopers_QNAME = new QName("http://implementation.webservices.businessLogic.prod/", "getDevelopers");
    private final static QName _GetDevelopersResponse_QNAME = new QName("http://implementation.webservices.businessLogic.prod/", "getDevelopersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: prod.businessLogic.webservices.clients
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDevelopers }
     * 
     */
    public GetDevelopers createGetDevelopers() {
        return new GetDevelopers();
    }

    /**
     * Create an instance of {@link GetDevelopersResponse }
     * 
     */
    public GetDevelopersResponse createGetDevelopersResponse() {
        return new GetDevelopersResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevelopers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://implementation.webservices.businessLogic.prod/", name = "getDevelopers")
    public JAXBElement<GetDevelopers> createGetDevelopers(GetDevelopers value) {
        return new JAXBElement<GetDevelopers>(_GetDevelopers_QNAME, GetDevelopers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevelopersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://implementation.webservices.businessLogic.prod/", name = "getDevelopersResponse")
    public JAXBElement<GetDevelopersResponse> createGetDevelopersResponse(GetDevelopersResponse value) {
        return new JAXBElement<GetDevelopersResponse>(_GetDevelopersResponse_QNAME, GetDevelopersResponse.class, null, value);
    }

}
