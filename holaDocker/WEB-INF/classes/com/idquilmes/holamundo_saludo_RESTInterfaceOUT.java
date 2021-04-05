package com.idquilmes ;
import com.idquilmes.*;
import com.genexus.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name =  "holamundo_saludo_RESTInterfaceOUT" , namespace = "http://tempuri.org/" , propOrder={  })
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class holamundo_saludo_RESTInterfaceOUT
{
   String AV5Mensaje;
   @XmlElement(name="Mensaje")
   @JsonProperty("Mensaje")
   public String getMensaje( )
   {
      return AV5Mensaje ;
   }

   @JsonProperty("Mensaje")
   public void setMensaje(  String Value )
   {
      AV5Mensaje= Value;
   }


}

