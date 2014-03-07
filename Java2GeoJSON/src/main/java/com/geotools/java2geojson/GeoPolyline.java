/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geotools.java2geojson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sKaleX
 */
public class GeoPolyline extends GeoGeometry{    
        
    protected List<Float[]> coordList;
    
    public GeoPolyline(){
        this.type = "LineString";
        coordList = new ArrayList<Float[]>();
    }
    
    public GeoPolyline(List<Float[]> coordinatesList){
        this.type = "LineString";
        this.coordList = coordinatesList;
    }
     
    public Float[][] getCoordinates() {
        Float[][] result = new Float[coordList.size()][2];
        for(int i=0; i<coordList.size();i++){
            result[i] = coordList.get(i);
        }            
        return result;
    }

    public void setCoordinates(List<Float[]> coordinates) {
        coordList = coordinates;       
    }
    
    public void addCoordinate(float lat, float lng){
        coordList.add(new Float[] {lng,lat});        
    }
    
}
