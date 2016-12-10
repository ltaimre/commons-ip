package org.roda_project.commons_ip.model.impl;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.roda_project.commons_ip.model.AIP;
import org.roda_project.commons_ip.model.IP;
import org.roda_project.commons_ip.model.IPContentType;
import org.roda_project.commons_ip.model.IPFile;
import org.roda_project.commons_ip.utils.IPEnums.AIPState;
import org.roda_project.commons_ip.utils.IPEnums.IPType;
import org.roda_project.commons_ip.utils.IPException;

/**
 * AIP basic implementation. This implementation just holds values in memory. It
 * can't read or write AIPs.
 * 
 * Build methods: {@link #build(Path)}, {@link #build(Path, boolean)},
 * {@link #build(Path, String)} and {@link #build(Path, String, boolean)} throw
 * a {@link IPException}.
 *
 * Parse methods: {@link #parse(Path)}, {@link #parse(Path, Path)} throw a
 * {@link org.roda_project.commons_ip.model.ParseException}.
 *
 * @author Rui Castro (rui.castro@gmail.com)
 */
public class BasicAIP extends IP implements AIP {

  /**
   * The state.
   */
  private AIPState state;

  /**
   * List of submission files.
   */
  private List<IPFile> submissions;

  /**
   * Constructor.
   */
  public BasicAIP() {
    super();
    this.setType(IPType.AIP);
    this.submissions = new ArrayList<>();
  }

  /**
   * Constructor.
   *
   * @param id
   *          the ID.
   */
  public BasicAIP(final String id) {
    this();
    setId(id);
  }

  /**
   * Constructor.
   *
   * @param id
   *          the ID.
   * @param contentType
   *          the {@link IPContentType}.
   */
  public BasicAIP(final String id, final IPContentType contentType) {
    this(id);
    setContentType(contentType);
  }

  @Override
  public String toString() {
    return "BasicAIP [super=" + super.toString() + ", submissions=" + submissions + "]";
  }

  @Override
  public void setState(final AIPState state) {
    this.state = state;
  }

  @Override
  public AIPState getState() {
    return state;
  }

  @Override
  public List<IPFile> getSubmissions() {
    return submissions;
  }

  @Override
  public AIP addSubmission(final IPFile submission) {
    this.submissions.add(submission);
    return this;
  }

  @Override
  public Path build(final Path destinationDirectory) throws IPException, InterruptedException {
    throw new IPException("Not implemented");
  }

  @Override
  public Path build(final Path destinationDirectory, final boolean onlyManifest)
    throws IPException, InterruptedException {
    throw new IPException("Not implemented");
  }

  @Override
  public Path build(final Path destinationDirectory, final String fileNameWithoutExtension)
    throws IPException, InterruptedException {
    throw new IPException("Not implemented");
  }

  @Override
  public Path build(final Path destinationDirectory, final String fileNameWithoutExtension, final boolean onlyManifest)
    throws IPException, InterruptedException {
    throw new IPException("Not implemented");
  }
}