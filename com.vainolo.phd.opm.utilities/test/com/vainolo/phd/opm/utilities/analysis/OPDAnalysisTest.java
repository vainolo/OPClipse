package com.vainolo.phd.opm.utilities.analysis;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Maps;
import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMObject;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMProcess;
import com.vainolo.phd.opm.model.OPMStructuralLinkAggregator;

public class OPDAnalysisTest {

  private OPMObjectProcessDiagram systemOPD;
  private Map<Integer, OPMProcess> systemProcesses = Maps.newHashMap();
  private Map<Integer, OPMObject> systemObjects = Maps.newHashMap();
  private Map<Integer, OPMStructuralLinkAggregator> systemAggregators = Maps.newHashMap();
  private Map<Integer, OPMLink> systemStructuralLinks = Maps.newHashMap();

  private OPMObjectProcessDiagram inZoomedOPD;
  private Map<Integer, OPMProcess> inZoomedProcesses = Maps.newHashMap();
  private Map<Integer, OPMObject> inZoomedObjects = Maps.newHashMap();
  private Map<Integer, OPMStructuralLinkAggregator> inZoomedAggregators = Maps.newHashMap();
  private Map<Integer, OPMLink> inZoomedStructuralLinks = Maps.newHashMap();

  private OPDAnalysis systemOPDFixture;
  private OPDAnalysis inZoomedOPDFixture;

  @Test
  public void testFindIncomingStructuralLinks() {
    Collection<OPMLink> result = systemOPDFixture.findIncomingStructuralLinks(systemObjects.get(2));
    assertEquals(2, result.size());
    assertTrue(result.contains(systemStructuralLinks.get(2)));
    assertTrue(result.contains(systemStructuralLinks.get(4)));
  }

  @Test
  public void testFindOutgoingStructuralLinks() {
    Collection<OPMLink> result = systemOPDFixture.findOutgoingStructuralLinks(systemObjects.get(3));

    assertEquals(2, result.size());
    assertTrue(result.contains(systemStructuralLinks.get(3)));
    assertTrue(result.contains(systemStructuralLinks.get(5)));
  }

  @Test
  public void testFindInZoomedProcess() {
    OPMProcess result = inZoomedOPDFixture.findZoomedInProcess(inZoomedOPD);
    assertEquals(inZoomedProcesses.get(0), result);
  }

  @Test(expected = RuntimeException.class)
  public void testFindInZoomedProcess_IllegalCall() {
    systemOPDFixture.findZoomedInProcess(systemOPD);
  }

  @Before
  public void setUp() {
    initSystemOPD();
    initInZoomedOPD();
    systemOPDFixture = new OPDAnalysis(systemOPD);
    inZoomedOPDFixture = new OPDAnalysis(inZoomedOPD);
  }

  public void initSystemOPD() {
    systemOPD = OPMFactory.eINSTANCE.createOPMObjectProcessDiagram();

    createProcesses(systemOPD, systemProcesses, 5);
    createObjects(systemOPD, systemObjects, 5);
    createAggregators(systemOPD, systemAggregators, 3);

    // create some structural links.
    OPMLink link = OPMFactory.eINSTANCE.createOPMLink();
    link.setSource(systemObjects.get(0));
    link.setTarget(systemAggregators.get(0));
    systemStructuralLinks.put(0, link);

    link = OPMFactory.eINSTANCE.createOPMLink();
    link.setSource(systemAggregators.get(0));
    link.setTarget(systemObjects.get(1));
    systemStructuralLinks.put(1, link);

    link = OPMFactory.eINSTANCE.createOPMLink();
    link.setSource(systemAggregators.get(0));
    link.setTarget(systemObjects.get(2));
    systemStructuralLinks.put(2, link);

    link = OPMFactory.eINSTANCE.createOPMLink();
    link.setSource(systemObjects.get(3));
    link.setTarget(systemAggregators.get(1));
    systemStructuralLinks.put(3, link);

    link = OPMFactory.eINSTANCE.createOPMLink();
    link.setSource(systemAggregators.get(1));
    link.setTarget(systemObjects.get(2));
    systemStructuralLinks.put(4, link);

    link = OPMFactory.eINSTANCE.createOPMLink();
    link.setSource(systemObjects.get(3));
    link.setTarget(systemAggregators.get(2));
    systemStructuralLinks.put(5, link);

    link = OPMFactory.eINSTANCE.createOPMLink();
    link.setSource(systemAggregators.get(2));
    link.setTarget(systemObjects.get(4));
    systemStructuralLinks.put(6, link);

  }

  private void initInZoomedOPD() {
    inZoomedOPD = OPMFactory.eINSTANCE.createOPMObjectProcessDiagram();
    createProcesses(inZoomedOPD, inZoomedProcesses, 1);
    createObjects(inZoomedOPD, inZoomedObjects, 5);
    createAggregators(inZoomedOPD, inZoomedAggregators, 3);

  }

  private void createObjects(OPMObjectProcessDiagram opd, Map<Integer, OPMObject> objects, int number) {
    for(int i = 0; i < number; i++) {
      OPMObject object = OPMFactory.eINSTANCE.createOPMObject();
      object.setName(Integer.toString(i + 5));
      objects.put(i, object);
      opd.getNodes().add(object);
    }
  }

  private void createProcesses(OPMObjectProcessDiagram opd, Map<Integer, OPMProcess> processes, int number) {
    for(int i = 0; i < number; i++) {
      OPMProcess process = OPMFactory.eINSTANCE.createOPMProcess();
      process.setName(Integer.toString(i + 5));
      processes.put(i, process);
      opd.getNodes().add(process);
    }
  }

  private void createAggregators(OPMObjectProcessDiagram opd, Map<Integer, OPMStructuralLinkAggregator> aggregators,
      int number) {
    for(int i = 0; i < number; i++) {
      OPMStructuralLinkAggregator aggregator = OPMFactory.eINSTANCE.createOPMStructuralLinkAggregator();
      aggregators.put(i, aggregator);
      opd.getNodes().add(aggregator);
    }
  }

}