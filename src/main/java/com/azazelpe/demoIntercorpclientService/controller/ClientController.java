package com.azazelpe.demoIntercorpclientService.controller;

import com.azazelpe.demoIntercorpclientService.model.Client;
import com.azazelpe.demoIntercorpclientService.repository.ClientRepository;
import com.azazelpe.demoIntercorpclientService.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping()
public class ClientController {

    @Autowired
    ClientRepository clientRepository;
    @Autowired
    ClientService clientService;

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @PostMapping("/creacliente")
    public Client save(@Valid @RequestBody Client client) {
        Client c = clientRepository.save(client);
        clientService.postUpdateKpis();
        return c;
    }

}
