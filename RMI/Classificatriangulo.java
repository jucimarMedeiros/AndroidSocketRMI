package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Classificatriangulo extends Remote{

	public String tipoTriangulo(double lado1,double lado2,double lado3)  throws RemoteException ;
}
