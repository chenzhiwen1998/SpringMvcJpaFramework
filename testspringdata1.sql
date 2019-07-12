/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : testspringdata1

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-07-12 15:04:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` varchar(32) NOT NULL,
  `name` varchar(40) NOT NULL COMMENT '商品名称',
  `price` decimal(10,2) NOT NULL COMMENT '价格',
  `unit` varchar(10) NOT NULL COMMENT '单位',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '电视机A', '15.00', '台');
INSERT INTO `goods` VALUES ('2', '电视机B', '62.00', '台');
INSERT INTO `goods` VALUES ('3', '洗衣机B', '50.00', '个');
INSERT INTO `goods` VALUES ('4', '电冰箱', '14.00', '个');
INSERT INTO `goods` VALUES ('5', '电脑', '58.00', '台');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `code` varchar(40) NOT NULL COMMENT '账号',
  `name` varchar(40) NOT NULL COMMENT '用户名',
  `ps` varchar(10) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123', '132', '123');
