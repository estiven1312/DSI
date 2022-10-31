package com.hospital.projecthospital.controller;

import com.hospital.projecthospital.model.entity.Paciente;
import com.hospital.projecthospital.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @GetMapping(value = "/listar")
    public ResponseEntity<List<Paciente>> getPacientes(){
        List<Paciente> pacientes = pacienteService.findAll();
        return new ResponseEntity<>(pacientes, HttpStatus.OK);
    }

}
