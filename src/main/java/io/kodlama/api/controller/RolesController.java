package io.kodlama.api.controller;

import io.kodlama.business.RoleService;
import io.kodlama.dto.role.CreateRoleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/role")
public class RolesController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/create")
    public void create(@RequestBody CreateRoleRequest request) {
        roleService.create(request);
    }
}
