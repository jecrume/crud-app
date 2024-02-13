package com.aquent.crudapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "website_url")
    private String companyWebsiteUri;

    @Column(name = "phone_number")
    private String companyPhoneNumber;

    @Column(name = "mailing_address")
    private String companyMailingAddress;

    @Column(name = "physical_address")
    private String companyPhysicalAddress;

    @Transient
    private ArrayList<Person> contacts;
}
