package com.eldar.apirest.service;

import com.eldar.apirest.ConsultaDTO.ConsultaDTO;
import com.eldar.apirest.model.Consulta;

public interface ApiService {
    String consultaTasa(Consulta consulta) throws Exception;

    ConsultaDTO consultaTasaDTO(Consulta consulta) throws Exception;
}
