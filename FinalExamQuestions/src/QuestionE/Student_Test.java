package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.javafx.collections.MappingChange.Map;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1978-07-31");
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1979-07-31");
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1980-07-31");
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1981-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Russ", "Arthur", "Stump", dBirthDate, "214 Plane Lane", "302-893-8897", "RStumpudel.edu","Electrical Engineering");
		Student stu3 = new Student("Bert", "Rand", "Gibbons", dBirthDate, "214 Joy Lane", "302-893-0987", "brandall@udel.edu","Chemistry");
		Student stu4 = new Student("Steve", "Randall", "Gibbs", dBirthDate, "099 Labrador Lane", "610-878-6889", "bgibbs@udel.edu","Biology");
		Student stu5 = new Student("Bert", "Randy", "Gibbons", dBirthDate, "909 Retirever Lane", "484-893-6889", "brandy@udel.edu","Physics");
		
		Map Map = (com.sun.javafx.collections.MappingChange.Map) new HashMap();
		Map.save(stu1);
		Map.save(stu2);
		Map.save(stu3);
		Map.save(stu4);
		Map.save(stu5);
		assertTrue(Map.size == 5);
	}

}
