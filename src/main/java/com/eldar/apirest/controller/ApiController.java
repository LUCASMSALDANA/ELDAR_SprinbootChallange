package com.eldar.apirest.controller;

import com.eldar.apirest.ConsultaDTO.ConsultaDTO;
import com.eldar.apirest.model.Consulta;
import com.eldar.apirest.service.api.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consulta")
public class ApiController {

    @Autowired
    ApiService apiService;

    @GetMapping("")
    public String consultaTasa(@RequestBody Consulta consulta) throws Exception{
        return apiService.consultaTasa(consulta);
    }
        @GetMapping("/dto")
    public ConsultaDTO consultaTasaDTO(@RequestBody Consulta consulta) throws Exception{
        return apiService.consultaTasaDTO(consulta);
    }

        @GetMapping("/info")
    public String info(){
        return      "BIENVENIDO AL SISTEMA DE CONSULTA DE TASAS \n" +
                    "*******************************************\n" +
                    "Uri's y sus funciones:\n\n" +
                    "[localhost:8080/consulta/] : Devuelve un mensaje con la tasa" +
                    "\n[localhost:8080/consulta/dto] : Devuelve un Json";
    }

}
