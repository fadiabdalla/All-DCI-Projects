DROP DATABASE IF EXISTS  `hospital`;

CREATE DATABASE `hospital`;

USE hospital;
DROP TABLE IF EXISTS `patient`;

CREATE TABLE `patient`
(
    `patient_id` INT NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(45),
    `last_name`  VARCHAR(45),
    `address`    VARCHAR(100),
    PRIMARY KEY (`patient_id`)
)
    ENGINE=InnoDB AUTO_INCREMENT=1
    DEFAULT CHARSET=latin1;


