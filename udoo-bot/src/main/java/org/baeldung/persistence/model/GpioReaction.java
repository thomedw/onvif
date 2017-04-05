package org.baeldung.persistence.model;

import java.util.List;

import javax.persistence.Convert;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.baeldung.persistence.model.enumeration.ReactionType;

public class GpioReaction {

	@Id
	@GeneratedValue
	private Long id;
	private String description;
	
	@Convert(converter = ReactionType.Converter.class)
	private ReactionType reaction;
	
	@ManyToMany(mappedBy = "action") //relationship inverse
    private List<Gpio> gpios;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ReactionType getReaction() {
		return reaction;
	}
	public void setReaction(ReactionType reaction) {
		this.reaction = reaction;
	}
}
