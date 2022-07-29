package com.eldar.apirest.service.tarjeta;

import com.eldar.apirest.exception.ApiException;
import com.eldar.apirest.model.Tarjeta;
import com.eldar.apirest.repository.TarjetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarjetaServiceImpl implements TarjetaService{

    @Autowired
    TarjetaRepository tarjetaRepository;
    @Override
    public List<Tarjeta> listadoTarjetas() {
        return tarjetaRepository.findAll();

    }
}
