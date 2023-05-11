package mx.com.qtx.regres.apiweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import mx.com.qtx.regres.entidades.EventoRealizado;

@RestController
public class EventosRealizadosAPI {
	@Autowired
	private IServicioNegocio gestorEventosRealizados;
	
	@GetMapping(path = "/eventosRealizados/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public EventoRealizado get_eventosRealizadoXId(@PathVariable long id) {
		return this.gestorEventosRealizados.getEventoRealizadoXId(id);
	}
	
	@GetMapping(path = "/eventosRealizados",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EventoRealizado> get_eventos(){
		return this.gestorEventosRealizados.getEventosTodos();
	}
	@ExceptionHandler
	public String manejarErrorFormatoNum(NumberFormatException nfex) {
		return "Error de formato: Se esperaba un número";
	}
	@ExceptionHandler
	public String manejarDemasExcepciones(Exception ex) {
		return "Error:" + ex.getClass().getName() + ", msg:" + ex.getMessage();
	}
}
