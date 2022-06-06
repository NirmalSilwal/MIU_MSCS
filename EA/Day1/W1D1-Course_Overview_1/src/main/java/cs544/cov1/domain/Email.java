package cs544.cov1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Email {
	@Id
	@GeneratedValue
	private long id;
        @NotEmpty
        @javax.validation.constraints.Email
	private String email;

	public Email() {
		super();
	}

	public Email(String email) {
		super();
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
