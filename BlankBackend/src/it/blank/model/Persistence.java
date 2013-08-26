package it.blank.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@GenericGenerator (
		name = "tablehilo",
		strategy = "hilo",
		parameters = {
				@Parameter( name = "table", value = "HIBERNATE_HILO" ),
				@Parameter( name = "max_lo", value = "100" )
		}
)

@MappedSuperclass
public class Persistence {

	@Id
	@GeneratedValue(generator = "tablehilo")
	private Long id;
	
	@Version
	@Column(name = "OPTLOCK")
	private int version;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	@Override
	public boolean equals(Object object) {
		
		if(object instanceof Persistence) {
			if(this.getId() == ((Persistence) object).getId())
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		if(null != getId())
			return getId().hashCode();
		return super.hashCode();
	}
}
