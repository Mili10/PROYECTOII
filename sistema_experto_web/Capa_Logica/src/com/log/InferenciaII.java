package com.log;

import java.util.Map;
import java.util.Properties;

import com.bc.RedBayesina;

public class InferenciaII {
	RedBayesina grafo = new RedBayesina();
	
	public float ProbabilidadI(String [] cond){
		Properties _grafo = grafo.getPropiertesEnfermedad();
		float prob = 1;
		for(Map.Entry<Object, Object> item:_grafo.entrySet())
		{
			final String Key = item.getKey().toString();
			for(int i=0; i<cond.length;i++){
				if(cond[i].equals(Key)){
					String var = (String) item.getValue();
					float p = Float.parseFloat(var);
					prob = prob * p;
				}
			}
		}
		return prob;
	}
	
	public float ProbabilidadII(String [] cond){
		Properties _grafo = grafo.getPropiertesNoEnfermedad();
		float probb = 1;
		for(Map.Entry<Object, Object> item:_grafo.entrySet())
		{
			final String Key = item.getKey().toString();
			for(int i=0; i<cond.length;i++){
				if(cond[i].equals(Key)){
					String var = (String) item.getValue();
					float p = Float.parseFloat(var);
					probb = probb * p;
				}
			}
		}
		return probb;
	}
	
	public float inferTeoremaBayes (float prob, float probb){
		float probabilidad;
		
		probabilidad = (float) ((prob*0.75)/((prob*0.75)+(probb*0.25)));
		
		return probabilidad;
	}
}
