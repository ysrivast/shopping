package billing.model;

import java.util.Date;

public class User {
	private Long userId;
	private String login;
	private Byte userType;
	private Date creationDate;

	public User() {
		super();
	}

	public User(Long userId, String login, Byte userType, Date creationDate) {
		super();
		this.userId = userId;
		this.login = login;
		this.userType = userType;
		this.creationDate = creationDate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Byte getUserType() {
		return userType;
	}

	public void setUserType(Byte userType) {
		this.userType = userType;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
