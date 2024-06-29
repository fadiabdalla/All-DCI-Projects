CREATE DATABASE  IF NOT EXISTS `library`;
USE `library`;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(255) NOT NULL,
  `author` VARCHAR(255) NOT NULL,
  `ISBN` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `customer`
--

INSERT INTO `Book` (`title`, `author`, `ISBN`)
VALUES 
  ('To Kill a Mockingbird', 'Harper Lee', '9780061120084'),
  ('1984', 'George Orwell', '9780451524935'),
  ('The Great Gatsby', 'F. Scott Fitzgerald', '9780743273565'),
  ('Pride and Prejudice', 'Jane Austen', '9780141439518'),
  ('The Catcher in the Rye', 'J.D. Salinger', '9780316769488');
