/*
MySQL Data Transfer
Source Host: localhost
Source Database: payment
Target Host: localhost
Target Database: payment
Date: 2022/9/29 11:11:12
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for payment
-- ----------------------------
CREATE TABLE `payment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `serial` varchar(200) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records 
-- ----------------------------
