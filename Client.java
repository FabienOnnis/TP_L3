package TP4;

public class Client
{
	private String nom;
	private String paiement;
	private String contact;
	private String reference;
	
	public Client(String nom, String paiement, String contact, String reference)
	{
		this.nom = nom;
		this.paiement = paiement;
		this.contact = contact;
		this.reference = reference;
		
		System.out.println("Client successfully created");
	}
}