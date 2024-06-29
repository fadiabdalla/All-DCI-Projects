CREATE DATABASE  IF NOT EXISTS `customer_directory`;
USE `customer_directory`;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `customer`
--

INSERT INTO `customer` VALUES 
	(1,'Andrew','Deyes','andrew@example.com'),
	(2,'Bob','Ortega','carlo@example.com'),
	(3,'Simona','Panshina','simona@example.com'),
	(4,'Elton','Petrov','elton@example.com'),
	(5,'Mary','Johnson','mary@example.com');

