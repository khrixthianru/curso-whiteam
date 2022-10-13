package com.flota.dominio;

import java.util.Date;

public interface Reservable {
	
	//esto es como poner public abstract y lo de abajo
	void reservar(Date fechaReservada);

}
