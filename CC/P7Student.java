package tycs;

import java.io.Serializable; import javax.persistence.Entity;
import javax.persistence.GeneratedValue; import javax.persistence.GenerationType; import javax.persistence.Id;

@Entity
public class student implements Serializable { 
  private static final long serialVersionUID = 1L; 
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO) private Long id;

  public Long getId() { return id;}
  public void setId(Long id) { this.id = id;}
  private String sname;
  public String getSname() { return sname;}
  public void setSname(String sname) { this.sname = sname;}
  private String sclass;
  public String getSclass() { return sclass;}
  public void setSclass(String sclass) { this.sclass = sclass;}
  @Override
  public int hashCode() { int hash = 0;
    hash += (id != null ? id.hashCode() : 0); return hash;
  }
  @Override
  public boolean equals(Object object) {
    return false;
  }
  student other = (student) object;
  if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) { return false;}
  return true;
}
@Override
public String toString() {
return "tycs.student[ id=" + id + " ]";
}
}
