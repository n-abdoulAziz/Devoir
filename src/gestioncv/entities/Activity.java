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
	
	@Column
	private String title;

	@Column
	private Integer year;

	@Column
	private ActivityNature nature;

	@Column
	private String description;
	
	@Column
	private String adressweb;

	public Activity() {
		super();
	}
	
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
	
	public ActivityNature getNature() {
		return nature;
	}

	public void setNature(ActivityNature nature) {
		this.nature = nature;
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
}
