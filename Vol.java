package TP4;
import java.util.*;
import java.time.ZonedDateTime;
import java.time.Duration;

public class Vol
{
	private String identifiant;
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;
	private final Integer MAX_CAPACITY;
	private Integer currentCapacity;
	private boolean ouvert;
	
	public Vol(String identifiant, ZonedDateTime depart, ZonedDateTime arrivee, Integer maxCapacity)
	{
		this.identifiant = identifiant;
		this.depart = depart;
		this.arrivee = arrivee;
		this.MAX_CAPACITY = maxCapacity;
		this.ouvert = false;
		this.currentCapacity = 0;
		
		System.out.println("Flight successfully created");
	}
	
	public Duration duree()
	{
		return Duration.between(depart, arrivee);
	}
	
	public void ouvrir()
	{
		this.ouvert = true;
		
		System.out.println("Flight successfully opened");
	}
	
	public boolean fermee()
	{
		return !this.ouvert;
	}
	
	public void addPass(Passager passager)
	{
		this.currentCapacity += 1;
	}
	
	public void addPass(ArrayList<Passager> passagers)
	{
		this.currentCapacity += passagers.size();
	}
	
	public void remPass(ArrayList<Passager> passagers)
	{
		this.currentCapacity -= passagers.size();
	}
	
	public void printCurrentCapacity()
	{
		System.out.println("Flight current capacity = " + this.currentCapacity + " / " + this.MAX_CAPACITY);
	}
	
	public Integer getCurrentCapacity()
	{
		return this.currentCapacity;
	}
	
	public Integer getMaxCapacity()
	{
		return this.MAX_CAPACITY;
	}
}