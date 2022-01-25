Create database ERSDB;
Create table if not exists ERS_REIMBURSEMENT_STATUS (
REIMB_Status_Id int PRIMARY KEY,
REIMB_Status VARCHAR(10) NOT null);

Create table if not exists ERS_REIMBURSEMENT_TYPE (
REIMB_Type_Id int primary key ,
REIMB_Type VARCHAR(10) NOT null);


Create table if not exists ERS_USER_ROLES (
ERS_USER_ROLE_ID int primary key ,
ERS_USER_ROLE VARCHAR(10) NOT null);

Create table if not exists ERS_USERS (
ERS_Users_Id int primary key ,
ERS_Username Varchar(50) UNIQUE,
ERS_Password Varchar(50),
ERS_FirstName Varchar(100),
ERS_LastName Varchar(100),
ERS_Email Varchar(100) UNIQUE,
User_Role_Id  int references ERS_User_Roles(ERS_User_Role_Id ) ON DELETE CASCADE );

Create table if not exists ERS_Reimbursement (
REIMB_Id int primary key,
REIMB_Amount int,
REIMB_Submitted timestamp,
REIMB_Resolved timestamp,
REIMB_Description varchar(250),
REIMB_Receipt bytea,
REIMB_Author int REFERENCES ERS_User_Roles (ERS_USER_ROLE_ID) ON DELETE CASCADE ,
REIMB_Resolver int REFERENCES ERS_User_Roles (ERS_USER_ROLE_ID) ON DELETE CASCADE ,
REIMB_Status_Id int REFERENCES  ERS_REIMBURSEMENT_STATUS (REIMB_Status_Id ) ON DELETE CASCADE ,
REIMB_Type_Id int REFERENCES ERS_REIMBURSEMENT_Type ( REIMB_Type_Id) ON DELETE CASCADE 
) 
