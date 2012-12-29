package com.vainolo.phd.opmeta.model.util;

import java.io.IOException;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmeta.model.opmetaPackage;
import com.vainolo.phd.opmodel.model.OPmodelHolder;
import com.vainolo.phd.opmodel.model.opmodelPackage;
import com.vainolo.utils.SimpleLoggerFactory;

public class OPMMLoader {

	private static final Logger logger = SimpleLoggerFactory.createLogger(OPMMLoader.class.getName());

	  public static OPMetaModelDiagram loadOPMetaFile(String uri) {
		  OPMetaModelDiagram opmeta;
		  try {
			  opmeta = (OPMetaModelDiagram)readObject(uri);
		    return opmeta;
		  } catch(final IOException e) {
			  logger.warning("OP Meta File " + uri + " could not be loaded. Please check the path.");
			  logger.fine("Exception thrown: " + e);
			}
			return null;
	  }

	  public static OPmodelHolder loadOPModelFile(String uri){
		  OPmodelHolder opmodel;
		  try {
		    opmodel = (OPmodelHolder)readObject(uri);
		    return opmodel;
		  } catch(final IOException e) {
			  logger.warning("OP Model File " + uri + " could not be loaded. Please check the path.");
			  logger.fine("Exception thrown: " + e);
			}
			return null;
	  }

	private static EObject readObject(String uri) throws IOException {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
		    .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(OPMPackage.eNS_URI,OPMPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(opmetaPackage.eNS_URI,opmetaPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(opmetaPackage.eNS_URI,opmodelPackage.eINSTANCE);
		Resource opmmResource = resourceSet.createResource(URI.createURI(uri));
		
		  opmmResource.load(null);
		  return opmmResource.getContents().get(0);
		
	}
}
