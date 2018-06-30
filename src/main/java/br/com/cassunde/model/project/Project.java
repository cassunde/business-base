package br.com.cassunde.model.project;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project implements br.com.cassunde.project.entity.Project {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String description;
	private Double duration;
	
	@OneToMany(mappedBy="project", cascade=CascadeType.ALL)
	List<Member> members = new ArrayList<>();
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() { 
		return description;
	}
	
	public void setDuration(Double duration) {
		this.duration = duration;
	}

	@Override
	public Double getDuration() {		
		return duration;
	}
	
	public void setMembers(List<Member> members) {
		this.members = members;
	}

	@Override
	public List<Member> getMembers() {		
		return members;
	}

}
