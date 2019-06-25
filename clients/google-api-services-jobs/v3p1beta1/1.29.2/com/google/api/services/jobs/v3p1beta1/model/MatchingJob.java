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

package com.google.api.services.jobs.v3p1beta1.model;

/**
 * Output only.
 *
 * Job entry with metadata inside SearchJobsResponse.
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
public final class MatchingJob extends com.google.api.client.json.GenericJson {

  /**
   * Commute information which is generated based on specified  CommuteFilter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CommuteInfo commuteInfo;

  /**
   * Job resource that matches the specified SearchJobsRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Job job;

  /**
   * A summary of the job with core information that's displayed on the search results listing page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobSummary;

  /**
   * Contains snippets of text from the Job.job_title field most closely matching a search query's
   * keywords, if available. The matching query keywords are enclosed in HTML bold tags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobTitleSnippet;

  /**
   * Contains snippets of text from the Job.description and similar fields that most closely match a
   * search query's keywords, if available. All HTML tags in the original fields are stripped when
   * returned in this field, and matching query keywords are enclosed in HTML bold tags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchTextSnippet;

  /**
   * Commute information which is generated based on specified  CommuteFilter.
   * @return value or {@code null} for none
   */
  public CommuteInfo getCommuteInfo() {
    return commuteInfo;
  }

  /**
   * Commute information which is generated based on specified  CommuteFilter.
   * @param commuteInfo commuteInfo or {@code null} for none
   */
  public MatchingJob setCommuteInfo(CommuteInfo commuteInfo) {
    this.commuteInfo = commuteInfo;
    return this;
  }

  /**
   * Job resource that matches the specified SearchJobsRequest.
   * @return value or {@code null} for none
   */
  public Job getJob() {
    return job;
  }

  /**
   * Job resource that matches the specified SearchJobsRequest.
   * @param job job or {@code null} for none
   */
  public MatchingJob setJob(Job job) {
    this.job = job;
    return this;
  }

  /**
   * A summary of the job with core information that's displayed on the search results listing page.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobSummary() {
    return jobSummary;
  }

  /**
   * A summary of the job with core information that's displayed on the search results listing page.
   * @param jobSummary jobSummary or {@code null} for none
   */
  public MatchingJob setJobSummary(java.lang.String jobSummary) {
    this.jobSummary = jobSummary;
    return this;
  }

  /**
   * Contains snippets of text from the Job.job_title field most closely matching a search query's
   * keywords, if available. The matching query keywords are enclosed in HTML bold tags.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobTitleSnippet() {
    return jobTitleSnippet;
  }

  /**
   * Contains snippets of text from the Job.job_title field most closely matching a search query's
   * keywords, if available. The matching query keywords are enclosed in HTML bold tags.
   * @param jobTitleSnippet jobTitleSnippet or {@code null} for none
   */
  public MatchingJob setJobTitleSnippet(java.lang.String jobTitleSnippet) {
    this.jobTitleSnippet = jobTitleSnippet;
    return this;
  }

  /**
   * Contains snippets of text from the Job.description and similar fields that most closely match a
   * search query's keywords, if available. All HTML tags in the original fields are stripped when
   * returned in this field, and matching query keywords are enclosed in HTML bold tags.
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchTextSnippet() {
    return searchTextSnippet;
  }

  /**
   * Contains snippets of text from the Job.description and similar fields that most closely match a
   * search query's keywords, if available. All HTML tags in the original fields are stripped when
   * returned in this field, and matching query keywords are enclosed in HTML bold tags.
   * @param searchTextSnippet searchTextSnippet or {@code null} for none
   */
  public MatchingJob setSearchTextSnippet(java.lang.String searchTextSnippet) {
    this.searchTextSnippet = searchTextSnippet;
    return this;
  }

  @Override
  public MatchingJob set(String fieldName, Object value) {
    return (MatchingJob) super.set(fieldName, value);
  }

  @Override
  public MatchingJob clone() {
    return (MatchingJob) super.clone();
  }

}
