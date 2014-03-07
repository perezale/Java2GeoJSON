Java2GeoJSON
============

Create your geographic data in Java, export to GeoJSON

Usage
==========

GeoFeatures defines a whole layer container

* Building path
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
