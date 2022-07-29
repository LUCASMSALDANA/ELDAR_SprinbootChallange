package com.eldar.apirest.service;

import com.eldar.apirest.ConsultaDTO.ConsultaDTO;
import com.eldar.apirest.exception.ApiException;
import com.eldar.apirest.model.Consulta;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ApiServiceImpl implements ApiService{

  double tasa=0;
    @Override
    public String consultaTasa(Consulta consulta) throws Exception {
        if(consulta.getMarca()==null && consulta.getImporte()==0){throw new ApiException("Debe ingresar un Json con el formato:   {'marca' : 'AMEX', 'importe': 5000 } ");}
        if(consulta.getImporte()<=0){throw new ApiException("El importe debe ser mayor a 0");}
        if(consulta.getMarca()==null || consulta.getMarca().isEmpty()){throw new ApiException("Es obligatorio indicar marca de la tarjeta (VISA / NARA / AMEX");}

        switch (consulta.getMarca().toUpperCase()){
            case "VISA":
                 tasa= calculoAnio()/LocalDate.now().getMonthValue();
                if(tasa<0.3){tasa=0.3;}
                if(tasa>5){tasa=5;}
                break;
            case "NARA":
                 tasa= LocalDate.now().getDayOfMonth()*0.5;
                if(tasa<0.3){tasa=0.3;}
                if(tasa>5){tasa=5;}
                break;
            case "AMEX":
                tasa = LocalDate.now().getMonthValue()*0.1;
                if(tasa<0.3){tasa=0.3;}
                if(tasa>5){tasa=5;}
                break;
            default:
                throw new ApiException("No se encuentra la tarjeta ingresada. Nuestras tarjetas disponibles son: (VISA / NARA /AMEX)");
        }
        double importetotal =consulta.getImporte()+(consulta.getImporte()*tasa/100);
        String texto = String.format("La tasa para su tarjeta "+consulta.getMarca()+" es de %.2f el importe original es %.2f , y pagará un importe final de %.2f ",tasa,consulta.getImporte(),importetotal);
        return texto;
    }

    @Override
    public ConsultaDTO consultaTasaDTO(Consulta consulta) throws Exception {
        if(consulta.getMarca()==null && consulta.getImporte()==0){throw new ApiException("Debe ingresar un Json con el formato:   {'marca' : 'AMEX', 'importe': 5000 } ");}
        if(consulta.getImporte()<=0){throw new ApiException("El importe debe ser mayor a 0");}
        if(consulta.getMarca()==null || consulta.getMarca().isEmpty()){throw new ApiException("Es obligatorio indicar marca de la tarjeta (VISA / NARA / AMEX");}

        switch (consulta.getMarca().toUpperCase()){
            case "VISA":
                tasa= calculoAnio()/LocalDate.now().getMonthValue();
                if(tasa<0.3){tasa=0.3;}
                if(tasa>5){tasa=5;}
                break;
            case "NARA":
                tasa= LocalDate.now().getDayOfMonth()*0.5;
                if(tasa<0.3){tasa=0.3;}
                if(tasa>5){tasa=5;}
                break;
            case "AMEX":
                tasa = LocalDate.now().getMonthValue()*0.1;
                if(tasa<0.3){tasa=0.3;}
                if(tasa>5){tasa=5;}
                break;
            default:
                throw new ApiException("No se encuentra la tarjeta ingresada. Nuestras tarjetas disponibles son: (VISA / NARA /AMEX)");
        }
        double importetotal =consulta.getImporte()+(consulta.getImporte()*tasa/100);

        ConsultaDTO consultadto= new ConsultaDTO(consulta.getMarca(),consulta.getImporte(),tasa,importetotal-consulta.getImporte());
        return consultadto;
    }


    //******************************************************************************************************************
    //******************************************************************************************************************
    public double calculoAnio(){
        double anio=LocalDate.now().getYear();
        int sacodigitos =LocalDate.now().getYear()/100;
        anio = Math.round(((anio/100) -sacodigitos)*100);
        return anio;
    }
}
