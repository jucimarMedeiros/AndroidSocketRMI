package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EquacaoSegundoGrau extends Remote {

	public double delta(int a,int b,int c)  throws RemoteException ;
	public double calculaX1(int a,int b,int c,double delta)  throws RemoteException ;
	public double calculaX2(int a,int b,int c,double delta)  throws RemoteException ;
    
}
