package email_list_hashset_exercise;

import java.util.Objects;

public class EmailList {

	String email;
	
	public EmailList (String email) {
		
		this.email= email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmailList other = (EmailList) obj;
		return Objects.equals(email, other.email);
	}

	@Override
	public String toString() {
		return "EmailList [email=" + email + "]";
	}
	
	
}
