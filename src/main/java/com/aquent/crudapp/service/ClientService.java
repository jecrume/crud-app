package com.aquent.crudapp.service;

import com.aquent.crudapp.model.Client;
import com.aquent.crudapp.model.Person;
import com.aquent.crudapp.repository.ClientDAO;
import com.aquent.crudapp.repository.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientService {

    @Autowired
    private ClientDAO clientDAO;

    private final PersonDao personDao;

    public ClientService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public Long createClient(Client client) {return clientDAO.save(client).getClientId();}

    public void updateClient(Long id, Client client) {
        Client existingClient = clientDAO.findByID(id);
        existingClient.setCompanyName(client.getCompanyName());
        existingClient.setCompanyMailingAddress(client.getCompanyMailingAddress());
        existingClient.setCompanyPhoneNumber(client.getCompanyPhoneNumber());
        existingClient.setCompanyWebsiteUri(client.getCompanyWebsiteUri());
        existingClient.setCompanyPhysicalAddress(client.getCompanyPhysicalAddress());
        clientDAO.save(existingClient);}

    public void deleteClient(Client client){ clientDAO.delete(client);}

    public Client readClient(Long id){return clientDAO.findByID(id);}

    public void removeClientContact(Client client){


    }

    public void deleteClientContact(Person contact){
        contact.setClient(null);

        personDao.updatePerson();
    }

    public ArrayList<Person> getClientContactList(Long id){
        Client client = clientDAO.findByID(id);

        return client.getContacts();

    }






}
