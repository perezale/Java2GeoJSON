/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geotools.java2geojson;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sKaleX
 */
public class GeoFeature extends GeoObject {        
	
    // El valor de una propiedad puede ser una Cadena ó un Numero
    private Map<String, Object> properties;
    private GeoGeometry geometry;	

    public GeoFeature(){
        this.type= "Feature";
        properties = new HashMap<String, Object>();		
    }

    public Map<String, Object> getProperties() {
            return properties;
    }

    public void setProperties(Map<String, Object> properties) {
            this.properties = properties;
    }

    public void addProperty(String key, Object value){
            this.properties.put(key, value);
    }

    public GeoGeometry getGeometry() {
            return geometry;
    }

    public void setGeometry(GeoGeometry geometry) {
            this.geometry = geometry;
    }
    
}
