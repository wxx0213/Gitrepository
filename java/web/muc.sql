/*
Navicat MySQL Data Transfer

Source Server         : Link
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : muc

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2016-11-07 14:07:48
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `tb_activity`
-- ----------------------------
DROP TABLE IF EXISTS `tb_activity`;
CREATE TABLE `tb_activity` (
  `act_id` int(30) NOT NULL AUTO_INCREMENT,
  `act_name` varchar(50) DEFAULT NULL,
  `content` longtext,
  `image_id` int(30) DEFAULT NULL,
  `build_id` int(30) DEFAULT NULL,
  `createDate` varchar(30) DEFAULT NULL,
  `attr1` datetime DEFAULT NULL,
  `attr2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`act_id`),
  KEY `build_id` (`build_id`),
  CONSTRAINT `tb_activity_ibfk_1` FOREIGN KEY (`build_id`) REFERENCES `tb_building` (`build_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_activity
-- ----------------------------
INSERT INTO `tb_activity` VALUES ('1', 'wwwwwwwwwwwww', 'wwwwwwwwwwwwwwwwwwwwwwwwwwwww', null, null, '2016-29-07 11:29:45', null, null);
INSERT INTO `tb_activity` VALUES ('2', 'wwwwwwwwwwwww', 'wwwwwwwwwwwwwwwwww', null, null, '2016-31-07 11:31:01', null, null);
INSERT INTO `tb_activity` VALUES ('3', 'sssss', 'ssssssssssssssssss', null, null, '2016-11-07  11:44:48', null, null);
INSERT INTO `tb_activity` VALUES ('4', 'ssss', 'sssssssssssssssss', null, null, '2016-11-07 11:50:49', null, null);

-- ----------------------------
-- Table structure for `tb_building`
-- ----------------------------
DROP TABLE IF EXISTS `tb_building`;
CREATE TABLE `tb_building` (
  `build_id` int(30) NOT NULL AUTO_INCREMENT,
  `build_name` varchar(50) NOT NULL,
  `location` longtext,
  `description` longtext,
  `image_id` int(100) DEFAULT NULL,
  PRIMARY KEY (`build_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_building
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_constant`
-- ----------------------------
DROP TABLE IF EXISTS `tb_constant`;
CREATE TABLE `tb_constant` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `constant` int(10) DEFAULT NULL,
  `meaning` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_constant
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_image`
-- ----------------------------
DROP TABLE IF EXISTS `tb_image`;
CREATE TABLE `tb_image` (
  `id` int(11) NOT NULL,
  `path1` varchar(255) DEFAULT NULL,
  `path2` varchar(255) DEFAULT NULL,
  `path3` varchar(255) DEFAULT NULL,
  `path4` varchar(255) DEFAULT NULL,
  `path5` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_image
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_speciality`
-- ----------------------------
DROP TABLE IF EXISTS `tb_speciality`;
CREATE TABLE `tb_speciality` (
  `id` int(30) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `type` varchar(2) DEFAULT NULL,
  `description` longtext,
  `image_id` int(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_speciality
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `type` varchar(2) DEFAULT NULL,
  `realName` varchar(10) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `sex` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', '123', '123', '0', '', '', '', '0');
INSERT INTO `tb_user` VALUES ('2', '456', '2B+cG+LgiWS/nySxXw5JAA==', '0', '345', '345', '345', '0');
INSERT INTO `tb_user` VALUES ('3', '12', 'wgrU12/pd1mqJ6DJm/9nEA==', '0', '', '', '', '0');
INSERT INTO `tb_user` VALUES ('4', '12', 'wgrU12/pd1mqJ6DJm/9nEA==', '0', '', '', '', '0');
INSERT INTO `tb_user` VALUES ('5', '12', 'wgrU12/pd1mqJ6DJm/9nEA==', '0', '', '', '', '0');
INSERT INTO `tb_user` VALUES ('6', '12', 'wgrU12/pd1mqJ6DJm/9nEA==', '0', '', '', '', '0');
INSERT INTO `tb_user` VALUES ('7', ' 23456', 'xTordRu8Du5sCCdVr9sebg==', '0', '22', '1526714234@qq.com', '13645678999', '0');
INSERT INTO `tb_user` VALUES ('8', '234567', 'DKP0iaJkj7NkRiG3dU8BvA==', '0', 'eee', 'ddddddd@126.com', '13455555555', '0');
INSERT INTO `tb_user` VALUES ('9', '123456', '3Eg+gKegvZ73HYz5c2c5JA==', '0', 'wx', '1234@126.com', '13555555555', '0');
