package com.azazelpe.demoIntercorpclientService.service;

import com.azazelpe.demoIntercorpclientService.model.Client;
import com.azazelpe.demoIntercorpclientService.model.UpdateKpi;
import com.azazelpe.demoIntercorpclientService.repository.ClientRepository;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public void postUpdateKpis(){
        final String uri = "http://localhost:8080/api/updateKpi";
        RestTemplate restTemplate = new RestTemplate();

        List<Client> clients = clientRepository.findAll();
        UpdateKpi updateKpi = new UpdateKpi();
        List<Integer> edades = new ArrayList<>();
        updateKpi.setEdades(edades);

        for(Client c : clients) {
            edades.add(c.getEdad());
        }

        restTemplate.postForObject(uri,updateKpi,String.class);
    }

}
