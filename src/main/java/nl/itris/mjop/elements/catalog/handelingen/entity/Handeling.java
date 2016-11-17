package nl.itris.mjop.elements.catalog.handelingen.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Handeling {
  
  private Long id = null;
  private String omschrijving = null;
  private String cyclus = null;
  private String actie = null;
  private String fonds = null;
  private String werksoort = null;
  private Boolean deelhandeling = null;
  private List<Deelhandeling> deelhandelingen = new ArrayList<Deelhandeling>();

  /**
   **/
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  public String getOmschrijving() {
    return omschrijving;
  }
  public void setOmschrijving(String omschrijving) {
    this.omschrijving = omschrijving;
  }

  /**
   **/
  
  public String getCyclus() {
    return cyclus;
  }
  public void setCyclus(String cyclus) {
    this.cyclus = cyclus;
  }

  /**
   **/
  
  public String getActie() {
    return actie;
  }
  public void setActie(String actie) {
    this.actie = actie;
  }

  /**
   **/
  
  public String getFonds() {
    return fonds;
  }
  public void setFonds(String fonds) {
    this.fonds = fonds;
  }

  /**
   **/
  
  public String getWerksoort() {
    return werksoort;
  }
  public void setWerksoort(String werksoort) {
    this.werksoort = werksoort;
  }

  /**
   **/
  
  public Boolean getDeelhandeling() {
    return deelhandeling;
  }
  public void setDeelhandeling(Boolean deelhandeling) {
    this.deelhandeling = deelhandeling;
  }

  /**
   **/
  
  public List<Deelhandeling> getDeelhandelingen() {
    return deelhandelingen;
  }
  public void setDeelhandelingen(List<Deelhandeling> deelhandelingen) {
    this.deelhandelingen = deelhandelingen;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Handeling handeling = (Handeling) o;
    return Objects.equals(id, handeling.id) &&
        Objects.equals(omschrijving, handeling.omschrijving) &&
        Objects.equals(cyclus, handeling.cyclus) &&
        Objects.equals(actie, handeling.actie) &&
        Objects.equals(fonds, handeling.fonds) &&
        Objects.equals(werksoort, handeling.werksoort) &&
        Objects.equals(deelhandeling, handeling.deelhandeling) &&
        Objects.equals(deelhandelingen, handeling.deelhandelingen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, omschrijving, cyclus, actie, fonds, werksoort, deelhandeling, deelhandelingen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Handeling {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    omschrijving: ").append(toIndentedString(omschrijving)).append("\n");
    sb.append("    cyclus: ").append(toIndentedString(cyclus)).append("\n");
    sb.append("    actie: ").append(toIndentedString(actie)).append("\n");
    sb.append("    fonds: ").append(toIndentedString(fonds)).append("\n");
    sb.append("    werksoort: ").append(toIndentedString(werksoort)).append("\n");
    sb.append("    deelhandeling: ").append(toIndentedString(deelhandeling)).append("\n");
    sb.append("    deelhandelingen: ").append(toIndentedString(deelhandelingen)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

