/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : new

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-06-11 20:52:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `chargingstation`
-- ----------------------------
DROP TABLE IF EXISTS `chargingstation`;
CREATE TABLE `chargingstation` (
  `ChargingStationID` varchar(10) NOT NULL,
  `ChargingStationName` varchar(255) NOT NULL,
  `ProjectNo` int(3) DEFAULT NULL,
  `ChargingStationAddress` varchar(255) DEFAULT NULL,
  `Longitude` double(9,0) DEFAULT NULL,
  `Latitude` double(9,0) DEFAULT NULL,
  `CreateUser` varchar(10) NOT NULL,
  `CreateDTTM` datetime NOT NULL,
  `UpdateUser` varchar(10) DEFAULT NULL,
  `UpdateDTTM` datetime DEFAULT NULL,
  PRIMARY KEY (`ChargingStationID`),
  UNIQUE KEY `ChargingStationName` (`ChargingStationName`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chargingstation
-- ----------------------------
INSERT INTO `chargingstation` VALUES ('fd001', '故障诊断交大站', '1', '北京交大', '0', '0', '张三', '2018-04-28 09:30:59', '李四', '2018-05-08 11:11:41');

-- ----------------------------
-- Table structure for `equipment`
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment` (
  `EquipmentID` varchar(20) NOT NULL COMMENT '充电桩ID',
  `EquipmentName` varchar(100) DEFAULT NULL COMMENT '充电桩名称',
  `ChargingStationID` varchar(10) NOT NULL COMMENT '充电站ID',
  `EquipmentType` varchar(50) DEFAULT NULL COMMENT '充电桩类型',
  `EquipmentPowerType` varchar(50) DEFAULT NULL COMMENT '充电桩型号',
  `EquipmentManufacturer` varchar(255) DEFAULT NULL COMMENT '厂家',
  `ManufactureTime` date DEFAULT NULL COMMENT '生产日期',
  `EquipmentBatch` varchar(50) DEFAULT NULL COMMENT '批次',
  `ProtocolType` varchar(50) DEFAULT NULL COMMENT '盒子编码',
  `CreateUser` varchar(10) NOT NULL COMMENT '创建者',
  `CreateDTTM` datetime NOT NULL COMMENT '创建时间',
  `UpdateUser` varchar(10) DEFAULT '' COMMENT '更新者',
  `UpdateDTTM` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`EquipmentID`),
  UNIQUE KEY `EquipmentName` (`ChargingStationID`,`EquipmentName`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equipment
-- ----------------------------
INSERT INTO `equipment` VALUES ('C00000', '#1充电桩', 'fd001', '交流', '450KW', '华商三优', '2018-05-03', '1批', '', 'test', '2018-05-03 17:07:29', 'user', '2018-06-11 18:54:10');
INSERT INTO `equipment` VALUES ('C00801', '#1测试充电桩', 'fd001', '直流', '450KW', '未知厂家', '2018-05-07', '2批', 'test1', 'test', '2018-05-03 11:58:55', 'test', '2018-05-08 11:10:47');
INSERT INTO `equipment` VALUES ('C00802', '#2测试充电桩', 'fd001', '直流', '180KW', '华商三优', '2018-04-28', '2批', 'test2', 'test', '2018-04-28 09:59:41', 'test', '2018-05-08 11:10:34');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `UserID` varchar(20) NOT NULL,
  `UserName` varchar(20) NOT NULL DEFAULT '',
  `Password` varchar(50) NOT NULL,
  `Enabled` tinyint(1) NOT NULL DEFAULT '1',
  `CreateUser` varchar(10) NOT NULL,
  `CreateDTTM` datetime NOT NULL,
  `UpdateUser` varchar(10) DEFAULT NULL,
  `UpdateDTTM` datetime DEFAULT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('admin', '管理员', 'ue6DmEHGJ+sjF91yd3c1cg==', '1', 'dt', '2018-06-07 16:56:58', null, '2018-06-11 18:01:37');
INSERT INTO `user` VALUES ('test', '测试用户', '9dBMl5XZakjflFbRQ4BLNA==', '1', 'dt', '2018-06-07 16:57:01', 'dt', '2018-06-09 15:30:14');
