/*
MySQL Data Transfer
Source Host: localhost
Source Database: muc
Target Host: localhost
Target Database: muc
Date: 2016/12/25 21:10:49
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for tb_activity
-- ----------------------------
DROP TABLE IF EXISTS `tb_activity`;
CREATE TABLE `tb_activity` (
  `act_id` int(30) NOT NULL AUTO_INCREMENT,
  `act_name` varchar(50) DEFAULT NULL,
  `content` varchar(5000) DEFAULT NULL,
  `image_path` varchar(255) DEFAULT NULL,
  `build_id` int(30) DEFAULT NULL,
  `createDate` varchar(30) DEFAULT NULL,
  `activityDate` varchar(30) DEFAULT NULL,
  `attr2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`act_id`),
  KEY `build_id` (`build_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

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
  `constant` varchar(30) DEFAULT NULL,
  `meaning` varchar(5000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `tb_activity` VALUES ('2', '冬至', '冬至到了', 'E:\\Images\\419f9251-3ff1-430a-b34d-744dd6d03cbc.jpg;', '7', '2016-12-23 10:25:50', '2016-12-24', '201');
INSERT INTO `tb_activity` VALUES ('3', '圣诞节快乐', '12月25日将举行圣诞节晚会', 'E:\\Images\\4fbdfd18-2d85-41e2-b770-f3e131bfc292.jpg;', '1', '2016-12-23 10:27:00', '2016-12-25', '');
INSERT INTO `tb_activity` VALUES ('4', '平安夜快乐', '今天是平安夜', 'E:\\Images\\1cfc3494-a165-49c8-bd4d-acf3091418bb.jpg;', '3', '2016-12-25 20:47:59', '2016-12-08', '1楼');
INSERT INTO `tb_activity` VALUES ('5', '水果节', '水果水果', 'E:\\Images\\1cfc3494-a165-49c8-bd4d-acf3091418bb.jpg;', '2', '2016-12-25 20:48:30', '2016-12-16', '7楼');
INSERT INTO `tb_activity` VALUES ('6', '下雪了', '今天是大雪', 'E:\\Images\\1cfc3494-a165-49c8-bd4d-acf3091418bb.jpg;', '2', '2016-12-25 20:49:08', '2016-12-28', '门前');
INSERT INTO `tb_activity` VALUES ('7', '停水通知', '今日停水', 'E:\\Images\\1cfc3494-a165-49c8-bd4d-acf3091418bb.jpg;', '2', '2016-12-25 20:49:33', '2016-12-22', '全楼');
INSERT INTO `tb_activity` VALUES ('8', '降价促销', '超市促销了', 'E:\\Images\\1cfc3494-a165-49c8-bd4d-acf3091418bb.jpg;', '8', '2016-12-25 20:50:12', '2016-12-30', '全校');
INSERT INTO `tb_building` VALUES ('1', '大礼堂', '文西路廖莉莉', '举办各种活动和庆祝典礼', 'E:\\Images\\db74c0cf-3fb5-4af1-b746-3405085e074f.jpg;E:\\Images\\18acb891-133d-4c58-a11b-a5d7be499ec9.jpg;');
INSERT INTO `tb_building` VALUES ('2', '理工楼', '偏僻的角落里', '信工和生环教学专用理论', 'E:\\Images\\c5fba2e9-8184-427b-b0c8-fd2bc976b701.jpg;E:\\Images\\2ab6fe18-931e-4fdd-98d0-bb23b545438a.jpg;E:\\Images\\9eea3622-dc77-44fc-8ac7-4b29ccec41fe.jpg;');
INSERT INTO `tb_building` VALUES ('3', '图书馆', '临近理工楼', '学习和读书的场所', 'E:\\Images\\7bb2b1ce-dad6-4643-9df8-148500414d54.jpg;E:\\Images\\368471f4-9fc1-400d-b1f3-31ecc33184dd.jpg;F:\\Images\\184d5835-bbc1-4d5b-b583-3083e2ec8ff2.jpg;E:\\Images\\070c540e-6863-4063-bb69-fa05749a0dfc.jpg;');
INSERT INTO `tb_building` VALUES ('4', '8号楼', '紧挨操场', '女生宿舍', 'E:\\Images\\4fe8b2e0-9454-4ecc-8b14-5e7dfdd48aeb.jpg;E:\\Images\\e17adbf7-9447-46fc-88ca-ccbd1330505e.jpg;E:\\Images\\38bc5eb2-1bb1-41d5-af82-988c3f5aaa56.jpg;');
INSERT INTO `tb_building` VALUES ('6', '博物馆', '靠近图书馆', '校史展览', 'E:\\Images\\d0368aad-f476-486f-9c4c-06402e6b3a1c.jpg;E:\\Images\\bc813aff-5ec6-4764-a0d9-f6ef72daf302.jpg;');
INSERT INTO `tb_building` VALUES ('8', 'DD', 'DDDD', 'DDDD', 'E:\\Images\\659b2688-4ea9-4c52-b11c-c6f2b6930087.jpg;E:\\Images\\5aee447b-d477-48e2-be4b-38f93eae8519.jpg;');
INSERT INTO `tb_building` VALUES ('9', '顶顶顶顶', '顶顶顶顶顶', '顶顶顶顶顶多多', 'E:\\Images\\cf955406-e1da-446b-b209-fc1d6c058d69.jpg;');
INSERT INTO `tb_constant` VALUES ('1', '汉族', '汉族简介啦啦啦理论');
INSERT INTO `tb_constant` VALUES ('2', '藏族', '藏族简介啦啦');
INSERT INTO `tb_constant` VALUES ('3', '瑶族', '瑶族简介');
INSERT INTO `tb_constant` VALUES ('4', '土家族', '土家族简介');
INSERT INTO `tb_constant` VALUES ('6', '彝族', '彝族简介');
INSERT INTO `tb_speciality` VALUES ('1', '帽子么么', '服饰', '水水水水呵呵', 'E:\\Images\\51ce2838-425d-4e1c-a92f-e06147029119.jpg;', '1');
INSERT INTO `tb_speciality` VALUES ('2', '方法', '节日', '方法', 'E:\\Images\\46d9d124-98b1-4197-ad75-ccb093b42faa.jpg;', '1');
INSERT INTO `tb_speciality` VALUES ('3', '经济', '节日', '规格', 'E:\\Images\\5500ea23-366a-4ee5-b320-554ee56f9169.jpg;', '4');
INSERT INTO `tb_speciality` VALUES ('4', '谜', '节日', '猜谜语', 'E:\\Images\\43636c38-8c1c-4d2f-8ede-82db76999dc7.jpg;', '4');
INSERT INTO `tb_speciality` VALUES ('6', '今天吃什么', '食物', '吃吃吃', 'E:\\Images\\091f8c12-cd82-4857-ba69-b4d57772606d.jpg;', '2');
INSERT INTO `tb_speciality` VALUES ('7', '裙子', '服饰', '漂亮的裙子', 'E:\\Images\\b7b5032e-a1c4-45cb-915e-65929b1d39e2.jpg;', '1');
INSERT INTO `tb_user` VALUES ('6', '12', 'wgrU12/pd1mqJ6DJm/9nEA==', '0', '', '', '', '男');
INSERT INTO `tb_user` VALUES ('7', ' 23456', 'xTordRu8Du5sCCdVr9sebg==', '0', '22', '1526714234@qq.com', '13645678999', '女');
INSERT INTO `tb_user` VALUES ('8', '234567', 'DKP0iaJkj7NkRiG3dU8BvA==', '0', 'eee', 'ddddddd@126.com', '13455555555', '男');
INSERT INTO `tb_user` VALUES ('9', '123456', '3Eg+gKegvZ73HYz5c2c5JA==', '0', 'wx', '1234@126.com', '13555555555', '女');
INSERT INTO `tb_user` VALUES ('10', '345678', 'QP8CZd1tW0I00zRacEe8fw==', '0', 'wzz', 'xiunfg@126.com', '13522222222', '男');
INSERT INTO `tb_user` VALUES ('11', '111111', 'aEaGBoTwUCmrzMCaU81m8Q==', '0', 'wss', '1234@126.com', '13622222222', '男');
INSERT INTO `tb_user` VALUES ('12', 'wangxing', '4QrcOUm6Wau+VuBX8g+IPg==', '0', 'wang', 'ffff@126.com', '13566666666', '女');
INSERT INTO `tb_user` VALUES ('13', '3333333', 'mIC1Svm8SKniHy79yehEcQ==', '0', '迭代的', 'ss@126.com', '13799999999', '女');
INSERT INTO `tb_user` VALUES ('14', '111222', 'Bm7N7upyYFyzt397f//I0A==', '0', '试试', 'xing@126.com', '15677777777', '女');
INSERT INTO `tb_user` VALUES ('15', '111333', 'Ib2ikSUJISUvX8e9tsp0zQ==', '1', '方法', 'xingw@126.com', '15900000000', '男');
INSERT INTO `tb_user` VALUES ('16', '000000', 'gic6a6ISbTryTOLQywr1FQ==', '0', 'dd', 'dd@163.com', '15600000000', '女');
INSERT INTO `tb_user` VALUES ('17', '999999', 'F9QGOld9tEQ+eN0Wt5xReg==', '0', 'kk', 'xx@163.com', '15988888888', '男');
INSERT INTO `tb_user` VALUES ('18', '888999', 'M0kw9iN78ZZoYJzzZz/j9Q==', '1', 'ddd', '11@126.com', '13988888888', '男');
INSERT INTO `tb_user` VALUES ('19', 'admin123', 'AZICOnu9cyUFFvBp3xi1AA==', '1', 'w', 'xing@126.com', '13688888888', '女');
