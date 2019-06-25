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
 * Compensation range.
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
public final class CompensationRange extends com.google.api.client.json.GenericJson {

  /**
   * Optional.
   *
   * The maximum amount of compensation. If left empty, the value is set to a maximal compensation
   * value and the currency code is set to match the currency code of min_compensation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money maxCompensation;

  /**
   * Optional.
   *
   * The minimum amount of compensation. If left empty, the value is set to zero and the currency
   * code is set to match the currency code of max_compensation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money minCompensation;

  /**
   * Optional.
   *
   * The maximum amount of compensation. If left empty, the value is set to a maximal compensation
   * value and the currency code is set to match the currency code of min_compensation.
   * @return value or {@code null} for none
   */
  public Money getMaxCompensation() {
    return maxCompensation;
  }

  /**
   * Optional.
   *
   * The maximum amount of compensation. If left empty, the value is set to a maximal compensation
   * value and the currency code is set to match the currency code of min_compensation.
   * @param maxCompensation maxCompensation or {@code null} for none
   */
  public CompensationRange setMaxCompensation(Money maxCompensation) {
    this.maxCompensation = maxCompensation;
    return this;
  }

  /**
   * Optional.
   *
   * The minimum amount of compensation. If left empty, the value is set to zero and the currency
   * code is set to match the currency code of max_compensation.
   * @return value or {@code null} for none
   */
  public Money getMinCompensation() {
    return minCompensation;
  }

  /**
   * Optional.
   *
   * The minimum amount of compensation. If left empty, the value is set to zero and the currency
   * code is set to match the currency code of max_compensation.
   * @param minCompensation minCompensation or {@code null} for none
   */
  public CompensationRange setMinCompensation(Money minCompensation) {
    this.minCompensation = minCompensation;
    return this;
  }

  @Override
  public CompensationRange set(String fieldName, Object value) {
    return (CompensationRange) super.set(fieldName, value);
  }

  @Override
  public CompensationRange clone() {
    return (CompensationRange) super.clone();
  }

}
