CREATE DATABASE IF NOT EXISTS `employee_tracker`;
USE employee_tracker;

-- Table structure for table `employee`

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
`id`INT NOT NULL AUTO_INCREMENT,
`first_name`varchar(45) DEFAULT NULL,
`last_name`varchar(45) DEFAULT NULL,
èmail`varchar(45) DEFAULT NULL,
PRIMARY KEY(`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1
DEFAULT CHARSET=latin1;
