CREATE TABLE person (
    person_id integer IDENTITY,
    first_name varchar(50) NOT NULL,
    last_name varchar(50) NOT NULL,
    email_address varchar(50) NOT NULL,
    street_address varchar(50) NOT NULL,
    city varchar(50) NOT NULL,
    state varchar(2) NOT NULL,
    zip_code varchar(5) NOT NULL,
    client_id integer,
    foreign key (client_id) references client(id)
);
CREATE TABLE client (
    id integer IDENTITY,
    company_name varchar(50) NOT NULL,
    website_url varchar(55) NOT NULL,
    phone_number varchar(10) NOT NULL,
    mailing_address varchar(255) NOT NULL,
    physical_address varchar(255) NOT NULL
);
