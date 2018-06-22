package com.everis.vcalvoma.service;

import java.util.logging.Logger;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.everis.vcalvoma.config.MsConfigMQ;


@Service
public class ListenerService {

	protected Logger logger = Logger.getLogger(ListenerService.class.getName());
	
	
	/*
	 * Versión cutre de consumo sin factoría de conexiones ni nada, escucho de una cola con user por defecto
	 */
	@RabbitListener(queues=MsConfigMQ.QUEUE_NAME)
	public void listening(final Message message)
	{
		
		logger.info("=========================");
		logger.info(message.toString());
		logger.info("=========================");
	}
	
}
