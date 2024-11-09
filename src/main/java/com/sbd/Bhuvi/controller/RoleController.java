package com.sbd.Bhuvi.controller;

import com.sbd.Bhuvi.dto.RoleDto;
import com.sbd.Bhuvi.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    //add user REST API
    @PostMapping("adduser")
    public ResponseEntity<RoleDto> createRole(@RequestBody RoleDto roleDto){
        RoleDto savedRole = roleService.createRole(roleDto);
        return new ResponseEntity<>(savedRole , HttpStatus.CREATED);
    }

    //Get user REST API
    @GetMapping("get/{id}")
    public ResponseEntity<RoleDto> getRoleById(@PathVariable("id") Long roleId){
        RoleDto roleDto = roleService.getRoleById(roleId);
        return ResponseEntity.ok(roleDto);
    }

    //Get all users REST API
    @GetMapping("AllRoles")
    public ResponseEntity<List<RoleDto>> getAllRoles(){
        List<RoleDto> roles = roleService.getAllRoles();
        return ResponseEntity.ok(roles);
    }

    //update user REST API
    @PutMapping("putuers/{id}")
    public ResponseEntity<RoleDto> updateRole(@PathVariable("id") Long roleId,
                                              @RequestBody RoleDto updatedRole){
        RoleDto roleDto = roleService.updateRole(roleId ,updatedRole);
        return ResponseEntity.ok(roleDto);
    }

    //Delete user REST API
    @DeleteMapping("Delete/{id}")
    public ResponseEntity<String> deleteRole(@PathVariable("id") Long roleId){
        roleService.deleteRole(roleId);
        return ResponseEntity.ok("role deleted successfully");
    }
}
