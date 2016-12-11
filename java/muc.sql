/*
MySQL Data Transfer
Source Host: localhost
Source Database: muc
Target Host: localhost
Target Database: muc
Date: 2016/12/11 21:45:55
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for tb_activity
-- ----------------------------
DROP TABLE IF EXISTS `tb_activity`;
CREATE TABLE `tb_activity` (
  `act_id` int(30) NOT NULL AUTO_INCREMENT,
  `act_name` varchar(50) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `image_path` varchar(255) DEFAULT NULL,
  `build_id` int(30) DEFAULT NULL,
  `createDate` varchar(30) DEFAULT NULL,
  `attr1` datetime DEFAULT NULL,
  `attr2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`act_id`),
  KEY `build_id` (`build_id`),
  CONSTRAINT `tb_activity_ibfk_1` FOREIGN KEY (`build_id`) REFERENCES `tb_building` (`build_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_building
-- ----------------------------
DROP TABLE IF EXISTS `tb_building`;
CREATE TABLE `tb_building` (
  `build_id` int(30) NOT NULL AUTO_INCREMENT,
  `build_name` varchar(1000) NOT NULL,
  `location` varchar(1000) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `image_path` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`build_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_constant
-- ----------------------------
DROP TABLE IF EXISTS `tb_constant`;
CREATE TABLE `tb_constant` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `constant` int(10) DEFAULT NULL,
  `meaning` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_speciality
-- ----------------------------
DROP TABLE IF EXISTS `tb_speciality`;
CREATE TABLE `tb_speciality` (
  `id` int(30) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `image_path` varchar(100) DEFAULT NULL,
  `folk_id` int(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_user
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
  `sex` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `tb_activity` VALUES ('1', 'wwwwwwwwwwwww', 'wwwwwwwwwwwwwwwwwwwwwwwwwwwww', null, null, '2016-29-07 11:29:45', null, null);
INSERT INTO `tb_activity` VALUES ('2', 'wwwwwwwwwwwww', 'wwwwwwwwwwwwwwwwww', null, null, '2016-31-07 11:31:01', null, null);
INSERT INTO `tb_activity` VALUES ('3', 'sssss', 'ssssssssssssssssss', null, null, '2016-11-07  11:44:48', null, null);
INSERT INTO `tb_activity` VALUES ('4', 'ssss', 'sssssssssssssssss', null, null, '2016-11-07 11:50:49', null, null);
INSERT INTO `tb_activity` VALUES ('5', 'wwwqqq', 'ssssssssssssssssssssssssss', null, null, '2016-11-07 17:12:10', null, null);
INSERT INTO `tb_activity` VALUES ('6', null, null, null, null, '2016-11-16 22:00:58', null, null);
INSERT INTO `tb_activity` VALUES ('7', null, null, null, null, '2016-11-16 22:01:23', null, null);
INSERT INTO `tb_activity` VALUES ('8', null, null, null, null, '2016-11-16 22:04:09', null, null);
INSERT INTO `tb_activity` VALUES ('9', null, null, null, null, '2016-11-16 22:05:23', null, null);
INSERT INTO `tb_activity` VALUES ('10', null, null, null, null, '2016-11-16 22:07:19', null, null);
INSERT INTO `tb_activity` VALUES ('11', null, null, null, null, '2016-11-16 22:14:30', null, null);
INSERT INTO `tb_activity` VALUES ('12', null, null, null, null, '2016-11-16 22:16:24', null, null);
INSERT INTO `tb_activity` VALUES ('13', null, null, null, null, '2016-11-17 20:43:03', null, null);
INSERT INTO `tb_activity` VALUES ('14', null, null, null, null, '2016-11-17 21:00:06', null, null);
INSERT INTO `tb_activity` VALUES ('15', null, null, null, null, '2016-11-17 21:02:26', null, null);
INSERT INTO `tb_activity` VALUES ('16', null, null, null, null, '2016-11-17 21:18:40', null, null);
INSERT INTO `tb_building` VALUES ('1', '大礼堂', '文西路', '举办各种活动和庆祝典礼', 'E:\\Images\\db74c0cf-3fb5-4af1-b746-3405085e074f.jpg;E:\\Images\\18acb891-133d-4c58-a11b-a5d7be499ec9.jpg;');
INSERT INTO `tb_building` VALUES ('2', '理工楼', '偏僻的角落里', '信工和生环教学专用', 'E:\\Images\\c5fba2e9-8184-427b-b0c8-fd2bc976b701.jpg;E:\\Images\\2ab6fe18-931e-4fdd-98d0-bb23b545438a.jpg;E:\\Images\\9eea3622-dc77-44fc-8ac7-4b29ccec41fe.jpg;');
INSERT INTO `tb_building` VALUES ('3', '图书馆', '临近理工楼', '学习和读书的场所', 'E:\\Images\\7bb2b1ce-dad6-4643-9df8-148500414d54.jpg;E:\\Images\\368471f4-9fc1-400d-b1f3-31ecc33184dd.jpg;F:\\Images\\184d5835-bbc1-4d5b-b583-3083e2ec8ff2.jpg;E:\\Images\\070c540e-6863-4063-bb69-fa05749a0dfc.jpg;');
INSERT INTO `tb_building` VALUES ('4', '8号楼', '紧挨操场', '女生宿舍', 'E:\\Images\\4fe8b2e0-9454-4ecc-8b14-5e7dfdd48aeb.jpg;E:\\Images\\e17adbf7-9447-46fc-88ca-ccbd1330505e.jpg;E:\\Images\\38bc5eb2-1bb1-41d5-af82-988c3f5aaa56.jpg;');
INSERT INTO `tb_building` VALUES ('5', '4号楼', '小广场旁边', '校园超市', 'E:\\Images\\41042641-b255-4316-bf99-a987f82f0bbf.jpg;E:\\Images\\e513e798-4f69-4800-92be-75393f065cf2.jpg;');
INSERT INTO `tb_building` VALUES ('6', '博物馆', '靠近图书馆', '校史展览', 'E:\\Images\\d0368aad-f476-486f-9c4c-06402e6b3a1c.jpg;E:\\Images\\bc813aff-5ec6-4764-a0d9-f6ef72daf302.jpg;');
INSERT INTO `tb_building` VALUES ('7', '3号楼', '校门口', '办公地点', 'E:\\Images\\b37064b6-526b-4ba5-b6fe-f0c9126425b6.jpg;');
INSERT INTO `tb_building` VALUES ('8', 'DD', 'DDDD', 'DDDD', 'E:\\Images\\659b2688-4ea9-4c52-b11c-c6f2b6930087.jpg;E:\\Images\\5aee447b-d477-48e2-be4b-38f93eae8519.jpg;');
INSERT INTO `tb_building` VALUES ('9', '顶顶顶顶', '顶顶顶顶顶', '顶顶顶顶顶多多', 'E:\\Images\\cf955406-e1da-446b-b209-fc1d6c058d69.jpg;');
INSERT INTO `tb_speciality` VALUES ('1', '帽子', '服饰', '水水水水', 'E:\\Images\\51ce2838-425d-4e1c-a92f-e06147029119.jpg;', null);
INSERT INTO `tb_speciality` VALUES ('2', '方法', '节日', '方法', 'E:\\Images\\46d9d124-98b1-4197-ad75-ccb093b42faa.jpg;', null);
INSERT INTO `tb_speciality` VALUES ('3', '是是是', '节日', '是 ', 'E:\\Images\\2416aa51-379e-486d-88dc-ddbf75a83b65.jpg;', null);
INSERT INTO `tb_user` VALUES ('6', '12', 'wgrU12/pd1mqJ6DJm/9nEA==', '0', '', '', '', '男');
INSERT INTO `tb_user` VALUES ('7', ' 23456', 'xTordRu8Du5sCCdVr9sebg==', '0', '22', '1526714234@qq.com', '13645678999', '女');
INSERT INTO `tb_user` VALUES ('8', '234567', 'DKP0iaJkj7NkRiG3dU8BvA==', '0', 'eee', 'ddddddd@126.com', '13455555555', '男');
INSERT INTO `tb_user` VALUES ('9', '123456', '3Eg+gKegvZ73HYz5c2c5JA==', '0', 'wx', '1234@126.com', '13555555555', '女');
INSERT INTO `tb_user` VALUES ('10', '345678', 'QP8CZd1tW0I00zRacEe8fw==', '0', 'wzz', 'xiunfg@126.com', '13522222222', '男');
INSERT INTO `tb_user` VALUES ('11', '111111', 'aEaGBoTwUCmrzMCaU81m8Q==', '0', 'wss', '1234@126.com', '13622222222', '男');
INSERT INTO `tb_user` VALUES ('12', 'wangxing', '4QrcOUm6Wau+VuBX8g+IPg==', '0', 'wang', 'ffff@126.com', '13566666666', '女');
INSERT INTO `tb_user` VALUES ('13', '3333333', 'mIC1Svm8SKniHy79yehEcQ==', '0', '迭代的', 'ss@126.com', '13799999999', '女');
