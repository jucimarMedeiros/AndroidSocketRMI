package RMI;


import java.rmi.*;

public interface VerificaCPF extends Remote{
	int codigo() throws RemoteException;
	String CPF(String cpf) throws RemoteException;

}
