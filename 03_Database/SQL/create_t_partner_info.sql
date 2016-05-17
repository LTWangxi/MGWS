DROP TABLE IF EXISTS `t_partner_info`;
CREATE TABLE `t_partner_info` (
  `no` bigint(12) NOT NULL AUTO_INCREMENT,
  `partnerNo` varchar(16) NOT NULL,
  `releaseDate` timestamp NOT NULL,
  `releaseFlg` char(1) NOT NULL,
  `partnerName` varchar(100) DEFAULT NULL,
  `partnerDetails` text(10000),
  `addTimestamp` timestamp NULL DEFAULT NULL,
  `addUserKey` varchar(40) DEFAULT NULL,
  `updTimestamp` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updUserKey` varchar(40) DEFAULT NULL,
  `updPgmId` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
