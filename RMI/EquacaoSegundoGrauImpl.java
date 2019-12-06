package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EquacaoSegundoGrauImpl extends UnicastRemoteObject implements EquacaoSegundoGrau {

	protected EquacaoSegundoGrauImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	public double delta(int a,int b,int c)  throws RemoteException {    	    	
    	return (b * b) + (-4 * (a * c));   	    	
    }
	public double calculaX1(int a,int b,int c,double delta)  throws RemoteException {  
        return (double) ((-(b) + Math.sqrt(delta)) / 2 * a);  
    }
	public double calculaX2(int a,int b,int c,double delta) throws RemoteException  {   	   	 
   	 return (double) ((-(b) - Math.sqrt(delta)) / 2 * a); 
   }
	
}
