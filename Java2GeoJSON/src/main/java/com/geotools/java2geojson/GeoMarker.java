/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geotools.java2geojson;

/**
 *
 * @author sKaleX
 */
public class GeoMarker extends GeoGeometry{   
    
    protected Float[] coordinates;
    
    public GeoMarker(float lat, float lng){
            this.type = "Point";
            this.coordinates = new Float[]{lng,lat};
    }
    
    public Float[] getCoordinates() {
            return coordinates;
    }

    public void setCoordinates(Float[] coordinates) {
            this.coordinates = coordinates;
    }	
	
   

    
	
}
