package com.geotools.java2geojson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

public class GeoLayer extends GeoObject {

    private List<GeoFeature> features;
    
    public GeoLayer(){
        this.type = "FeatureCollection";
        this.features = new ArrayList<GeoFeature>();
    }	        	    		

    public List<GeoFeature> getFeatures() {
            return features;
    }

    public void setFeatures(List<GeoFeature> features) {
            this.features.addAll(features);
    }

    @Override
    public String toString(){
        ObjectMapper mapper = new ObjectMapper();

        //Pretty writer
        ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();

        String salida = "";

        try {
            salida = writer.writeValueAsString(this);

        } catch (JsonGenerationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        } catch (JsonMappingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }

        return salida;
    }

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        GeoLayer a = new GeoLayer();
        List<GeoFeature> features = new ArrayList<GeoFeature>();
        
        GeoFeature featureA = new GeoFeature();
        featureA.addProperty("Clave", "valor");
        featureA.setGeometry(new GeoMarker(-59.114314913749695f, -37.3267573550453f));        
        features.add(featureA);        
        
        GeoFeature featureB = new GeoFeature();
        featureB.addProperty("color", "00ff00");
        featureB.setGeometry(new GeoPolyline(
                Arrays.asList(new Float[][]{
                    { -59.11476552486419f,
            -37.326435291461266f },
                    { -59.11446779966355f,
            -37.326934382785005f}
                }
                )));
        features.add(featureB);
        
        a.setFeatures(features);
                       
        System.out.println(a);   
    }
}
