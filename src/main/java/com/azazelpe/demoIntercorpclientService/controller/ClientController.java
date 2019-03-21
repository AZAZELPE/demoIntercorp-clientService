package com.azazelpe.demoIntercorpclientService.controller;

import com.azazelpe.demoIntercorpclientService.model.Client;
import com.azazelpe.demoIntercorpclientService.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @PostMapping("/creacliente")
    public Client save(@Valid @RequestBody Client client) {
        return clientRepository.save(client);
    }

}
