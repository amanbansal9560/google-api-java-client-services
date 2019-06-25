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
 * Represents starting and ending value of a range in double.
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
public final class BucketRange extends com.google.api.client.json.GenericJson {

  /**
   * Starting value of the bucket range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double from;

  /**
   * Ending value of the bucket range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double to;

  /**
   * Starting value of the bucket range.
   * @return value or {@code null} for none
   */
  public java.lang.Double getFrom() {
    return from;
  }

  /**
   * Starting value of the bucket range.
   * @param from from or {@code null} for none
   */
  public BucketRange setFrom(java.lang.Double from) {
    this.from = from;
    return this;
  }

  /**
   * Ending value of the bucket range.
   * @return value or {@code null} for none
   */
  public java.lang.Double getTo() {
    return to;
  }

  /**
   * Ending value of the bucket range.
   * @param to to or {@code null} for none
   */
  public BucketRange setTo(java.lang.Double to) {
    this.to = to;
    return this;
  }

  @Override
  public BucketRange set(String fieldName, Object value) {
    return (BucketRange) super.set(fieldName, value);
  }

  @Override
  public BucketRange clone() {
    return (BucketRange) super.clone();
  }

}
