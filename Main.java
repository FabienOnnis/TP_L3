import TP4.*;
import java.util.*;
import java.time.ZonedDateTime;
import java.time.Duration;

public class Main
{
	public static void main(String args[])
	{
		/*Flight creation*/
		ZonedDateTime departure0 = ZonedDateTime.parse("2019-10-30T12:00:00Z[GMT]");
		ZonedDateTime arrival0 = ZonedDateTime.parse("2019-10-30T14:00:00Z[GMT]");
		Vol vol0 = new Vol("vol0", departure0, arrival0, 150);
		vol0.ouvrir();
		
		System.out.println("--------");
		/*Client creation*/
		Client client0 = new Client("client0", "cb", "email", "ref0");
		
		System.out.println("--------");
		/*Passengers list creation*/
		Passager passager0_0 = new Passager("pass0_0", "tel");
		Passager passager0_1 = new Passager("pass0_1", "tel");
		Passager passager0_2 = new Passager("pass0_2", "tel");
		ArrayList<Passager> passagers0 = new ArrayList<Passager>();
		passagers0.add(passager0_0);
		passagers0.add(passager0_1);
		passagers0.add(passager0_2);
		
		System.out.println("--------");
		/*Reservation creation*/
		Date date0 = Calendar.getInstance().getTime();
		Integer identifiant0 = 001;
		Reservation reservation0 = new Reservation(date0, identifiant0, client0, passagers0, vol0);
		
		System.out.println("--------");
		System.out.println("passenger list size = " + passagers0.size());
		vol0.printCurrentCapacity();
		
		System.out.println("--------");
		reservation0.annuler();
		vol0.printCurrentCapacity();
	}
}