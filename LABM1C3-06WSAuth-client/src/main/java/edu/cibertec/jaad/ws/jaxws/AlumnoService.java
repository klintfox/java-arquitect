
package edu.cibertec.jaad.ws.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AlumnoService", targetNamespace = "http://jaxws.ws.jaad.cibertec.edu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AlumnoService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registrar", targetNamespace = "http://jaxws.ws.jaad.cibertec.edu/", className = "edu.cibertec.jaad.ws.Registrar")
    @ResponseWrapper(localName = "registrarResponse", targetNamespace = "http://jaxws.ws.jaad.cibertec.edu/", className = "edu.cibertec.jaad.ws.RegistrarResponse")
    public boolean registrar(
        @WebParam(name = "arg0", targetNamespace = "")
        Alumno arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns edu.cibertec.jaad.ws.Alumno
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultar", targetNamespace = "http://jaxws.ws.jaad.cibertec.edu/", className = "edu.cibertec.jaad.ws.Consultar")
    @ResponseWrapper(localName = "consultarResponse", targetNamespace = "http://jaxws.ws.jaad.cibertec.edu/", className = "edu.cibertec.jaad.ws.ConsultarResponse")
    public Alumno consultar(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
