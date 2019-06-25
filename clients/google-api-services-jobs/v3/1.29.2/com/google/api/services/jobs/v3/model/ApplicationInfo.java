/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.jobs.v3.model;

/**
 * Application related details of a job posting.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApplicationInfo extends com.google.api.client.json.GenericJson {

  /**
   * Optional but at least one of uris, emails or instruction must be specified.
   *
   * Use this field to specify email address(es) to which resumes or applications can be sent.
   *
   * The maximum number of allowed characters for each entry is 255.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> emails;

  /**
   * Optional but at least one of uris, emails or instruction must be specified.
   *
   * Use this field to provide instructions, such as "Mail your application to ...", that a
   * candidate can follow to apply for the job.
   *
   * This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and
   * unordered list markup tags.
   *
   * The maximum number of allowed characters is 3,000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instruction;

  /**
   * Optional but at least one of uris, emails or instruction must be specified.
   *
   * Use this URI field to direct an applicant to a website, for example to link to an online
   * application form.
   *
   * The maximum number of allowed characters for each entry is 2,000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> uris;

  /**
   * Optional but at least one of uris, emails or instruction must be specified.
   *
   * Use this field to specify email address(es) to which resumes or applications can be sent.
   *
   * The maximum number of allowed characters for each entry is 255.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEmails() {
    return emails;
  }

  /**
   * Optional but at least one of uris, emails or instruction must be specified.
   *
   * Use this field to specify email address(es) to which resumes or applications can be sent.
   *
   * The maximum number of allowed characters for each entry is 255.
   * @param emails emails or {@code null} for none
   */
  public ApplicationInfo setEmails(java.util.List<java.lang.String> emails) {
    this.emails = emails;
    return this;
  }

  /**
   * Optional but at least one of uris, emails or instruction must be specified.
   *
   * Use this field to provide instructions, such as "Mail your application to ...", that a
   * candidate can follow to apply for the job.
   *
   * This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and
   * unordered list markup tags.
   *
   * The maximum number of allowed characters is 3,000.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstruction() {
    return instruction;
  }

  /**
   * Optional but at least one of uris, emails or instruction must be specified.
   *
   * Use this field to provide instructions, such as "Mail your application to ...", that a
   * candidate can follow to apply for the job.
   *
   * This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and
   * unordered list markup tags.
   *
   * The maximum number of allowed characters is 3,000.
   * @param instruction instruction or {@code null} for none
   */
  public ApplicationInfo setInstruction(java.lang.String instruction) {
    this.instruction = instruction;
    return this;
  }

  /**
   * Optional but at least one of uris, emails or instruction must be specified.
   *
   * Use this URI field to direct an applicant to a website, for example to link to an online
   * application form.
   *
   * The maximum number of allowed characters for each entry is 2,000.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUris() {
    return uris;
  }

  /**
   * Optional but at least one of uris, emails or instruction must be specified.
   *
   * Use this URI field to direct an applicant to a website, for example to link to an online
   * application form.
   *
   * The maximum number of allowed characters for each entry is 2,000.
   * @param uris uris or {@code null} for none
   */
  public ApplicationInfo setUris(java.util.List<java.lang.String> uris) {
    this.uris = uris;
    return this;
  }

  @Override
  public ApplicationInfo set(String fieldName, Object value) {
    return (ApplicationInfo) super.set(fieldName, value);
  }

  @Override
  public ApplicationInfo clone() {
    return (ApplicationInfo) super.clone();
  }

}
