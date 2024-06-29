CREATE DATABASE IF NOT EXISTS `school`;
USE school;

-- Table structure for table `student`

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
`id`INT NOT NULL AUTO_INCREMENT,
`first_name`varchar(45) DEFAULT NULL,
`last_name`varchar(45) DEFAULT NULL,
`phone_nummber` BIGINT DEFAULT NULL,
PRIMARY KEY(`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1
DEFAULT CHARSET=latin1;
