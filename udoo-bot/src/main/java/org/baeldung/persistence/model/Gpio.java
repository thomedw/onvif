package org.baeldung.persistence.model;

import java.util.List;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.baeldung.persistence.model.enumeration.PinType;

@Entity
public class Gpio {
	
	@Id
    @GeneratedValue
    private Long gpio;
    private Long pinNumber;
    private String name;
    private String description;
    
    @Convert(converter = PinType.Converter.class)
    private PinType input;
    
    @ManyToMany //relationship owner
    private List<GpioReaction> action;

	public Long getGpio() {
		return gpio;
	}

	public void setGpio(Long gpio) {
		this.gpio = gpio;
	}

	public Long getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(Long pinNumber) {
		this.pinNumber = pinNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PinType getInput() {
		return input;
	}

	public void setInput(PinType input) {
		this.input = input;
	}

	public List<GpioReaction> getAction() {
		return action;
	}

	public void setAction(List<GpioReaction> action) {
		this.action = action;
	}
    
}