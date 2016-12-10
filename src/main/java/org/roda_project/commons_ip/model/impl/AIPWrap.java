package org.roda_project.commons_ip.model.impl;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import javax.xml.datatype.XMLGregorianCalendar;

import org.roda_project.commons_ip.model.AIP;
import org.roda_project.commons_ip.model.IP;
import org.roda_project.commons_ip.model.IPAgent;
import org.roda_project.commons_ip.model.IPContentType;
import org.roda_project.commons_ip.model.IPDescriptiveMetadata;
import org.roda_project.commons_ip.model.IPFile;
import org.roda_project.commons_ip.model.IPMetadata;
import org.roda_project.commons_ip.model.IPRepresentation;
import org.roda_project.commons_ip.model.ValidationReport;
import org.roda_project.commons_ip.utils.IPEnums;
import org.roda_project.commons_ip.utils.IPEnums.AIPState;
import org.roda_project.commons_ip.utils.IPException;
import org.roda_project.commons_ip.utils.SIPException;
import org.roda_project.commons_ip.utils.ZipEntryInfo;

/**
 * AIP decorator (wrapper).
 * 
 * @author Rui Castro (rui.castro@gmail.com)
 */
public class AIPWrap implements AIP {

  /**
   * The wrapped {@link AIP}.
   */
  private final AIP aip;

  /**
   * Constructor.
   * 
   * @param aip
   *          the {@link AIP} to wrap.
   */
  public AIPWrap(final AIP aip) {
    this.aip = aip;
  }

  @Override
  public String toString() {
    return aip.toString();
  }

  @Override
  public IP setId(final String id) {
    return aip.setId(id);
  }

  @Override
  public String getId() {
    return aip.getId();
  }

  @Override
  public IP setIds(final List<String> ids) {
    return aip.setIds(ids);
  }

  @Override
  public List<String> getIds() {
    return aip.getIds();
  }

  @Override
  public IP setProfile(final String profile) {
    return aip.setProfile(profile);
  }

  @Override
  public String getProfile() {
    return aip.getProfile();
  }

  @Override
  public IP setType(final IPEnums.IPType type) {
    return aip.setType(type);
  }

  @Override
  public String getType() {
    return aip.getType();
  }

  @Override
  public void setState(final AIPState state) {
    aip.setState(state);
  }

  @Override
  public AIPState getState() {
    return aip.getState();
  }

  @Override
  public IP setContentType(final IPContentType contentType) {
    return aip.setContentType(contentType);
  }

  @Override
  public IPContentType getContentType() {
    return aip.getContentType();
  }

  @Override
  public void setStatus(final IPEnums.IPStatus status) {
    aip.setStatus(status);
  }

  @Override
  public IPEnums.IPStatus getStatus() {
    return aip.getStatus();
  }

  @Override
  public void setCreateDate(final XMLGregorianCalendar date) {
    aip.setCreateDate(date);
  }

  @Override
  public Optional<XMLGregorianCalendar> getCreateDate() {
    return aip.getCreateDate();
  }

  @Override
  public void setModificationDate(final XMLGregorianCalendar date) {
    aip.setModificationDate(date);
  }

  @Override
  public Optional<XMLGregorianCalendar> getModificationDate() {
    return aip.getModificationDate();
  }

  @Override
  public List<String> getAncestors() {
    return aip.getAncestors();
  }

  @Override
  public IP setAncestors(final List<String> ancestors) {
    return aip.setAncestors(ancestors);
  }

  @Override
  public IP setBasePath(final Path basePath) {
    return aip.setBasePath(basePath);
  }

  @Override
  public Path getBasePath() {
    return aip.getBasePath();
  }

  @Override
  public IP setDescription(final String description) {
    return aip.setDescription(description);
  }

  @Override
  public String getDescription() {
    return aip.getDescription();
  }

  @Override
  public IP addAgent(final IPAgent sipAgent) {
    return aip.addAgent(sipAgent);
  }

  @Override
  public IP addPreservationMetadata(final IPMetadata sipMetadata) throws IPException {
    return aip.addPreservationMetadata(sipMetadata);
  }

  @Override
  public IP addOtherMetadata(final IPMetadata sipMetadata) throws IPException {
    return aip.addOtherMetadata(sipMetadata);
  }

  @Override
  public IP addDescriptiveMetadata(final IPDescriptiveMetadata metadata) throws IPException {
    return aip.addDescriptiveMetadata(metadata);
  }

  @Override
  public IP addRepresentation(final IPRepresentation sipRepresentation) throws IPException {
    return aip.addRepresentation(sipRepresentation);
  }

  @Override
  public IP addSchema(final IPFile schema) {
    return aip.addSchema(schema);
  }

  @Override
  public AIP addSubmission(final IPFile submission) {
    return aip.addSubmission(submission);
  }

  @Override
  public IP addDocumentation(final IPFile documentationPath) {
    return aip.addDocumentation(documentationPath);
  }

  @Override
  public IP addAgentToRepresentation(final String representationID, final IPAgent agent) throws SIPException {
    return aip.addAgentToRepresentation(representationID, agent);
  }

  @Override
  public IP addDescriptiveMetadataToRepresentation(final String representationID,
    final IPDescriptiveMetadata descriptiveMetadata) throws SIPException {
    return aip.addDescriptiveMetadataToRepresentation(representationID, descriptiveMetadata);
  }

  @Override
  public IP addPreservationMetadataToRepresentation(final String representationID,
    final IPMetadata preservationMetadata) throws SIPException {
    return aip.addPreservationMetadataToRepresentation(representationID, preservationMetadata);
  }

  @Override
  public IP addOtherMetadataToRepresentation(final String representationID, final IPMetadata otherMetadata)
    throws SIPException {
    return aip.addOtherMetadataToRepresentation(representationID, otherMetadata);
  }

  @Override
  public IP addFileToRepresentation(final String representationID, final IPFile file) throws SIPException {
    return aip.addFileToRepresentation(representationID, file);
  }

  @Override
  public IP addSchemaToRepresentation(final String representationID, final IPFile schema) throws SIPException {
    return aip.addSchemaToRepresentation(representationID, schema);
  }

  @Override
  public IP addDocumentationToRepresentation(final String representationID, final IPFile documentation)
    throws SIPException {
    return aip.addDocumentationToRepresentation(representationID, documentation);
  }

  @Override
  public List<IPAgent> getAgents() {
    return aip.getAgents();
  }

  @Override
  public List<IPDescriptiveMetadata> getDescriptiveMetadata() {
    return aip.getDescriptiveMetadata();
  }

  @Override
  public List<IPMetadata> getPreservationMetadata() {
    return aip.getPreservationMetadata();
  }

  @Override
  public List<IPMetadata> getOtherMetadata() {
    return aip.getOtherMetadata();
  }

  @Override
  public List<IPRepresentation> getRepresentations() {
    return aip.getRepresentations();
  }

  @Override
  public List<IPFile> getSchemas() {
    return aip.getSchemas();
  }

  @Override
  public List<IPFile> getSubmissions() {
    return aip.getSubmissions();
  }

  @Override
  public List<IPFile> getDocumentation() {
    return aip.getDocumentation();
  }

  @Override
  public List<ZipEntryInfo> getZipEntries() {
    return aip.getZipEntries();
  }

  @Override
  public ValidationReport getValidationReport() {
    return aip.getValidationReport();
  }

  @Override
  public boolean isValid() {
    return aip.isValid();
  }

  @Override
  public Path build(final Path destinationDirectory) throws IPException, InterruptedException {
    return aip.build(destinationDirectory);
  }

  @Override
  public Path build(final Path destinationDirectory, final boolean onlyManifest)
    throws IPException, InterruptedException {
    return aip.build(destinationDirectory, onlyManifest);
  }

  @Override
  public Path build(final Path destinationDirectory, final String fileNameWithoutExtension)
    throws IPException, InterruptedException {
    return aip.build(destinationDirectory, fileNameWithoutExtension);
  }

  @Override
  public Path build(final Path destinationDirectory, final String fileNameWithoutExtension, final boolean onlyManifest)
    throws IPException, InterruptedException {
    return aip.build(destinationDirectory, fileNameWithoutExtension, onlyManifest);
  }

}