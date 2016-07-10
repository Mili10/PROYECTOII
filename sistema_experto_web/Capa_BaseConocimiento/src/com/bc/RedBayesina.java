package com.bc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class RedBayesina
{
	public Properties getPropiertesEnfermedad(){
		try{
			//se crea una instancia a la clase Properties
			Properties grafico = new Properties();
			InputStream entrada = null;
			entrada = new FileInputStream("C:\\Users\\Mili\\Documents\\GitHub\\PROYECTOII\\sistema_experto_web\\Capa_BaseConocimiento\\src\\archivos\\probsDadoEnfermedad.xml");
			//se lee el archivo .propiertes
			grafico.loadFromXML(entrada);
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
			InputStream entrada = null;
			entrada = new FileInputStream("C:\\Users\\Mili\\Documents\\GitHub\\PROYECTOII\\sistema_experto_web\\Capa_BaseConocimiento\\src\\archivos\\probsDadoNoEnfermedad.xml");
			//se lee el archivo .propiertes
			grafico.loadFromXML(entrada);
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

