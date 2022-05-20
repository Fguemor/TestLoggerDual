package edu.log;

import java.io.File;

import org.apache.log4j.Logger;

import edu.dual.Xml;
/**
 * Clase de trazado de depuración, y donde importare el xml de la librería y haré uso de los métodos
 * @author Fátima Guerrero
 *@version 1.0
 */

public class TestLog {
	//Se instancia el trazador a partir de la clase actual
	//es decir se quiere trazar código dentro de esta clase
	static Logger log=Logger.getLogger(TestLog.class.getName());
	public static void main(String[]args) {
		log.debug("Debug");
		log.info("Info");
		File file=new File("Logs.xml");
		//Creo una instancia del xml 
		Xml xml=new Xml("/home/usuario/Desktop/Dual/ACTIVIDAD5DUAL/configuracion/configuracion.xml");
		//Llamo a los método de la libreria
		xml.XmlBd(file);
		xml.BdXml();
	}
}
