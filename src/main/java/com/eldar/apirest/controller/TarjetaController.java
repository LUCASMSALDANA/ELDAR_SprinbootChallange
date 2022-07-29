package com.eldar.apirest.controller;

import com.eldar.apirest.model.Tarjeta;
import com.eldar.apirest.service.tarjeta.TarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("listado")
public class TarjetaController {
    @Autowired
    TarjetaService tarjetaService;

    @GetMapping("")
    public List<Tarjeta> listadoTarjetas(){
        return tarjetaService.listadoTarjetas();
    }


}
