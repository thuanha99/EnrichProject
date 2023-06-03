CREATE TABLE IF NOT EXISTS `user`
(
    `id`
    BIGINT
    NOT
    NULL
    AUTO_INCREMENT,
    `full_name`
    VARCHAR
(
    256
) NOT NULL UNIQUE,
    `email` VARCHAR
(
    256
) DEFAULT NULL,
    `phone_number` INT,
    `address` VARCHAR
(
    256
) DEFAULT NULL,
    `created_at` DATETIME DEFAULT CURRENT_TIMESTAMP,
    `created_by` VARCHAR
(
    36
) DEFAULT NULL,
    `updated_at` DATETIME DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
    `updated_by` VARCHAR
(
    36
) DEFAULT NULL,
    `deleted_at` DATETIME DEFAULT NULL,
    `deleted_by` VARCHAR
(
    36
) DEFAULT NULL,
    PRIMARY KEY
(
    `id`
)
    );