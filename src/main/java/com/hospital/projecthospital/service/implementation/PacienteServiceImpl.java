package com.hospital.projecthospital.service.implementation;

import com.hospital.projecthospital.model.entity.Paciente;
import com.hospital.projecthospital.repository.PacienteRepository;
import com.hospital.projecthospital.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }
}
