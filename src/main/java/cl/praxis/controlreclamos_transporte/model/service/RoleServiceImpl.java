package cl.praxis.controlreclamos_transporte.model.service;

import cl.praxis.controlreclamos_transporte.model.entities.Role;
import cl.praxis.controlreclamos_transporte.model.entities.User;
import cl.praxis.controlreclamos_transporte.model.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository repository;

    public RoleServiceImpl(RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Role> findAll() {
        return repository.findAll();
    }

    @Override
    public Role findOne(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Role findOneP(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean update(Role r) {
        Role result = repository.save(r);
        return true;
    }

    @Override
    public boolean create(Role r) {
        repository.save(r);
        return true;
    }

    @Override
    public boolean delete(int id) {
        boolean exist = repository.existsById(id);
        if(exist){
            repository.deleteById(id);
        }
        return exist;
    }
}
