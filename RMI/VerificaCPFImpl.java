package RMI;

import java.rmi.*;
import java.rmi.server.*;

public class VerificaCPFImpl  extends UnicastRemoteObject implements VerificaCPF{

	protected VerificaCPFImpl() throws RemoteException {
		super();		
	}
		
	@Override
	public String CPF(String cpf) throws RemoteException {
		
		 ValidaCPF validaCPF = new ValidaCPF();
		 String res="";
		 
		 boolean valido = ValidaCPF.isCPF(cpf); 
		  
	        
	        if(valido) {
	        	res = "CPF V�LIDO";
	        }else {
	        	res = "CPF INV�LIDO";
	        }
		
		return res;
	}



	@Override
	public int codigo() throws RemoteException {		
		return 5566;
	}

	

	
	
	
}
