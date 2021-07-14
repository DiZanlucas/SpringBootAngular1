package com.example.demo.service;

import com.example.demo.repository.MyRepository;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        MyRepository repositoryCliente = new MyRepository();
        repositoryCliente.salvarCliente(cliente);

    }
    public void validarCliente(Cliente cliente){

    }
}
