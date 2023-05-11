package mx.com.qtx.regres.servnegocio;

import java.util.Set;

import mx.com.qtx.regres.entidades.EventoRealizado;

public interface IGestorPersistenciaEventosRealizados {
	EventoRealizado leerEventoRealizadoPlano(long id);
	EventoRealizado leerEventoRealizadoConDetalles(long id);
	Set<EventoRealizado> leerEventosTodos();
}
