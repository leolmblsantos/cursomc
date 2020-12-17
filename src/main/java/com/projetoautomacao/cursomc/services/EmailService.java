package com.projetoautomacao.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.projetoautomacao.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);

}
