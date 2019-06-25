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

package com.google.api.services.speech.v1p1beta1.model;

/**
 * Description of audio data to be recognized.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Speech-to-Text API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RecognitionMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Description of the content. Eg. "Recordings of federal supreme court hearings from 2012".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audioTopic;

  /**
   * The industry vertical to which this speech recognition request most closely applies. This is
   * most indicative of the topics contained in the audio.  Use the 6-digit NAICS code to identify
   * the industry vertical - see https://www.naics.com/search/.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long industryNaicsCodeOfAudio;

  /**
   * The use case most closely describing the audio content to be recognized.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String interactionType;

  /**
   * The audio type that most closely describes the audio being recognized.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String microphoneDistance;

  /**
   * Obfuscated (privacy-protected) ID of the user, to identify number of unique users using the
   * service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long obfuscatedId;

  /**
   * The original media the speech was recorded on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originalMediaType;

  /**
   * Mime type of the original audio file.  For example `audio/m4a`, `audio/x-alaw-basic`,
   * `audio/mp3`, `audio/3gpp`. A list of possible audio mime types is maintained at
   * http://www.iana.org/assignments/media-types/media-types.xhtml#audio
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originalMimeType;

  /**
   * The device used to make the recording.  Examples 'Nexus 5X' or 'Polycom SoundStation IP 6000'
   * or 'POTS' or 'VoIP' or 'Cardioid Microphone'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recordingDeviceName;

  /**
   * The type of device the speech was recorded with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recordingDeviceType;

  /**
   * Description of the content. Eg. "Recordings of federal supreme court hearings from 2012".
   * @return value or {@code null} for none
   */
  public java.lang.String getAudioTopic() {
    return audioTopic;
  }

  /**
   * Description of the content. Eg. "Recordings of federal supreme court hearings from 2012".
   * @param audioTopic audioTopic or {@code null} for none
   */
  public RecognitionMetadata setAudioTopic(java.lang.String audioTopic) {
    this.audioTopic = audioTopic;
    return this;
  }

  /**
   * The industry vertical to which this speech recognition request most closely applies. This is
   * most indicative of the topics contained in the audio.  Use the 6-digit NAICS code to identify
   * the industry vertical - see https://www.naics.com/search/.
   * @return value or {@code null} for none
   */
  public java.lang.Long getIndustryNaicsCodeOfAudio() {
    return industryNaicsCodeOfAudio;
  }

  /**
   * The industry vertical to which this speech recognition request most closely applies. This is
   * most indicative of the topics contained in the audio.  Use the 6-digit NAICS code to identify
   * the industry vertical - see https://www.naics.com/search/.
   * @param industryNaicsCodeOfAudio industryNaicsCodeOfAudio or {@code null} for none
   */
  public RecognitionMetadata setIndustryNaicsCodeOfAudio(java.lang.Long industryNaicsCodeOfAudio) {
    this.industryNaicsCodeOfAudio = industryNaicsCodeOfAudio;
    return this;
  }

  /**
   * The use case most closely describing the audio content to be recognized.
   * @return value or {@code null} for none
   */
  public java.lang.String getInteractionType() {
    return interactionType;
  }

  /**
   * The use case most closely describing the audio content to be recognized.
   * @param interactionType interactionType or {@code null} for none
   */
  public RecognitionMetadata setInteractionType(java.lang.String interactionType) {
    this.interactionType = interactionType;
    return this;
  }

  /**
   * The audio type that most closely describes the audio being recognized.
   * @return value or {@code null} for none
   */
  public java.lang.String getMicrophoneDistance() {
    return microphoneDistance;
  }

  /**
   * The audio type that most closely describes the audio being recognized.
   * @param microphoneDistance microphoneDistance or {@code null} for none
   */
  public RecognitionMetadata setMicrophoneDistance(java.lang.String microphoneDistance) {
    this.microphoneDistance = microphoneDistance;
    return this;
  }

  /**
   * Obfuscated (privacy-protected) ID of the user, to identify number of unique users using the
   * service.
   * @return value or {@code null} for none
   */
  public java.lang.Long getObfuscatedId() {
    return obfuscatedId;
  }

  /**
   * Obfuscated (privacy-protected) ID of the user, to identify number of unique users using the
   * service.
   * @param obfuscatedId obfuscatedId or {@code null} for none
   */
  public RecognitionMetadata setObfuscatedId(java.lang.Long obfuscatedId) {
    this.obfuscatedId = obfuscatedId;
    return this;
  }

  /**
   * The original media the speech was recorded on.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginalMediaType() {
    return originalMediaType;
  }

  /**
   * The original media the speech was recorded on.
   * @param originalMediaType originalMediaType or {@code null} for none
   */
  public RecognitionMetadata setOriginalMediaType(java.lang.String originalMediaType) {
    this.originalMediaType = originalMediaType;
    return this;
  }

  /**
   * Mime type of the original audio file.  For example `audio/m4a`, `audio/x-alaw-basic`,
   * `audio/mp3`, `audio/3gpp`. A list of possible audio mime types is maintained at
   * http://www.iana.org/assignments/media-types/media-types.xhtml#audio
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginalMimeType() {
    return originalMimeType;
  }

  /**
   * Mime type of the original audio file.  For example `audio/m4a`, `audio/x-alaw-basic`,
   * `audio/mp3`, `audio/3gpp`. A list of possible audio mime types is maintained at
   * http://www.iana.org/assignments/media-types/media-types.xhtml#audio
   * @param originalMimeType originalMimeType or {@code null} for none
   */
  public RecognitionMetadata setOriginalMimeType(java.lang.String originalMimeType) {
    this.originalMimeType = originalMimeType;
    return this;
  }

  /**
   * The device used to make the recording.  Examples 'Nexus 5X' or 'Polycom SoundStation IP 6000'
   * or 'POTS' or 'VoIP' or 'Cardioid Microphone'.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecordingDeviceName() {
    return recordingDeviceName;
  }

  /**
   * The device used to make the recording.  Examples 'Nexus 5X' or 'Polycom SoundStation IP 6000'
   * or 'POTS' or 'VoIP' or 'Cardioid Microphone'.
   * @param recordingDeviceName recordingDeviceName or {@code null} for none
   */
  public RecognitionMetadata setRecordingDeviceName(java.lang.String recordingDeviceName) {
    this.recordingDeviceName = recordingDeviceName;
    return this;
  }

  /**
   * The type of device the speech was recorded with.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecordingDeviceType() {
    return recordingDeviceType;
  }

  /**
   * The type of device the speech was recorded with.
   * @param recordingDeviceType recordingDeviceType or {@code null} for none
   */
  public RecognitionMetadata setRecordingDeviceType(java.lang.String recordingDeviceType) {
    this.recordingDeviceType = recordingDeviceType;
    return this;
  }

  @Override
  public RecognitionMetadata set(String fieldName, Object value) {
    return (RecognitionMetadata) super.set(fieldName, value);
  }

  @Override
  public RecognitionMetadata clone() {
    return (RecognitionMetadata) super.clone();
  }

}
