package nl.itris.mjop.elements.catalog.handelingen.boundary;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;




@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-11-10T14:14:22.733Z")
public class Deelhandeling   {

  private Long id = null;
  private String omschrijving = null;
  private String vakgroep = null;
  private String eenheid = null;
  private String aantal = null;
  private String bedrag = null;

  public Deelhandeling(nl.itris.mjop.elements.catalog.handelingen.entity.Deelhandeling aDeelhandeling) {
    this();
    this.initializeFrom(aDeelhandeling);
  }
  public Deelhandeling() {
    super();
  }

  private void initializeFrom(nl.itris.mjop.elements.catalog.handelingen.entity.Deelhandeling aDeelhandeling) {
    this.setId(aDeelhandeling.getId());
    this.setOmschrijving(aDeelhandeling.getOmschrijving());
    this.setVakgroep(aDeelhandeling.getVakgroep());
    this.setEenheid(aDeelhandeling.getEenheid());
    this.setAantal(aDeelhandeling.getAantal());
    this.setBedrag(aDeelhandeling.getBedrag());
  }
  /**
   **/
  
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @JsonProperty("omschrijving")
  public String getOmschrijving() {
    return omschrijving;
  }
  public void setOmschrijving(String omschrijving) {
    this.omschrijving = omschrijving;
  }

  /**
   **/
  
  @JsonProperty("vakgroep")
  public String getVakgroep() {
    return vakgroep;
  }
  public void setVakgroep(String vakgroep) {
    this.vakgroep = vakgroep;
  }

  /**
   **/
  
  @JsonProperty("eenheid")
  public String getEenheid() {
    return eenheid;
  }
  public void setEenheid(String eenheid) {
    this.eenheid = eenheid;
  }

  /**
   **/
  
  @JsonProperty("aantal")
  public String getAantal() {
    return aantal;
  }
  public void setAantal(String aantal) {
    this.aantal = aantal;
  }

  /**
   **/
  
  @JsonProperty("bedrag")
  public String getBedrag() {
    return bedrag;
  }
  public void setBedrag(String bedrag) {
    this.bedrag = bedrag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deelhandeling deelhandeling = (Deelhandeling) o;
    return Objects.equals(id, deelhandeling.id) &&
        Objects.equals(omschrijving, deelhandeling.omschrijving) &&
        Objects.equals(vakgroep, deelhandeling.vakgroep) &&
        Objects.equals(eenheid, deelhandeling.eenheid) &&
        Objects.equals(aantal, deelhandeling.aantal) &&
        Objects.equals(bedrag, deelhandeling.bedrag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, omschrijving, vakgroep, eenheid, aantal, bedrag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deelhandeling {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    omschrijving: ").append(toIndentedString(omschrijving)).append("\n");
    sb.append("    vakgroep: ").append(toIndentedString(vakgroep)).append("\n");
    sb.append("    eenheid: ").append(toIndentedString(eenheid)).append("\n");
    sb.append("    aantal: ").append(toIndentedString(aantal)).append("\n");
    sb.append("    bedrag: ").append(toIndentedString(bedrag)).append("\n");
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

