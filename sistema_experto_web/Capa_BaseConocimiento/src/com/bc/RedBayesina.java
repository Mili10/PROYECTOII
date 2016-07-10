package com.bc;

import java.io.IOException;
import java.util.Properties;

public class RedBayesina
{
	public Properties getPropiertesEnfermedad(){
		try{
			//se crea una instancia a la clase Properties
			Properties grafico = new Properties();
			//se lee el archivo .propiertes
			grafico.loadFromXML(getClass().getResourceAsStream("/archivos/probsDadoEnfermedad.xml"));
			//si el archivo de No esta vacia retorna las propiedades leidas
			if (!grafico.isEmpty()){
				return grafico;
			} 
			else {//sino  retornara NULL                 
				return null;
			}
		}catch(IOException e){
			System.out.println("<script>alert('"+e.getMessage()+"')</script>");
			return null;
		}
	}
	
	public Properties getPropiertesNoEnfermedad(){
		try{
			//se crea una instancia a la clase Properties
			Properties grafico = new Properties();
			//se lee el archivo .propiertes
			grafico.loadFromXML(getClass().getResourceAsStream("/archivos/probsDadoNoEnfermedad.xml"));
			//si el archivo de No esta vacia retorna las propiedades leidas
			if (!grafico.isEmpty()){
				return grafico;
			} 
			else {//sino  retornara NULL                 
				return null;
			}
		}catch(IOException e){
			//System.out.println("Error, No se puede leer el archivo");
			return null;
		}
	}
	
}

