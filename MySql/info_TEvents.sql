-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: localhost    Database: info
-- ------------------------------------------------------
-- Server version	5.7.17-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `TEvents`
--

DROP TABLE IF EXISTS `TEvents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TEvents` (
  `idTEvents` int(11) NOT NULL AUTO_INCREMENT,
  `EventName` varchar(255) DEFAULT NULL,
  `InfoEvent` text,
  `ImageEvent` varchar(255) DEFAULT NULL,
  `idLocation` int(11) DEFAULT NULL,
  `idSells` int(11) DEFAULT NULL,
  `idGroup` int(11) DEFAULT NULL,
  `DateEvents` datetime DEFAULT NULL,
  PRIMARY KEY (`idTEvents`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TEvents`
--

LOCK TABLES `TEvents` WRITE;
/*!40000 ALTER TABLE `TEvents` DISABLE KEYS */;
INSERT INTO `TEvents` VALUES (1,'Спорт зал','Сегодня я иду в спортзал кто со мной?',NULL,1,1,1,'2010-02-20 16:00:00'),(2,'Спорт зал','Сегодня я иду в спортзал кто со мной?','?',1,1,1,'2010-02-20 16:00:00'),(3,'Sport Run','Tell me, what you what?','\\\\limgg\\d$\\t.img',12,1,1,'2017-03-29 10:24:00'),(6,'Sport Run','Tell me, what you what?','\\\\limgg\\d$\\t.img',12,1,1,'2017-03-29 10:24:00'),(8,'FDSFDS','SDFDSFDS','GHJHGJNG',21,10,2,'2017-03-09 09:29:00'),(9,'мать','крыть','Мор в пути',1,1,1,'2017-03-21 00:00:00'),(10,'ывавыа','авыавыа','',1,1,1,'2017-03-08 00:00:00'),(11,'ывавыа','авыавыа','',2,1,1,'2017-03-08 00:00:00'),(14,'Мать Изаура - Кино показ','Кино показ для пользователей Yota со скидками','\\\\localhost\\2.jpg',6,10,6,'2017-03-01 11:25:00'),(15,'Мать Изаура - Кино показ','Кино показ для пользователей Yota со скидками','\\\\localhost\\2.jpg',6,10,6,'2017-03-01 11:25:00'),(16,'Мать Изаура - Кино показ','Кино показ для пользователей Yota со скидками','\\\\localhost\\2.jpg',6,10,6,'2017-03-01 11:25:00'),(17,'Мать Изаура - Кино показ','Кино показ для пользователей Yota со скидками','\\\\localhost\\2.jpg',6,10,6,'2017-03-01 11:25:00');
/*!40000 ALTER TABLE `TEvents` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-18 14:40:49
