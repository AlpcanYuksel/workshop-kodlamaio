package io.kodlama.business;

import io.kodlama.core.utilities.config.mappers.ModelMapperService;
import io.kodlama.dataAccess.RoleRepository;
import io.kodlama.dto.role.CreateRoleRequest;
import io.kodlama.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private ModelMapperService modelMapper;


    public void create(CreateRoleRequest request) {
        Role role = modelMapper.forRequest().map(request,Role.class);
        roleRepository.save(role);
    }
}
