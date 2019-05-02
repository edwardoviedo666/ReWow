package com.soaint.fogacoop.service.persona.impl;

import com.soaint.fogacoop.service.persona.IGestionPersona;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@EnableJpaRepositories
@ComponentScan
@EnableAutoConfiguration
public class GestionPersonaImplTest {


    @Autowired
    private IGestionPersona persona;

    @Test
    public void registerPersona() {

    }

    @Test
    public void findPersonas() {
        persona.findPersonas().get().forEach(p -> System.out.println("Persona Registrada".concat(p.toString())));

    }

    @Test
    public void getPersonaById() {
        System.out.println(persona.getPersonaById("cualquiera").get().toString());
    }
}