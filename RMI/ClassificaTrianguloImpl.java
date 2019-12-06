package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClassificaTrianguloImpl extends UnicastRemoteObject implements Classificatriangulo{

	
	  protected ClassificaTrianguloImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public String tipoTriangulo(double lado1,double lado2,double lado3)  throws RemoteException { 
		    
	    	String res="";
	    	
	    	if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
	            if (lado1 == lado2 && lado1 == lado3) {
	                res= "Triangulo Equilatero";
	            } else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
	                res="Triangulo Isosceles";
	            } else
	              res="Triângulo Escaleno";
	        } else {
	           res="Não é um triangulo!";
	        }
	       return res;     
	    }
}
