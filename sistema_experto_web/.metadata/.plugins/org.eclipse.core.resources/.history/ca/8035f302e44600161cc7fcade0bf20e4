package com.log;

public class Inferencia {
	String[] sintomas = new String[]{"D_muscular", "D_cabeza", "D_articular", "Vomito", "Fiebre", "Nauseas"};
	
	
	public float inferI (String [] cond){//probabilidad de tener cierto sintoma dado que tengo la enfermedad P(DM,DC,DA,V,F,N/D)
		float prob = 0;
			if(cond[0].equals(sintomas[0])){//dmuscular positivo
				prob = (float) 0.7; //probabilidad de que tenga el sintoma dado que tengo enfermdad
				if(cond[1].equals(sintomas[1])){//dcabeza positivo
					prob = (float) (prob*0.8);
					if(cond[2].equals(sintomas[2])){//dolor articular positivo
						prob = (float) (prob*0.9);
						if(cond[3].equals(sintomas[3])){//vomito positivo
							prob = (float) (prob*0.95);
							if(cond[4].equals(sintomas[4])){//fiebre positivo
								prob = (float) (prob*0.5);
								if(cond[5].equals(sintomas[5])){//nauseas positivo
									prob = (float) (prob*0.3);									
								}
							}
						}
					}
				}
			}
			
			else
			{
				prob = (float) 0.3;//no tiene dolor muscular dado que tiene dengue
				if(cond[1].equals(sintomas[1])){
					prob= (float) (prob*0.8);
				}
				else{
					prob= (float) (prob*0.2); //no tiene dolor cabeza dado que tine dengue
					if(cond[2].equals(sintomas[2])){//dolor articular positivo
						prob = (float) (prob*0.9);
						if(cond[3].equals(sintomas[3])){//vomito positivo
							prob = (float) (prob*0.95);
							if(cond[4].equals(sintomas[4])){//fiebre positivo
								prob = (float) (prob*0.5);
								if(cond[5].equals(sintomas[5])){//nauseas positivo
									prob = (float) (prob*0.3);									
								}
							}
						}
					}
				}
			}
			
		return prob;
			
	}
	
	public float inferPConjunta(String [] cond){//probabilidad de que tenga cierto sintoma dado que no tengo la enfermedad
		float probb = 0;
		if(cond[0].equals(sintomas[0])){//dmuscular positivo
			probb=(float) (0.4); //probabilidad de que tenga el sintoma dado que no tengo enfermdad
			if(cond[1].equals(sintomas[1])){//dcabeza positivo
				probb=(float) (probb * 0.6); //probabilidad de que tenga el sintoma dado que no tengo enfermdad
				if(cond[2].equals(sintomas[2])){//darticular positivo
					probb=(float) (probb * 0.4); //probabilidad de que tenga el sintoma dado que no tengo enfermdad
					if(cond[3].equals(sintomas[3])){//vomito positivo
						probb=(float) (probb * 0.25); //probabilidad de que tenga el sintoma dado que no tengo enfermdad
						if(cond[4].equals(sintomas[4])){//fiebre positivo
							probb=(float) (probb * 0.2); //probabilidad de que tenga el sintoma dado que no tengo enfermdad
							if(cond[5].equals(sintomas[5])){//nauseas positivo
								probb=(float) (probb * 0.6); //probabilidad de que tenga el sintoma dado que no tengo enfermdad
								
							}
						}
					}
				}
			}
		}
		
		else
		{
			probb = (float) 0.6;//no tiene dolor muscular dado que no tiene dengue
			if(cond[1].equals(sintomas[1])){
				probb= (float) (probb*0.8);
			}
			else{
				probb= (float) (probb*0.4); //no tiene dolor cabeza dado que no tiene dengue
				if(cond[2].equals(sintomas[2])){//dolor articular positivo no tiene dengue
					probb = (float) (probb*0.4);
					if(cond[3].equals(sintomas[3])){//vomito positivo no tiene dengue
						probb = (float) (probb*0.25);
						if(cond[4].equals(sintomas[4])){//fiebre positivo no tiene dengue
							probb = (float) (probb*0.2);
							if(cond[5].equals(sintomas[5])){//nauseas positivo no tiene dengue
								probb = (float) (probb*0.6);									
							}
						}
					}
				}
			}
		}
		
		return probb; //retorna solo la suma de los sintomas dado que no tiene la enfermedad
	}
	
	public float inferTeoremaBayes (float prob, float probb){
		float probabilidad;
		
		probabilidad = (float) ((prob*0.75)/((prob*0.75)+(probb*0.25)));
		
		return probabilidad;
	}
}
