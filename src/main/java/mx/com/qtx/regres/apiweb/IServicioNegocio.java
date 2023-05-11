package mx.com.qtx.regres.apiweb;

import java.util.List;

import mx.com.qtx.regres.entidades.EventoRealizado;

public interface IServicioNegocio {
	EventoRealizado getEventoRealizadoXId(long id);
	List<EventoRealizado> getEventosTodos();
}
