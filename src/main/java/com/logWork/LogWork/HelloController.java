package com.logWork.LogWork;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.Map;


import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Closer;


//import brave.Span;
//import brave.Tracer;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.LoggingEvent;

@RestController
public class HelloController {
	private final Logger logger = (Logger)LoggerFactory.getLogger(this.getClass());
	private static final ch.qos.logback.classic.Logger log = (ch.qos.logback.classic.Logger) LoggerFactory
			.getLogger(HelloController.class);
//
//	@Autowired
//	Tracer tracer;

	 @GetMapping("/")
	    public String homeInit() {
	        return "home";
	    }
	 
	
	@PostMapping("/api/log")	
	public ResponseEntity home(@RequestBody final List<LogMessage> logMessage)
			 {
		 Map<String,List<String>> values = logMessage.get(0).getCustomObject();
		 
		System.out.println("I am here");
		for(String key : values.keySet())
		{
			System.out.println(values.get(key));
		}
		
		return ResponseEntity.ok().build();
	}

	@SuppressWarnings("deprecation")
	public static void json() throws JsonProcessingException {
		int[] recentScores = { 77, 72, 23, 57, 54, 36, 74, 17 };

		String str[] = { "[first,work]", "second:onceupOntime", "\nthird" };
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		String string = "[\r\n" + "{\r\n"+
						"\"country\": \"India\",,,,\r\n"+
						"}\r\n"+
						"]";
		String string1=string;
		
		
		String prettyJsonString;
		prettyJsonString = "first" + recentScores;
		ObjectMapper objectMapper = new ObjectMapper();
		prettyJsonString = objectMapper.writeValueAsString(string);
		
		System.out.println(string1);
		System.out.println(prettyJsonString);
		System.out.println(prettyJsonString);

	}

	public void logMessage(final LogMessage logMessage) {


	}

	private void outputLog(LogMessage logMessage) {
		final Map<String,List<String>> customObject;
		customObject = logMessage.getCustomObject();
		final Object[] args = { logMessage.getMessage(), customObject };
		final String messagePattern = "{} {}";
		final LoggingEvent evt = new LoggingEvent(this.getClass().getName(), log, Level.INFO, messagePattern, null,
				args);
		evt.setTimeStamp(logMessage.getTimestamp().toInstant().toEpochMilli());
		evt.setLoggerName(logMessage.getLoggerName());
		log.callAppenders(evt);

	}
}
