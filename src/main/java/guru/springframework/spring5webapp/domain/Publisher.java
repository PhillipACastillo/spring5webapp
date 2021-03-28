package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {

  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  private Long id;

  private String name;
  private String address1;
  private String city;
  private String state;
  private int zip;

  @OneToMany
  @JoinColumn(name = "publisher_id")
  private Set<Book> books = new HashSet<>();

  public Publisher(String name, String address1, String city, String state, int zip) {
    this.name = name;
    this.address1 = address1;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

  public Publisher() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public int getZip() {
    return zip;
  }

  public void setZip(int zip) {
    this.zip = zip;
  }

  public Set<Book> getBooks() {
    return books;
  }

  public void setBooks(Set<Book> books) {
    this.books = books;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Publisher publisher = (Publisher) o;

    return id != null ? id.equals(publisher.id) : publisher.id == null;
  }

  @Override
  public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Publisher{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", address1='" + address1 + '\'' +
        ", city='" + city + '\'' +
        ", state='" + state + '\'' +
        ", zip=" + zip +
        '}';
  }
}
