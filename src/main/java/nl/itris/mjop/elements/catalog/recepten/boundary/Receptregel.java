/*
 * Elementen catalogus
 * Dit is de API voor de Elementen catalogus, deze API bevat alle calls om elementen uit de catalogus op te halen, weg te schrijven en te manipuleren. 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package nl.itris.mjop.elements.catalog.recepten.boundary;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Receptregel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-16T10:57:20.256Z")
public class Receptregel   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("normtype")
  private String normtype = null;

  @JsonProperty("normomschrijving")
  private String normomschrijving = null;

  @JsonProperty("aantaleenheid")
  private String aantaleenheid = null;

  @JsonProperty("kostprijs")
  private String kostprijs = null;

  @JsonProperty("totaalprijs")
  private String totaalprijs = null;

  public Receptregel id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Receptregel normtype(String normtype) {
    this.normtype = normtype;
    return this;
  }

   /**
   * Get normtype
   * @return normtype
  **/
  @ApiModelProperty(value = "")
  public String getNormtype() {
    return normtype;
  }

  public void setNormtype(String normtype) {
    this.normtype = normtype;
  }

  public Receptregel normomschrijving(String normomschrijving) {
    this.normomschrijving = normomschrijving;
    return this;
  }

   /**
   * Get normomschrijving
   * @return normomschrijving
  **/
  @ApiModelProperty(value = "")
  public String getNormomschrijving() {
    return normomschrijving;
  }

  public void setNormomschrijving(String normomschrijving) {
    this.normomschrijving = normomschrijving;
  }

  public Receptregel aantaleenheid(String aantaleenheid) {
    this.aantaleenheid = aantaleenheid;
    return this;
  }

   /**
   * Get aantaleenheid
   * @return aantaleenheid
  **/
  @ApiModelProperty(value = "")
  public String getAantaleenheid() {
    return aantaleenheid;
  }

  public void setAantaleenheid(String aantaleenheid) {
    this.aantaleenheid = aantaleenheid;
  }

  public Receptregel kostprijs(String kostprijs) {
    this.kostprijs = kostprijs;
    return this;
  }

   /**
   * Get kostprijs
   * @return kostprijs
  **/
  @ApiModelProperty(value = "")
  public String getKostprijs() {
    return kostprijs;
  }

  public void setKostprijs(String kostprijs) {
    this.kostprijs = kostprijs;
  }

  public Receptregel totaalprijs(String totaalprijs) {
    this.totaalprijs = totaalprijs;
    return this;
  }

   /**
   * Get totaalprijs
   * @return totaalprijs
  **/
  @ApiModelProperty(value = "")
  public String getTotaalprijs() {
    return totaalprijs;
  }

  public void setTotaalprijs(String totaalprijs) {
    this.totaalprijs = totaalprijs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Receptregel receptregel = (Receptregel) o;
    return Objects.equals(this.id, receptregel.id) &&
        Objects.equals(this.normtype, receptregel.normtype) &&
        Objects.equals(this.normomschrijving, receptregel.normomschrijving) &&
        Objects.equals(this.aantaleenheid, receptregel.aantaleenheid) &&
        Objects.equals(this.kostprijs, receptregel.kostprijs) &&
        Objects.equals(this.totaalprijs, receptregel.totaalprijs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, normtype, normomschrijving, aantaleenheid, kostprijs, totaalprijs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Receptregel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    normtype: ").append(toIndentedString(normtype)).append("\n");
    sb.append("    normomschrijving: ").append(toIndentedString(normomschrijving)).append("\n");
    sb.append("    aantaleenheid: ").append(toIndentedString(aantaleenheid)).append("\n");
    sb.append("    kostprijs: ").append(toIndentedString(kostprijs)).append("\n");
    sb.append("    totaalprijs: ").append(toIndentedString(totaalprijs)).append("\n");
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
