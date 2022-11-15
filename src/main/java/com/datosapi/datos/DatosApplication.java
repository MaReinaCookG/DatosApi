//metodo principal encargado de inicializar la arquitectura y la autoconfiguracion del proyecto

package com.datosapi.datos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatosApplication.class, args);
	}

}
