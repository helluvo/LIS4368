-- MySQL Script generated by MySQL Workbench
-- Thu Feb 29 00:45:44 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema hsr21a
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema hsr21a
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hsr21a` DEFAULT CHARACTER SET utf8 ;
USE `hsr21a` ;

-- -----------------------------------------------------
-- Table `hsr21a`.`petstore`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hsr21a`.`petstore` (
  `pst_id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `street` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `state` VARCHAR(45) NOT NULL,
  `zip` CHAR(9) NOT NULL,
  `phone` BIGINT(9) NOT NULL,
  `ytd_sales` VARCHAR(45) NOT NULL,
  `url` VARCHAR(45) NOT NULL,
  `notes` VARCHAR(45) NULL,
  PRIMARY KEY (`pst_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hsr21a`.`customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hsr21a`.`customer` (
  `cust_id` INT NOT NULL,
  `fname` VARCHAR(45) NOT NULL,
  `lname` VARCHAR(45) NOT NULL,
  `street` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `state` VARCHAR(45) NOT NULL,
  `zip` CHAR(9) NOT NULL,
  `phone` BIGINT(9) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `balance` VARCHAR(45) NOT NULL,
  `total_sales` VARCHAR(45) NOT NULL,
  `notes` VARCHAR(45) NULL,
  PRIMARY KEY (`cust_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hsr21a`.`pet`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hsr21a`.`pet` (
  `pet_id` INT NOT NULL,
  `pst_id` INT NOT NULL,
  `cust_id` INT NULL,
  `type` VARCHAR(45) NOT NULL,
  `sex` VARCHAR(45) NOT NULL,
  `cost` VARCHAR(45) NOT NULL,
  `price` VARCHAR(45) NOT NULL,
  `age` VARCHAR(45) NOT NULL,
  `color` VARCHAR(45) NOT NULL,
  `sale_date` VARCHAR(45) NOT NULL,
  `vaccine` VARCHAR(45) NOT NULL,
  `neuter` VARCHAR(45) NOT NULL,
  `notes` VARCHAR(45) NULL,
  PRIMARY KEY (`pet_id`),
  INDEX `fk_pet_customer1_idx` (`cust_id` ASC) VISIBLE,
  INDEX `fk_pet_petstore1_idx` (`pst_id` ASC) VISIBLE,
  CONSTRAINT `fk_pet_customer1`
    FOREIGN KEY (`cust_id`)
    REFERENCES `hsr21a`.`customer` (`cust_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pet_petstore1`
    FOREIGN KEY (`pst_id`)
    REFERENCES `hsr21a`.`petstore` (`pst_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;