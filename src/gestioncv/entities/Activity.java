package gestioncv.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Activity")
@NamedQuery(name = "trouver les activités", query = "select a from Activity a")
public class Activity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	private String title;

	@Column
	private Integer year;

	@Column
	private String experiencePro;

	@Column
	private String formation;

	@Column
	private String project;

	@Column
	private String other;

	@Column
	private String description;
	
	@Column
	private String adressweb;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getExperiencePro() {
		return experiencePro;
	}

	public void setExperiencePro(String experiencePro) {
		this.experiencePro = experiencePro;
	}

	public String getFormation() {
		return formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAdressweb() {
		return adressweb;
	}

	public void setAdressweb(String adressweb) {
		this.adressweb = adressweb;
	}

	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
