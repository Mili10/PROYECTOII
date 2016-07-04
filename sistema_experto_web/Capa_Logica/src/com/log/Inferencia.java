package com.log;

public class Inferencia {
	String[] sintomas = new String[]{"D_muscular", "D_cabeza", "D_articular", "Vomito", "Fiebre", "Nauseas"};
	
	
	public float inferI (String [] cond){//probabilidad de tener cierto sintoma dado que tengo la enfermedad
		float prob;
		if(cond[0].equals(sintomas[0])){//dmuscular positivo
			//int pm=1;
			prob=(float) (1 * 0.7); 
			if(cond[1].equals(sintomas[1])){//dcabeza positivo
				prob = (float) (prob * 0.2); 
				if(cond[2].equals(sintomas[2])){//darticular positivo
					prob = (float) (prob*0.9);
					if(cond[3].equals(sintomas[3])){//vomito positivo
						prob = (float) (prob*0.1);
						if(cond[4].equals(sintomas[4])){//fiebre positivo
							prob = (float) (prob*0.5);
							if(cond[5].equals(sintomas[5])){//nauseas positivo
								prob = (float) (prob*0.2);								
							}
							else {//nauseas negativo
								prob = (float) (prob*0.8);
							}
						}
						else {//fiebre negativo
							prob = (float) (prob*0.5);
						}
					}
					else {//vomito negativo
						prob = (float) (prob*0.9);
					}
				}
				else {//darticular negativo
					prob = (float) (prob*0.1);
				}
			}
			else {//dcabeza negativo
				prob = (float) (prob* 0.8);
				if(cond[2].equals(sintomas[2])){//darticular positivo
					prob = (float) (prob*0.9);
					if(cond[3].equals(sintomas[3])){//vomito positivo
						prob = (float) (prob*0.1);
						if(cond[4].equals(sintomas[4])){//fiebre positivo
							prob = (float) (prob*0.5);
							if(cond[5].equals(sintomas[5])){//nauseas positivo
								prob = (float) (prob*0.2);								
							}
							else {//nauseas negativo
								prob = (float) (prob*0.8);
							}
						}
						else {//fiebre negativo
							prob = (float) (prob*0.5);
						}
					}
					else {//vomito negativo
						prob = (float) (prob*0.9);
						if(cond[4].equals(sintomas[4])){//fiebre positivo
							prob = (float) (prob*0.5);
							if(cond[5].equals(sintomas[5])){//nauseas positivo
								prob = (float) (prob*0.2);								
							}
							else {//nauseas negativo
								prob = (float) (prob*0.8);
							}
						}
						else {//fiebre negativo
							prob = (float) (prob*0.5);
						}
					}
				}
				else {//darticular negativo
					prob = (float) (prob*0.1);
				}
			}
		}
		else{//dmuscular es negativo
			prob = (float) (1*0.3);
		}
			
		return prob;
		
		//return;
		
	}
	
	public float inferPConjunta(String [] cond){//probabilidad de que tenga cierto sintoma dado que no tengo la enfermedad
		float probb;
		if(cond[0].equals(sintomas[0])){//dmuscular positivo
			probb=(float) (1 * 0.4); 
			if(cond[1].equals(sintomas[1])){//dcabeza positivo
				probb = (float) (probb * 0.6); 
				if(cond[2].equals(sintomas[2])){//darticular positivo
					probb = (float) (probb*0.4);
					if(cond[3].equals(sintomas[3])){//vomito positivo
						probb = (float) (probb*0.7);
						if(cond[4].equals(sintomas[4])){//fiebre positivo
							probb = (float) (probb*0.2);
							if(cond[5].equals(sintomas[5])){//nauseas positivo
								probb = (float) (probb*0.6);								
							}
							else {//nauseas negativo
								probb = (float) (probb*0.8);
							}
						}
						else {//fiebre negativo
							probb = (float) (probb*0.5);
						}
					}
					else {//vomito negativo
						probb = (float) (probb*0.9);
					}
				}
				else {//darticular negativo
					probb = (float) (probb*0.1);
				}
			}
			else {//dcabeza negativo
				probb = (float) (probb* 0.4);
				if(cond[2].equals(sintomas[2])){//darticular positivo
					probb = (float) (probb*0.4);
					if(cond[3].equals(sintomas[3])){//vomito positivo
						probb = (float) (probb*0.1);
						if(cond[4].equals(sintomas[4])){//fiebre positivo
							probb = (float) (probb*0.5);
							if(cond[5].equals(sintomas[5])){//nauseas positivo
								probb = (float) (probb*0.2);								
							}
							else {//nauseas negativo
								probb = (float) (probb*0.8);
							}
						}
						else {//fiebre negativo
							probb = (float) (probb*0.5);
						}
					}
					else {//vomito negativo
						probb = (float) (probb*0.3);
						if(cond[4].equals(sintomas[4])){//fiebre positivo
							probb = (float) (probb*0.2);
							if(cond[5].equals(sintomas[5])){//nauseas positivo
								probb = (float) (probb*0.6);								
							}
							else {//nauseas negativo
								probb = (float) (probb*0.8);
							}
						}
						else {//fiebre negativo
							probb = (float) (probb*0.5);
						}
					}
				}
				else {//darticular negativo
					probb = (float) (probb*0.1);
				}
			}
		}
		else{//dmuscular es negativo
			probb = (float) (1*0.3);
		}
		
		return probb; //retorna solo la suma de los sintomas dado que no tiene la enfermedad
	}
	
	public float inferTeoremaBayes (float prob, float probb){
		float probabilidad;
		
		probabilidad = (float) (prob*0.75)/(prob+probb);
		
		return probabilidad;
	}
}
