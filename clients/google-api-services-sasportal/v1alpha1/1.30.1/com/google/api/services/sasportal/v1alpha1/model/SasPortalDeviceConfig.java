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

package com.google.api.services.sasportal.v1alpha1.model;

/**
 * Information about the device configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SAS Portal API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SasPortalDeviceConfig extends com.google.api.client.json.GenericJson {

  /**
   * Information about this device's air interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SasPortalDeviceAirInterface airInterface;

  /**
   * The call sign of the device operator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String callSign;

  /**
   * FCC category of the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * Installation parameters for the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SasPortalInstallationParams installationParams;

  /**
   * Output-only. Whether the configuration has been signed by a CPI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSigned;

  /**
   * Measurement reporting capabilities of the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> measurementCapabilities;

  /**
   * Information about this device model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SasPortalDeviceModel model;

  /**
   * State of the configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output-only. The last time the device configuration was edited.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The identifier of a device user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * Information about this device's air interface.
   * @return value or {@code null} for none
   */
  public SasPortalDeviceAirInterface getAirInterface() {
    return airInterface;
  }

  /**
   * Information about this device's air interface.
   * @param airInterface airInterface or {@code null} for none
   */
  public SasPortalDeviceConfig setAirInterface(SasPortalDeviceAirInterface airInterface) {
    this.airInterface = airInterface;
    return this;
  }

  /**
   * The call sign of the device operator.
   * @return value or {@code null} for none
   */
  public java.lang.String getCallSign() {
    return callSign;
  }

  /**
   * The call sign of the device operator.
   * @param callSign callSign or {@code null} for none
   */
  public SasPortalDeviceConfig setCallSign(java.lang.String callSign) {
    this.callSign = callSign;
    return this;
  }

  /**
   * FCC category of the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * FCC category of the device.
   * @param category category or {@code null} for none
   */
  public SasPortalDeviceConfig setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * Installation parameters for the device.
   * @return value or {@code null} for none
   */
  public SasPortalInstallationParams getInstallationParams() {
    return installationParams;
  }

  /**
   * Installation parameters for the device.
   * @param installationParams installationParams or {@code null} for none
   */
  public SasPortalDeviceConfig setInstallationParams(SasPortalInstallationParams installationParams) {
    this.installationParams = installationParams;
    return this;
  }

  /**
   * Output-only. Whether the configuration has been signed by a CPI.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSigned() {
    return isSigned;
  }

  /**
   * Output-only. Whether the configuration has been signed by a CPI.
   * @param isSigned isSigned or {@code null} for none
   */
  public SasPortalDeviceConfig setIsSigned(java.lang.Boolean isSigned) {
    this.isSigned = isSigned;
    return this;
  }

  /**
   * Measurement reporting capabilities of the device.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMeasurementCapabilities() {
    return measurementCapabilities;
  }

  /**
   * Measurement reporting capabilities of the device.
   * @param measurementCapabilities measurementCapabilities or {@code null} for none
   */
  public SasPortalDeviceConfig setMeasurementCapabilities(java.util.List<java.lang.String> measurementCapabilities) {
    this.measurementCapabilities = measurementCapabilities;
    return this;
  }

  /**
   * Information about this device model.
   * @return value or {@code null} for none
   */
  public SasPortalDeviceModel getModel() {
    return model;
  }

  /**
   * Information about this device model.
   * @param model model or {@code null} for none
   */
  public SasPortalDeviceConfig setModel(SasPortalDeviceModel model) {
    this.model = model;
    return this;
  }

  /**
   * State of the configuration.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * State of the configuration.
   * @param state state or {@code null} for none
   */
  public SasPortalDeviceConfig setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output-only. The last time the device configuration was edited.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output-only. The last time the device configuration was edited.
   * @param updateTime updateTime or {@code null} for none
   */
  public SasPortalDeviceConfig setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Output only. The identifier of a device user.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * Output only. The identifier of a device user.
   * @param userId userId or {@code null} for none
   */
  public SasPortalDeviceConfig setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public SasPortalDeviceConfig set(String fieldName, Object value) {
    return (SasPortalDeviceConfig) super.set(fieldName, value);
  }

  @Override
  public SasPortalDeviceConfig clone() {
    return (SasPortalDeviceConfig) super.clone();
  }

}
