package base;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person_Test {
		
	private static PersonDomainModel person1;
	private static UUID person1UUID = UUID.randomUUID();
	private static PersonDomainModel person2;
	private static UUID person2UUID = UUID.randomUUID();
	private static PersonDomainModel person3;
	private static UUID person3UUID = UUID.randomUUID();
	
	@BeforeClass
	public static void personInstance() throws Exception{
		
		Date person1Birth = null;
		Date person2Birth = null;
		Date person3Birth = null;

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		 person1 = new PersonDomainModel();
		 person2 = new PersonDomainModel();
		 person3 = new PersonDomainModel();
		 
		try {
			person1Birth = dateFormat.parse("1994-11-27");
			person2Birth = dateFormat.parse("1993-10-17");
			person3Birth = dateFormat.parse("1992-09-07");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		person1.setPersonID(person1UUID);
		person1.setFirstName("Mingkun");
		person1.setMiddleName("a");
		person1.setLastName("Chen");
		person1.setBirthday(person1Birth);
		person1.setCity("Elkton");
		person1.setStreet("702 Stone Gate Blvd");
		person1.setPostalCode(21921);
		
		person2.setPersonID(person2UUID);
		person2.setFirstName("Ke");
		person2.setLastName("Xi");
		person2.setBirthday(person2Birth);
		person2.setCity("Newark");
		person2.setStreet("1234 christina mill dr.");
		person2.setPostalCode(19711);
		
		person3.setPersonID(person3UUID);
		person3.setFirstName("Xiaoyan");
		person3.setLastName("Zhou");
		person3.setBirthday(person3Birth);
		person3.setCity("New York");
		person3.setStreet("Fifth ave.");
		person3.setPostalCode(12345);
		
		
		
		
	}
	@Test
	public void persontest() {	
		/**persontest.addPerson(person1);
		persontest.addPerson(person2);
		persontest.addPerson(person3);
		persontest.deletePerson(person1UUID);
		
		person2.setCity("Changzhou");
		persontest.updatePerson(person3);
		
		person3.setFirstName("qqq");
		persontest.updatePerson(person2);
		*/
		
	}
	
	

}
