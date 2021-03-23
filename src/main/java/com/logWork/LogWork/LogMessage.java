package com.logWork.LogWork;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Data;

@Data
public class LogMessage {
	private String sessionId;
	private String applicationName;
	private String applicationVersion;
	private String loggerName;
	private LogMessageType messageType;
	private LogSeverity severity;
	private String message;
	@JsonDeserialize(using = StringObjectDeserializer.class)
	private String performanceData;
	//@JsonDeserialize(using = StringObjectDeserializer.class)
	private Map<String,List<String>> customObject;
	private OffsetDateTime timestamp;
	private String scenario;
	private String duration;
	private String useName;
	public String getUseName() {
		return useName;
	}
	public void setUseName(String useName) {
		this.useName = useName;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public String getApplicationVersion() {
		return applicationVersion;
	}
	public void setApplicationVersion(String applicationVersion) {
		this.applicationVersion = applicationVersion;
	}
	public String getLoggerName() {
		return loggerName;
	}
	public void setLoggerName(String loggerName) {
		this.loggerName = loggerName;
	}
	public LogMessageType getMessageType() {
		return messageType;
	}
	public void setMessageType(LogMessageType messageType) {
		this.messageType = messageType;
	}
	public LogSeverity getSeverity() {
		return severity;
	}
	public void setSeverity(LogSeverity severity) {
		this.severity = severity;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPerformanceData() {
		return performanceData;
	}
	public void setPerformanceData(String performanceData) {
		this.performanceData = performanceData;
	}
	public Map<String,List<String>> getCustomObject() {
		return customObject;
	}
	public void setCustomObject(Map<String,List<String>> customObject) {
		this.customObject = customObject;
	}
	public OffsetDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(OffsetDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getScenario() {
		return scenario;
	}
	public void setScenario(String scenario) {
		this.scenario = scenario;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
}
