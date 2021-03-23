package com.logWork.LogWork;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

import ch.qos.logback.classic.Logger;

import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.classic.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.io.Closer;

//
//import brave.Span;
//import brave.Tracer;

@RestController
public class VersionController {
	private static final Logger log = (Logger) LoggerFactory.getLogger(VersionController.class);

}
