package com.soaint.fogacoop.repository.implementador.impl;

import com.soaint.fogacoop.domain.model.entities.Implementador;
import com.soaint.fogacoop.repository.implementador.ImplementadorRepository;
import com.soaint.fogacoop.repository.implementador.ImplementadorRepositoryFacade;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Log4j2
@Component
public class ImplementadorRepositoryFacadeImpl implements ImplementadorRepositoryFacade {

    private ImplementadorRepository repository;

    @Autowired
    public ImplementadorRepositoryFacadeImpl(ImplementadorRepository repository) {
        this.repository = repository;
    }

    @Override
    public Implementador createImplementador(Implementador implementador) {
        log.info("Persistiendo Implementador: {}", implementador.toString());
        return repository.save(implementador);
    }

    @Override
    public Implementador updateImplementador(Implementador implementador) throws Exception {
        Optional<Implementador> impl = repository.findById(implementador.getId());
        if(impl.isPresent()){
            Implementador implementFound = impl.get();
            implementFound.setCargo("Implementador Junior");
            implementFound.setFechaUltimoCargo(LocalDate.now());
            return repository.save(implementFound);
        }
        throw new Exception("No existe el persona.");
    }

    @Override
    public Implementador findImplementadorById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public Implementador removeImplementadorById(Integer id) {
        repository.delete(repository.findById(id).get());
        return new Implementador();
    }

    @Override
    public List<Implementador> findAllImplementadores() {
        return repository.findAll();
    }
}
