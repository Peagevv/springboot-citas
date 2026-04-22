CREATE DATABASE IF NOT EXISTS springboot_citas;
USE springboot_citas;

CREATE TABLE citas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre_cliente VARCHAR(100) NOT NULL,
    servicio VARCHAR(100) NOT NULL,
    fecha VARCHAR(20) NOT NULL,
    hora VARCHAR(10) NOT NULL
);