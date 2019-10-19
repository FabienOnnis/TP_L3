package TP4;
import java.util.*;

public class Reservation
{
	public Date date;
	public Integer identifiant;
	public String etat;
	private boolean payee;
	private final Client client;
	private final ArrayList<Passager> passagers;
	private final Vol vol;
	
	
	public Reservation(Date date, Integer identifiant, Client client, ArrayList<Passager> passagers, Vol vol)
	{
		if (vol.getCurrentCapacity() + passagers.size() > vol.getMaxCapacity())
		{
			throw new IllegalStateException("Vol does not have enough seats left");
		}
		
		else
		{
			this.vol = vol;
			this.passagers = passagers;
			this.date = date;
			this.identifiant = identifiant;
			this.etat = "En attente de paiement";
			this.client = client;
			this.payee = false;
			this.vol.addPass(passagers);
			
			System.out.println("Reservation succesfully created");
		}
	}
	
	public void annuler()
	{
		this.etat = "Annulee";
		this.vol.remPass(this.passagers);
		
		System.out.println("Reservation succesfully canceled");
	}
	
	public void confirmer()
	{
		this.etat = "Confirmee";
	}
	
	public void payer()
	{
		this.payee = true;
	}
}