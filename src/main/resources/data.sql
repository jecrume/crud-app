INSERT INTO client (
    company_name,
    website_url,
    phone_number,
    mailing_address,
    physical_address
) VALUES(
            'Google',
            'www.google.com',
            '1111111111',
            '123 Google Rd.',
            '123 Google Rd.'
        ), (
            'Apple',
            'www.apple.com',
            '1234567890',
            '1234 Apple Way Rd.',
            '1234 Cupertino Bld.'
        );

INSERT INTO person (
    first_name,
    last_name,
    email_address,
    street_address,
    city,
    state,
    zip_code,
    client_id
) VALUES (
    'John',
    'Smith',
    'fake1@aquent.com',
    '123 Any St.',
    'Asheville',
    'NC',
    '28801',
    '1'
), (
    'Jane',
    'Smith',
    'fake2@aquent.com',
    '123 Any St.',
    'Asheville',
    'NC',
    '28801',
    '2'
);

