package com.eldar.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.criteria.CriteriaBuilder;
import java.sql.DataTruncation;
import java.sql.Date;
import java.text.DateFormat;
import java.text.spi.DateFormatProvider;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class ApirestApplication {

	public static void main(String[] args) {

		//SpringApplication.run(ApirestApplication.class, args);
		System.out.println("********************************");
		System.out.println("Aplicacion Levantada y Corriendo");
		System.out.println("********************************");
		String numero = "4841613ok";
		int numer= Integer.parseInt(numero);

		System.out.println(numer);


	}

}
