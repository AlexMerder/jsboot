-- Users
INSERT INTO users VALUES
(1,12,'leslie@luv2code.com','Andrews','$2a$10$yTnrThU8bAirB2CIt7lFwekVcD.qNz5gWsGJfz9b26IwUfcHNTl5e','Leslie'),
(2,43,'emma@luv2code.com','Baumgarten','$2a$10$yTnrThU8bAirB2CIt7lFwekVcD.qNz5gWsGJfz9b26IwUfcHNTl5e','Emma'),
(3,33,'avani@luv2code.com','Gupta','$2a$10$yTnrThU8bAirB2CIt7lFwekVcD.qNz5gWsGJfz9b26IwUfcHNTl5e','Avani'),
(4,23,'yuri@luv2code.com','Petrov','$2a$10$yTnrThU8bAirB2CIt7lFwekVcD.qNz5gWsGJfz9b26IwUfcHNTl5e','Yuri'),
(5,42,'juan@luv2code.com','Vega','$2a$10$yTnrThU8bAirB2CIt7lFwekVcD.qNz5gWsGJfz9b26IwUfcHNTl5e','Juan');

--Roles
insert into roles values (1,'ROLE_ADMIN');
insert into roles values (2,'ROLE_USER');

--Users_Roles
insert into users_roles values (1,1);
insert into users_roles values (1,2);
insert into users_roles values (2,1);
insert into users_roles values (3,2);
insert into users_roles values (4,1);
insert into users_roles values (5,1);
insert into users_roles values (5,2);