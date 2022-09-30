/*
MySQL Data Transfer
Source Host: localhost
Source Database: payment
Target Host: localhost
Target Database: payment
Date: 2022/9/30 12:03:24
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for payment
-- ----------------------------
CREATE TABLE `payment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `serial` varchar(200) CHARACTER SET utf8 DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `payment` VALUES ('1', '哈哈');
INSERT INTO `payment` VALUES ('2', '1111');
INSERT INTO `payment` VALUES ('3', '123');
INSERT INTO `payment` VALUES ('4', '333');
