package com.vainolo.phd.opmeta.model.util;

import java.io.IOException;
import java.util.logging.Logger;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.utils.SimpleLoggerFactory;

public class OPMMLoader {

	private static final Logger logger = SimpleLoggerFactory.createLogger(OPMMLoader.class.getName());

	  public static OPMetaModelDiagram loadOPDFile(String uri) {
		  OPMetaModelDiagram opd;
	    final ResourceSet resourceSet = new ResourceSetImpl();
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
	        .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	    final Resource opdResource = resourceSet.createResource(URI.createURI(uri));
	    try {
	      opdResource.load(null);
	      opd = (OPMetaModelDiagram) opdResource.getContents().get(0);
	    } catch(final IOException e) {
	      logger.warning("OPD File " + uri + " could not be loaded. Please check the path.");
	      logger.fine("Exception thrown: " + e);
	      opd = null;
	    }
	    
	    return opd;
	  }
}
