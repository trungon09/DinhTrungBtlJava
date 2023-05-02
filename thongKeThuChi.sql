CREATE TABLE `chi` (
	`TT` INT(11) NOT NULL AUTO_INCREMENT,
	`Ngày` DATE NOT NULL,
	`Mô tả` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`Mục đích` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`Số tiền` INT(11) NULL DEFAULT NULL,
	PRIMARY KEY (`TT`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=42
;
CREATE TABLE `thu` (
	`TT` INT(11) NOT NULL AUTO_INCREMENT,
	`Ngày` DATE NOT NULL,
	`Số tiền` INT(11) NULL DEFAULT NULL,
	`Mô tả` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`TT`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=76
;
CREATE TABLE `sodu` (
	`stt` INT(11) NOT NULL AUTO_INCREMENT,
	`soTien` INT(11) NOT NULL,
	PRIMARY KEY (`stt`) USING BTREE
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
AUTO_INCREMENT=2
;
CREATE TABLE `thietyeu` (
	`stt` INT(11) NOT NULL,
	`soTien` INT(11) NOT NULL
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;
CREATE TABLE `giaoduc` (
	`stt` INT(11) NOT NULL,
	`soTien` INT(11) NOT NULL
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;
CREATE TABLE `huongthu` (
	`stt` INT(11) NOT NULL,
	`soTien` INT(11) NOT NULL
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;
CREATE TABLE `tietkiem` (
	`stt` INT(11) NOT NULL,
	`soTien` INT(11) NOT NULL
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;
CREATE TABLE `dautu` (
	`stt` INT(11) NOT NULL,
	`soTien` INT(11) NOT NULL
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;
