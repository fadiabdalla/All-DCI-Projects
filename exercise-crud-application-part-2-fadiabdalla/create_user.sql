DROP USER IF EXISTS 'crudApplication'@'%';
     CREATE USER 'crudApplication'@'%'
            IDENTIFIED BY 'crudApplication123!';
            GRANT ALL PRIVILEGES ON *.* TO 'crudApplication'@'%';
