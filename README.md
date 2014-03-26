Java2GeoJSON
============
Your geographic information model, exported to valid GeoJSON

Usage
==========
A GeoFeature describes a container of layers. Each of these layers may contain a set of geographic elements.

* Building a linestring
```java
GeoFeature[] parsePath(Node[] path){
	//Generate GeoJson objects
	GeoFeature pathLayer = new GeoFeature();
	GeoPolyline path = new GeoPolyline();		
	for (Node node : path) {						
		float lat = node.getLat();
		float lng = node.getLng();
		path.addCoordinate(lat, lng);									
	}
	pathLayer.setGeometry(path);
	return new GeoFeature[]{pathLayer};
}
```

*
Dependencies
==========

* jackson-core-asl
* jackson-mapper-asl
  
  http://repository.codehaus.org/org/codehaus/jackson/

For more information visit: www.geojson.com.ar
