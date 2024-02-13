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


    private ClientDAO clientDAO;

    private final PersonDao personDao;

    public ClientService(PersonDao personDao, ClientDAO clientDAO) {
        this.personDao = personDao;
        this.clientDAO = clientDAO;
    }

    public Integer createClient(Client client) {return clientDAO.save(client).getId();}

    public void updateClient(Integer id, Client client) {
        Client existingClient = clientDAO.findById(id);
        existingClient.setCompanyName(client.getCompanyName());
        existingClient.setCompanyMailingAddress(client.getCompanyMailingAddress());
        existingClient.setCompanyPhoneNumber(client.getCompanyPhoneNumber());
        existingClient.setCompanyWebsiteUri(client.getCompanyWebsiteUri());
        existingClient.setCompanyPhysicalAddress(client.getCompanyPhysicalAddress());
        clientDAO.save(existingClient);}

    public void deleteClient(Client client){ clientDAO.delete(client);}

    public Client readClient(Integer id){return clientDAO.findById(id);}

    public void removeClientContact(Client client){


    }

    public void deleteClientContact(Person contact){
        contact.setClient(null);

        //personDao.updatePerson();
    }

    public ArrayList<Person> getClientContactList(Integer id){
        Client client = clientDAO.findById(id);

        return client.getContacts();

    }






}
