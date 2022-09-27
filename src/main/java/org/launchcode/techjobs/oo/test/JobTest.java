package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId () {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);

    }

    @Test
    public void testJobConstructorSetsAllFields () {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job1.getName() instanceof String);
        assertEquals(job1.getName(), "Product tester");
        assertTrue(job1.getEmployer() instanceof Employer);
        assertEquals(job1.getEmployer().toString(), "ACME");
        assertTrue(job1.getLocation() instanceof Location);
        assertEquals(job1.getLocation().toString(), "Desert");
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertEquals(job1.getPositionType().toString(), "Quality control");
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job1.getCoreCompetency().toString(), "Persistence");
    }

    @Test
    public void testJobsForEquality () {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void  testToStringStartsAndEndsWithNewLine () {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job1.toString().charAt(0), '\n');
        assertEquals(job1.toString().charAt(job1.toString().length() - 1), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData () {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = job1.toString();
        assertTrue(jobString.contains("ID: "+ job1.getId() + "\n"));
        assertTrue(jobString.contains("Name: "+ job1.getName() + "\n"));
        assertTrue(jobString.contains("Employer: "+ job1.getEmployer() + "\n"));
        assertTrue(jobString.contains("Location: "+ job1.getLocation() + "\n"));
        assertTrue(jobString.contains("Position Type: "+ job1.getPositionType() + "\n"));
        assertTrue(jobString.contains("Core Competency: "+ job1.getCoreCompetency() + "\n"));
    }

    @Test
    public void testToStringHandlesEmptyField () {
        Job job1 = new Job();
        String jobString = job1.toString();
        assertTrue(jobString.contains("ID: "+ job1.getId() + "\n"));
        assertTrue(jobString.contains("Name: Data not available\n"));
        assertTrue(jobString.contains("Employer: Data not available\n"));
        assertTrue(jobString.contains("Location: Data not available\n"));
        assertTrue(jobString.contains("Position Type: Data not available\n"));
        assertTrue(jobString.contains("Core Competency: Data not available\n"));

    }
}
