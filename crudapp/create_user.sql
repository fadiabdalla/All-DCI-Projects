-- Create a new user for MySQL Connection
-- Drop user first if they exist
DROP USER if exists 'springtutorial1'@'%';
-- Create the user and grant the privileges
CREATE USER 'springtutorial'@'%'
IDENTIFIED BY 'springtutorial';
GRANT ALL PRIVILEGES ON *.* TO 'springtutorial'@'%';








