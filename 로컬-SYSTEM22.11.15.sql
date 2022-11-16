create user food_db identified by 1234
    default tablespace users
    temporary tablespace temp;
    
grant connect, resource, dba to food_db;

commit;

