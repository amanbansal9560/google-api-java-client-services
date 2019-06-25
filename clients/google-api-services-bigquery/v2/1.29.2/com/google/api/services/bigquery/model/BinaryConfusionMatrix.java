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

package com.google.api.services.bigquery.model;

/**
 * Confusion matrix for binary classification models.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BinaryConfusionMatrix extends com.google.api.client.json.GenericJson {

  /**
   * The fraction of predictions given the correct label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double accuracy;

  /**
   * The equally weighted average of recall and precision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double f1Score;

  /**
   * Number of false samples predicted as false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long falseNegatives;

  /**
   * Number of false samples predicted as true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long falsePositives;

  /**
   * Threshold value used when computing each of the following metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double positiveClassThreshold;

  /**
   * The fraction of actual positive predictions that had positive actual labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double precision;

  /**
   * The fraction of actual positive labels that were given a positive prediction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double recall;

  /**
   * Number of true samples predicted as false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long trueNegatives;

  /**
   * Number of true samples predicted as true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long truePositives;

  /**
   * The fraction of predictions given the correct label.
   * @return value or {@code null} for none
   */
  public java.lang.Double getAccuracy() {
    return accuracy;
  }

  /**
   * The fraction of predictions given the correct label.
   * @param accuracy accuracy or {@code null} for none
   */
  public BinaryConfusionMatrix setAccuracy(java.lang.Double accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  /**
   * The equally weighted average of recall and precision.
   * @return value or {@code null} for none
   */
  public java.lang.Double getF1Score() {
    return f1Score;
  }

  /**
   * The equally weighted average of recall and precision.
   * @param f1Score f1Score or {@code null} for none
   */
  public BinaryConfusionMatrix setF1Score(java.lang.Double f1Score) {
    this.f1Score = f1Score;
    return this;
  }

  /**
   * Number of false samples predicted as false.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFalseNegatives() {
    return falseNegatives;
  }

  /**
   * Number of false samples predicted as false.
   * @param falseNegatives falseNegatives or {@code null} for none
   */
  public BinaryConfusionMatrix setFalseNegatives(java.lang.Long falseNegatives) {
    this.falseNegatives = falseNegatives;
    return this;
  }

  /**
   * Number of false samples predicted as true.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFalsePositives() {
    return falsePositives;
  }

  /**
   * Number of false samples predicted as true.
   * @param falsePositives falsePositives or {@code null} for none
   */
  public BinaryConfusionMatrix setFalsePositives(java.lang.Long falsePositives) {
    this.falsePositives = falsePositives;
    return this;
  }

  /**
   * Threshold value used when computing each of the following metric.
   * @return value or {@code null} for none
   */
  public java.lang.Double getPositiveClassThreshold() {
    return positiveClassThreshold;
  }

  /**
   * Threshold value used when computing each of the following metric.
   * @param positiveClassThreshold positiveClassThreshold or {@code null} for none
   */
  public BinaryConfusionMatrix setPositiveClassThreshold(java.lang.Double positiveClassThreshold) {
    this.positiveClassThreshold = positiveClassThreshold;
    return this;
  }

  /**
   * The fraction of actual positive predictions that had positive actual labels.
   * @return value or {@code null} for none
   */
  public java.lang.Double getPrecision() {
    return precision;
  }

  /**
   * The fraction of actual positive predictions that had positive actual labels.
   * @param precision precision or {@code null} for none
   */
  public BinaryConfusionMatrix setPrecision(java.lang.Double precision) {
    this.precision = precision;
    return this;
  }

  /**
   * The fraction of actual positive labels that were given a positive prediction.
   * @return value or {@code null} for none
   */
  public java.lang.Double getRecall() {
    return recall;
  }

  /**
   * The fraction of actual positive labels that were given a positive prediction.
   * @param recall recall or {@code null} for none
   */
  public BinaryConfusionMatrix setRecall(java.lang.Double recall) {
    this.recall = recall;
    return this;
  }

  /**
   * Number of true samples predicted as false.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTrueNegatives() {
    return trueNegatives;
  }

  /**
   * Number of true samples predicted as false.
   * @param trueNegatives trueNegatives or {@code null} for none
   */
  public BinaryConfusionMatrix setTrueNegatives(java.lang.Long trueNegatives) {
    this.trueNegatives = trueNegatives;
    return this;
  }

  /**
   * Number of true samples predicted as true.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTruePositives() {
    return truePositives;
  }

  /**
   * Number of true samples predicted as true.
   * @param truePositives truePositives or {@code null} for none
   */
  public BinaryConfusionMatrix setTruePositives(java.lang.Long truePositives) {
    this.truePositives = truePositives;
    return this;
  }

  @Override
  public BinaryConfusionMatrix set(String fieldName, Object value) {
    return (BinaryConfusionMatrix) super.set(fieldName, value);
  }

  @Override
  public BinaryConfusionMatrix clone() {
    return (BinaryConfusionMatrix) super.clone();
  }

}