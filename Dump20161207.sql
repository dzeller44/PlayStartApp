CREATE DATABASE  IF NOT EXISTS `app` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `app`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: app
-- ------------------------------------------------------
-- Server version	5.7.15-log

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
-- Table structure for table `audit_log`
--

DROP TABLE IF EXISTS `audit_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `audit_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `context` varchar(255) DEFAULT NULL,
  `screen` varchar(255) DEFAULT NULL,
  `field` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  `host` varchar(255) DEFAULT NULL,
  `created` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `audit_log`
--

LOCK TABLES `audit_log` WRITE;
/*!40000 ALTER TABLE `audit_log` DISABLE KEYS */;
INSERT INTO `audit_log` VALUES (1,'John Doe','jdoe@google.com','1','Login','validate()','User authenticated','John Doe','0:0:0:0:0:0:0:1','/auth','localhost:9000','2016-12-07 08:59:04.283000'),(2,'John Doe','jdoe@google.com','1','Profile','saveProfile()','New Profile created and saved','John Doe','0:0:0:0:0:0:0:1','/addprofile','localhost:9000','2016-12-07 08:59:55.273000');
/*!40000 ALTER TABLE `audit_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `play_evolutions`
--

DROP TABLE IF EXISTS `play_evolutions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `play_evolutions` (
  `id` int(11) NOT NULL,
  `hash` varchar(255) NOT NULL,
  `applied_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `apply_script` mediumtext,
  `revert_script` mediumtext,
  `state` varchar(255) DEFAULT NULL,
  `last_problem` mediumtext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `play_evolutions`
--

LOCK TABLES `play_evolutions` WRITE;
/*!40000 ALTER TABLE `play_evolutions` DISABLE KEYS */;
INSERT INTO `play_evolutions` VALUES (1,'97d530ce54958b10a25ab34f5e3e51df982b4182','2016-12-07 15:54:58','create table audit_log (\nid                        integer auto_increment not null,\nuser_id                   varchar(255),\nemail                     varchar(255),\nrole                      varchar(255),\ncontext                   varchar(255),\nscreen                    varchar(255),\nfield                     varchar(255),\nvalue                     varchar(255),\nip                        varchar(255),\npath                      varchar(255),\nhost                      varchar(255),\ncreated                   datetime(6),\nconstraint pk_audit_log primary key (id))\n;\n\ncreate table profile (\nid                        bigint auto_increment not null,\nname                      varchar(255),\naddress                   varchar(255),\naddress1                  varchar(255),\ncity                      varchar(255),\nstate                     varchar(255),\nzip                       varchar(255),\ncountry                   varchar(255),\ncounty                    varchar(255),\nbillname                  varchar(255),\nbilladdress               varchar(255),\nbilladdress1              varchar(255),\nbillcity                  varchar(255),\nbillstate                 varchar(255),\nbillzip                   varchar(255),\nbillcountry               varchar(255),\nbillcounty                varchar(255),\nprimary_name_first        varchar(255),\nprimary_name_last         varchar(255),\nprimary_phone             varchar(255),\nprimary_email             varchar(255),\nsecondary_name_first      varchar(255),\nsecondary_name_last       varchar(255),\nsecondary_phone           varchar(255),\nsecondary_email           varchar(255),\nservices                  varchar(255),\nservices_other            varchar(255),\ndate_creation             datetime(6),\nprofilekey                varchar(255),\nuserkey                   varchar(255),\nupdated_by                varchar(255),\ndate_updated              datetime(6),\ndate_remind               datetime(6),\nconstraint pk_profile primary key (id))\n;\n\ncreate table removed_profile (\nid                        bigint auto_increment not null,\nname                      varchar(255),\naddress                   varchar(255),\naddress1                  varchar(255),\ncity                      varchar(255),\nstate                     varchar(255),\nzip                       varchar(255),\ncounty                    varchar(255),\nbillname                  varchar(255),\nbilladdress               varchar(255),\nbilladdress1              varchar(255),\nbillcity                  varchar(255),\nbillstate                 varchar(255),\nbillzip                   varchar(255),\nbillcountry               varchar(255),\nbillcounty                varchar(255),\nprimary_name_first        varchar(255),\nprimary_name_last         varchar(255),\nprimary_phone             varchar(255),\nprimary_email             varchar(255),\nsecondary_name_first      varchar(255),\nsecondary_name_last       varchar(255),\nsecondary_phone           varchar(255),\nsecondary_email           varchar(255),\nservices                  varchar(255),\nservices_other            varchar(255),\ndate_creation             datetime(6),\nprofilekey                varchar(255),\nuserkey                   varchar(255),\nupdated_by                varchar(255),\ndate_updated              datetime(6),\nremoved_by                varchar(255),\ndate_removed              datetime(6),\nconstraint pk_removed_profile primary key (id))\n;\n\ncreate table removed_user (\nid                        bigint auto_increment not null,\nemail                     varchar(255),\nfullname                  varchar(255),\nagency                    varchar(255),\nconfirmation_token        varchar(255),\npassword_hash             varchar(255),\ndate_creation             datetime(6),\nvalidated                 tinyint(1) default 0,\nrole                      integer,\napproved                  varchar(255),\nactive                    varchar(255),\nuserkey                   varchar(255),\nupdated_by                varchar(255),\ndate_updated              datetime(6),\nremoved_by                varchar(255),\ndate_removed              datetime(6),\nconstraint ck_removed_user_role check (role in (\'0\',\'2\',\'3\',\'1\')),\nconstraint uq_removed_user_email unique (email),\nconstraint uq_removed_user_fullname unique (fullname),\nconstraint pk_removed_user primary key (id))\n;\n\ncreate table service (\nid                        bigint auto_increment not null,\nname                      varchar(255),\nshortname                 varchar(255),\ncomment                   varchar(255),\nconstraint pk_service primary key (id))\n;\n\ncreate table session (\nid                        integer auto_increment not null,\nhash                      varchar(255),\nuser_id                   varchar(255),\nemail                     varchar(255),\nexpiration_date           datetime(6),\ndata                      varchar(255),\nuserkey                   varchar(255),\nconstraint pk_session primary key (id))\n;\n\ncreate table token (\ntoken                     varchar(255) not null,\nuser_id                   bigint,\ntype                      varchar(8),\ndate_creation             datetime(6),\nemail                     varchar(255),\nconstraint ck_token_type check (type in (\'password\',\'email\',\'admin\')),\nconstraint pk_token primary key (token))\n;\n\ncreate table user (\nid                        bigint auto_increment not null,\nemail                     varchar(255),\nfullname                  varchar(255),\nagency                    varchar(255),\nconfirmation_token        varchar(255),\npassword_hash             varchar(255),\ndate_creation             datetime(6),\ndate_password_remind      datetime(6),\ndate_remind               datetime(6),\nvalidated                 tinyint(1) default 0,\nrole                      integer,\napproved                  varchar(255),\nactive                    varchar(255),\nuserkey                   varchar(255),\nupdated_by                varchar(255),\ndate_updated              datetime(6),\nconstraint ck_user_role check (role in (\'0\',\'2\',\'3\',\'1\')),\nconstraint uq_user_email unique (email),\nconstraint uq_user_fullname unique (fullname),\nconstraint pk_user primary key (id))\n;','SET FOREIGN_KEY_CHECKS=0;\n\ndrop table audit_log;\n\ndrop table profile;\n\ndrop table removed_profile;\n\ndrop table removed_user;\n\ndrop table service;\n\ndrop table session;\n\ndrop table token;\n\ndrop table user;\n\nSET FOREIGN_KEY_CHECKS=1;','applied','');
/*!40000 ALTER TABLE `play_evolutions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profile`
--

DROP TABLE IF EXISTS `profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profile` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `address1` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `zip` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `county` varchar(255) DEFAULT NULL,
  `billname` varchar(255) DEFAULT NULL,
  `billaddress` varchar(255) DEFAULT NULL,
  `billaddress1` varchar(255) DEFAULT NULL,
  `billcity` varchar(255) DEFAULT NULL,
  `billstate` varchar(255) DEFAULT NULL,
  `billzip` varchar(255) DEFAULT NULL,
  `billcountry` varchar(255) DEFAULT NULL,
  `billcounty` varchar(255) DEFAULT NULL,
  `primary_name_first` varchar(255) DEFAULT NULL,
  `primary_name_last` varchar(255) DEFAULT NULL,
  `primary_phone` varchar(255) DEFAULT NULL,
  `primary_email` varchar(255) DEFAULT NULL,
  `secondary_name_first` varchar(255) DEFAULT NULL,
  `secondary_name_last` varchar(255) DEFAULT NULL,
  `secondary_phone` varchar(255) DEFAULT NULL,
  `secondary_email` varchar(255) DEFAULT NULL,
  `services` varchar(255) DEFAULT NULL,
  `services_other` varchar(255) DEFAULT NULL,
  `date_creation` datetime(6) DEFAULT NULL,
  `profilekey` varchar(255) DEFAULT NULL,
  `userkey` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `date_updated` datetime(6) DEFAULT NULL,
  `date_remind` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profile`
--

LOCK TABLES `profile` WRITE;
/*!40000 ALTER TABLE `profile` DISABLE KEYS */;
INSERT INTO `profile` VALUES (1,'Bobs Dumpsters','8457 First Ave.','','Denver','CO','80203','United States','Clear Creek','Bob\'s Dumpsters','29874 Any Street','','Denver','CO','80206','United States','Adams','Bill','Williams','3035551212','bw@google.com','John','Doe','3035551212','jdoe@google.com','Dumpsters,Showers,Generators,Pumps',NULL,NULL,'ff461c923781496fadccc0aa2086e610','123456',NULL,NULL,NULL),(2,'Acme','45534 Any Street','','Denver','CO','80213','United States','Broomfield','Acme','989 Second Ave.','','Denver','CO','80206','United States','Kiowa','John','Jackson','3035551212','jj@google.com','Jane','Doe','3035551212','janedoe@google.com','Showers,Pumps,Sandbags',NULL,NULL,'987fad6tsGHIU89YRAIHGBFJD','123456',NULL,NULL,NULL),(3,'Widgets','549 Elm Street','','Denver','CO','80234','United States','Douglas','Widgets','13768 Third Ave.','','Denver','CO','80205','United States','Jackson','Pete','Mitchell','3035551212','pm@google.com','Mike','Smith','3035551212','ms@google.com','Water Bulk,Fuel,Professional Services',NULL,NULL,'31241243123413','123456',NULL,NULL,NULL),(4,'My Company','8959 My Street','','Denver','CO','80206','United States','Denver','My Company','3245 Ohio Ave.','','Denver','CO','80207','United States','Washington','Mark','Hanson','3035551212','mh@google.com','Sheila','Johnson','3035551212','sj@google.com','Water Bottled,Showers,Temporary Facilities',NULL,NULL,'2547647245652465','222222',NULL,NULL,NULL),(5,'Showers R Us','6544 Cleveland Drive','','Denver','CO','80204','United States','Douglas','Showers R Us','6544 Cleveland Drive','','Denver','CO','80204','United States','Douglas','Hank','Shelton','3037777777','hank@google.com','Kevin','Johnson','3038886565','kevin@google.com','Showers','',NULL,'833240860512492791cabfefbf2d10d8','123456',NULL,NULL,NULL),(6,'Test','6544 Cleveland Drive','6544 Cleveland Drive','Denver','CO','80204','United States','Bent','Test This','8457 First Ave.','8457 First Ave.','Denver','CO','80203','United States','Dolores','John','Doe','3035551212','jdoe@google.com','John','Doe','3035551212','jdoe@google.com','Dumpsters,Showers,Sandbags','TEST OTHER','2016-12-07 08:59:55.261000','b0d1bebfb4ed40c2be5a12894974ea5e','123456',NULL,NULL,'2017-06-07 08:59:55.267000');
/*!40000 ALTER TABLE `profile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `removed_profile`
--

DROP TABLE IF EXISTS `removed_profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `removed_profile` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `address1` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `zip` varchar(255) DEFAULT NULL,
  `county` varchar(255) DEFAULT NULL,
  `billname` varchar(255) DEFAULT NULL,
  `billaddress` varchar(255) DEFAULT NULL,
  `billaddress1` varchar(255) DEFAULT NULL,
  `billcity` varchar(255) DEFAULT NULL,
  `billstate` varchar(255) DEFAULT NULL,
  `billzip` varchar(255) DEFAULT NULL,
  `billcountry` varchar(255) DEFAULT NULL,
  `billcounty` varchar(255) DEFAULT NULL,
  `primary_name_first` varchar(255) DEFAULT NULL,
  `primary_name_last` varchar(255) DEFAULT NULL,
  `primary_phone` varchar(255) DEFAULT NULL,
  `primary_email` varchar(255) DEFAULT NULL,
  `secondary_name_first` varchar(255) DEFAULT NULL,
  `secondary_name_last` varchar(255) DEFAULT NULL,
  `secondary_phone` varchar(255) DEFAULT NULL,
  `secondary_email` varchar(255) DEFAULT NULL,
  `services` varchar(255) DEFAULT NULL,
  `services_other` varchar(255) DEFAULT NULL,
  `date_creation` datetime(6) DEFAULT NULL,
  `profilekey` varchar(255) DEFAULT NULL,
  `userkey` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `date_updated` datetime(6) DEFAULT NULL,
  `removed_by` varchar(255) DEFAULT NULL,
  `date_removed` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `removed_profile`
--

LOCK TABLES `removed_profile` WRITE;
/*!40000 ALTER TABLE `removed_profile` DISABLE KEYS */;
/*!40000 ALTER TABLE `removed_profile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `removed_user`
--

DROP TABLE IF EXISTS `removed_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `removed_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `agency` varchar(255) DEFAULT NULL,
  `confirmation_token` varchar(255) DEFAULT NULL,
  `password_hash` varchar(255) DEFAULT NULL,
  `date_creation` datetime(6) DEFAULT NULL,
  `validated` tinyint(1) DEFAULT '0',
  `role` int(11) DEFAULT NULL,
  `approved` varchar(255) DEFAULT NULL,
  `active` varchar(255) DEFAULT NULL,
  `userkey` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `date_updated` datetime(6) DEFAULT NULL,
  `removed_by` varchar(255) DEFAULT NULL,
  `date_removed` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uq_removed_user_email` (`email`),
  UNIQUE KEY `uq_removed_user_fullname` (`fullname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `removed_user`
--

LOCK TABLES `removed_user` WRITE;
/*!40000 ALTER TABLE `removed_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `removed_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `service` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `shortname` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES (1,'Water Bottled','Water Bottled',''),(2,'Water Bulk','Water Bulk',''),(3,'Sanitation/Toilet/Sink','Sanitation/Toilet/Sink',''),(4,'Dumpsters','Dumpsters',''),(5,'Showers','Showers',''),(6,'Generators','Generators',''),(7,'Pumps','Pumps',''),(8,'Heavy Equipment','Heavy Equipment',''),(9,'Fuel','Fuel',''),(10,'Sandbags','Sandbags',''),(11,'Temporary Facilities','Temporary Facilities',''),(12,'Professional Services','Professional Services',''),(13,'Other','Other','');
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `session`
--

DROP TABLE IF EXISTS `session`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `session` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hash` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `expiration_date` datetime(6) DEFAULT NULL,
  `data` varchar(255) DEFAULT NULL,
  `userkey` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `session`
--

LOCK TABLES `session` WRITE;
/*!40000 ALTER TABLE `session` DISABLE KEYS */;
INSERT INTO `session` VALUES (1,'lmj7k9968lrlplccu52hi0kmr7','John Doe','jdoe@google.com','2016-12-07 08:59:04.204000',NULL,'123456');
/*!40000 ALTER TABLE `session` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `token` varchar(255) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `type` varchar(8) DEFAULT NULL,
  `date_creation` datetime(6) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`token`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `agency` varchar(255) DEFAULT NULL,
  `confirmation_token` varchar(255) DEFAULT NULL,
  `password_hash` varchar(255) DEFAULT NULL,
  `date_creation` datetime(6) DEFAULT NULL,
  `date_password_remind` datetime(6) DEFAULT NULL,
  `date_remind` datetime(6) DEFAULT NULL,
  `validated` tinyint(1) DEFAULT '0',
  `role` int(11) DEFAULT NULL,
  `approved` varchar(255) DEFAULT NULL,
  `active` varchar(255) DEFAULT NULL,
  `userkey` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `date_updated` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uq_user_email` (`email`),
  UNIQUE KEY `uq_user_fullname` (`fullname`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'jdoe@google.com','John Doe','','','$2a$10$2W044vxfKI3v2FEWNZ53KO7VWDzpTcw/dkqmSH4jqiJ1bCEby5rP6',NULL,NULL,NULL,1,1,NULL,'Y','123456',NULL,NULL),(2,'dan.zeller@state.co.us','Dan Zeller','','','$2a$10$2W044vxfKI3v2FEWNZ53KO7VWDzpTcw/dkqmSH4jqiJ1bCEby5rP6',NULL,NULL,NULL,1,3,NULL,'Y','ABCDEF',NULL,NULL),(3,'bob@google.com','Bob Johnson','','','$2a$10$2W044vxfKI3v2FEWNZ53KO7VWDzpTcw/dkqmSH4jqiJ1bCEby5rP6',NULL,NULL,NULL,1,2,NULL,'Y','111111',NULL,NULL),(4,'jane@google.com','Jane Doe','','','$2a$10$2W044vxfKI3v2FEWNZ53KO7VWDzpTcw/dkqmSH4jqiJ1bCEby5rP6',NULL,NULL,NULL,1,1,NULL,'Y','222222',NULL,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-07  9:08:11
