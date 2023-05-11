package mx.com.qtx.regres.servnegocio;

import java.util.List;

import mx.com.qtx.regres.apiweb.IServicioNegocio;
import mx.com.qtx.regres.entidades.EventoRealizado;

public class GestorEventosRealizadosSodexo implements IServicioNegocio {
	private IGestorPersistenciaEventosRealizados gestorDatos;

	@Override
	public EventoRealizado getEventoRealizadoXId(long id) {
		EventoRealizado evt= this.gestorDatos.leerEventoRealizadoConDetalles(id);
		// Hacer otras cosas de negocio...
		return evt;
	}

	@Override
	public List<EventoRealizado> getEventosTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
