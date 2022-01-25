--Create database ERSDB;
Create table if not exists ERS_REIMBURSEMENT_STATUS (
REIMB_Status_Id SERIAL PRIMARY KEY,
REIMB_Status VARCHAR(10) NOT NULL );

--DROP TABLE ERS_REIMBURSEMENT_STATUS, ERS_REIMBURSEMENT_TYPE, ERS_USER_ROLES, ERS_USERS,ERS_Reimbursement;

INSERT INTO ERS_REIMBURSEMENT_STATUS(REIMB_Status)
VALUES ('PENDING'), ('APPROVED'), ('DENIED');

Create table if not exists ERS_REIMBURSEMENT_TYPE (
REIMB_Type_Id SERIAL primary key ,
REIMB_Type VARCHAR(10) NOT NULL );

INSERT INTO ERS_REIMBURSEMENT_TYPE(reimb_type)
VALUES ('LODGING'), ('TRAVEL'), ('FOOD'), ('OTHER');


Create table if not exists ERS_USER_ROLES (
ERS_USER_ROLE_ID SERIAL primary key ,
ERS_USER_ROLE VARCHAR(10) NOT null);

INSERT INTO ERS_USER_ROLES(ers_user_role)
VALUES ('EMPLOYEE'), ('MANAGER');

Create table if not exists ERS_USERS (
ERS_Users_Id SERIAL primary key ,
ERS_Username Varchar(50) UNIQUE NOT NULL,
ERS_Password Varchar(50) NOT NULL,
ERS_FirstName Varchar(100) NOT NULL,
ERS_LastName Varchar(100) NOT NULL,
ERS_Email Varchar(100) UNIQUE NOT NULL,
User_Role_Id  int NOT NULL references ERS_User_Roles(ERS_User_Role_Id ) ON DELETE CASCADE );

Create table if not exists ERS_Reimbursement (
REIMB_Id int primary key,
REIMB_Amount int NOT NULL,
REIMB_Submitted timestamp NOT NULL,
REIMB_Resolved timestamp,
REIMB_Description varchar(250),
REIMB_Receipt bytea,
REIMB_Author int NOT NULL REFERENCES ERS_User_Roles (ERS_USER_ROLE_ID) ON DELETE CASCADE ,
REIMB_Resolver int REFERENCES ERS_User_Roles (ERS_USER_ROLE_ID) ON DELETE CASCADE ,
REIMB_Status_Id int NOT NULL REFERENCES  ERS_REIMBURSEMENT_STATUS (REIMB_Status_Id ) ON DELETE CASCADE ,
REIMB_Type_Id int NOT NULL REFERENCES ERS_REIMBURSEMENT_Type ( REIMB_Type_Id) ON DELETE CASCADE
) 