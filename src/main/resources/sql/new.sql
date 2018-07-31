###########商品表
DROP TABLE IF EXISTS `commodity_table`;
CREATE TABLE `commodity_table` (
  `num_iid` varchar(32) NOT NULL COMMENT '商品ID',
  `title` varchar(32) DEFAULT NULL COMMENT '商品标题',
  `pict_url` varchar(64) DEFAULT NULL COMMENT '商品主图',
  `small_images` varchar(64) DEFAULT NULL COMMENT '商品小图列表',
  `reserve_price` varchar(64) DEFAULT NULL COMMENT '商品一口价格',
  `zk_final_price` varchar(64) DEFAULT NULL COMMENT '商品折扣价格',
  `user_type` varchar(64) DEFAULT NULL COMMENT '卖家类型，0表示集市，1表示商城',
  `provcity` varchar(64) DEFAULT NULL COMMENT '宝贝所在地',
  `item_url` varchar(64) DEFAULT NULL COMMENT '商品地址',
  `nick` varchar(64) DEFAULT NULL COMMENT '卖家昵称',
  `seller_id` varchar(64) DEFAULT NULL COMMENT '卖家id',
  `volume` varchar(64) DEFAULT NULL COMMENT '30天销量',
  `creat_time` varchar(64) DEFAULT NULL COMMENT '创建时间',
  `popularity` varchar(64) DEFAULT NULL COMMENT '人气',
  `voucher_address` varchar(64) DEFAULT NULL COMMENT '领券地址',
  `creat_user` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`num_iid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodity_table
-- ----------------------------
INSERT INTO `commodity_table` VALUES ('11', '11', '11', '11', '11', '11', '11', '11', '11', '11', '11', '111', '111', '11', '11', '11');