package nl.itris.mjop.elements.catalog.handelingen.entity;

import javax.persistence.*;

@Entity
@Table(name = "NPO_DEELHANDELING")
@NamedQuery(name = Deelhandeling.findAll, query = "SELECT e FROM Deelhandeling e")
public class Deelhandeling {

  private static final String PREFIX = "nl.itris.mjop.entity.Element.";
  public static final String findAll = PREFIX + "all";

  private Long id;
  private String omschrijving = null;
  private String vakgroep = null;
  private String eenheid = null;
  private String aantal = null;
  private String bedrag = null;

  protected Deelhandeling() {
    super();
  }

  public Deelhandeling(String aOmschrijving, String aVakgroep, String aEenheid, String aAantal, String aBedrag) {
    this();

    this.setOmschrijving(aOmschrijving);
    this.setVakgroep(aVakgroep);
    this.setEenheid(aEenheid);
    this.setAantal(aAantal);
    this.setBedrag(aBedrag);
  }

  /**
   **/

  @Id
  @Column(name = "ID", length = 16)
  public Long getId() {
    return id;
  }
  public void setId(Long aid) {
    id = aid;
  }

  @Column(name = "OMSCHRIJVING", length = 30)
  public String getOmschrijving() {
    return omschrijving;
  }
  public void setOmschrijving(String omschrijving) {
    this.omschrijving = omschrijving;
  }

  /**
   **/

  @Column(name = "VAKGROEP", length = 30)
  public String getVakgroep() {
    return vakgroep;
  }
  public void setVakgroep(String vakgroep) {
    this.vakgroep = vakgroep;
  }

  /**
   **/

  @Column(name = "EENHEID", length = 30)
  public String getEenheid() {
    return eenheid;
  }
  public void setEenheid(String eenheid) {
    this.eenheid = eenheid;
  }

  /**
   **/

  @Column(name = "AANTAL", length = 30)
  public String getAantal() {
    return aantal;
  }
  public void setAantal(String aantal) {
    this.aantal = aantal;
  }

  /**
   **/

  @Column(name = "BEDRAG", length = 30)
  public String getBedrag() {
    return bedrag;
  }
  public void setBedrag(String bedrag) {
    this.bedrag = bedrag;
  }


}

