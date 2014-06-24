package com.baldy.commons.models.proper;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Mark
 *
 */
public class PersonTest {

    @Test
    public void testToString() {
        Address a = new Address();
        a.setCity("someCity");
        a.setProvince("someProvince");
        a.setStreet("someStreet");
        a.setZip("someZip");

        Name n = new Name();
        n.setGivenName("Somename");
        n.setMiddleName("Somemiddlename");
        n.setSurname("Somesurname");

        Person p = new Person();
        p.setAddress(a);
        p.setProperName(n);

        assertEquals("Somesurname, Somename Somemiddlename, someStreet, someCity, someZip someProvince", p.toString());
    }

}
