package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
//import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)

public class JobTest {
    Job job1;
    Job job2;
    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;
    Job test_job5;

    /*@Before
        public void createJobObject(){
            job1 = new Job();
            job2 = new Job();
            test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            test_job3 =new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }

     */

    @Test
    public void testJobConstructorSetsAllFields(){
        test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence") );

        assertTrue(test_job1.getId() > 0);
        assertEquals("Product tester", test_job1.getName());
        assertEquals("ACME", test_job1.getEmployer().getValue());
        assertTrue(test_job1.getEmployer() instanceof Employer);
        assertEquals("Desert", test_job1.getLocation().getValue());
        assertTrue(test_job1.getLocation() instanceof Location);
        assertEquals("Quality control", test_job1.getPositionType().getValue());
        assertTrue(test_job1.getPositionType() instanceof PositionType);
        assertEquals("Persistence", test_job1.getCoreCompetency().getValue());
        assertTrue(test_job1.getCoreCompetency() instanceof CoreCompetency);


    }
/*
    @Test
    public void testPositionTypeEqualsMethod() {
        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence") );
        assertTrue(test_job4.getPositionType() instanceof PositionType);

        assertEquals("Quality control", test_job4.getPositionType().getValue());
    }

 */

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertFalse(job1.getId() == job2.getId());
        assertEquals(1, job1.getId());
        assertEquals(2, job2.getId());
    }
/*
    @Test
    public void idFieldsDifferByOne(){ assertTrue(job2.getId()-job1.getId()==1);}

    @Test
    public void nameFieldSet(){assertTrue(test_job1.getName()=="Product tester");}

    @Test
    public void employerFieldSet(){assertTrue(test_job1.getEmployer() instanceof Employer);}

    @Test
    public void locationFieldSet(){assertTrue(test_job1.getLocation() instanceof Location);}

    @Test
    public void testPositionTypeEqualsMethod(){
        assertTrue(test_job1.getPositionType() instanceof PositionType);
        assertEquals("Quality control", test_job1.getPositionType().getValue());
    }

    @Test
    public void  coreCompetencySet(){
        assertTrue(test_job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_job1.getCoreCompetency().getValue());
    }

 */

    @Test
    public void testJobsForEquality(){
        test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job2.equals(test_job3));
    }
/*
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\n\n",test_job2.toString() );
    }
    */
@Test
public void testToStringContainsCorrectLabelsAndData() {
    Job testJob4 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals("\nID: " + testJob4.getId() + "\nName: Product Tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n" , testJob4.toString());
}

    /*
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        assertEquals("\n" + "ID: 3\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n",test_job1.toString());
    }

     */

    @Test
    public void testToStringHandlesEmptyField(){
        Job test_job4 = new Job("Product Tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        assertEquals("\n" + "ID: 5\n" +
                "Name: Data not available\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available\n",test_job4.toString());
    }


    @Test
    public void testToStringStartsAndEndsWithNewLine(){

        Job test_job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence") );

        assertEquals('\n', test_job5.toString().charAt(0));
        assertEquals('\n', test_job5.toString().charAt(test_job5.toString().length() -1));

    }


}
