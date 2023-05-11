package mx.com.qtx.regres.apiweb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mx.com.qtx.regres.entidades.EventoRealizado;
import mx.com.qtx.util.FechaUtil;

@Service
public class ServicioNegocioMock implements IServicioNegocio {

	@Override
	public EventoRealizado getEventoRealizadoXId(long id) {
	    EventoRealizado evt = new EventoRealizado(id, "evento de prueba", 
	    		FechaUtil.getDate(2023, 1, 23, 10, 0), 
	    		FechaUtil.getDate(2023, 1, 23, 11, 50));
		return evt;
	}

	@Override
	public List<EventoRealizado> getEventosTodos() {
		List<EventoRealizado> listaEvts = new ArrayList<>();
		listaEvts.add(new EventoRealizado(1, "evento de prueba", 
	    		FechaUtil.getDate(2023, 1, 23, 10, 0), 
	    		FechaUtil.getDate(2023, 1, 23, 11, 50)));
		listaEvts.add(new EventoRealizado(2, "junta avances cfdi 4.0", 
	    		FechaUtil.getDate(2023, 4, 23, 13, 0), 
	    		FechaUtil.getDate(2023, 4, 23, 15, 50)));
		return listaEvts;
	}

}
