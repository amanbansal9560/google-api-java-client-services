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
 * The only message returned to the client by the `LongRunningRecognize` method. It contains the
 * result as zero or more sequential `SpeechRecognitionResult` messages. It is included in the
 * `result.response` field of the `Operation` returned by the `GetOperation` call of the
 * `google::longrunning::Operations` service.
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
public final class LongRunningRecognizeResponse extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Sequential list of transcription results corresponding to sequential portions of
   * audio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SpeechRecognitionResult> results;

  /**
   * Output only. Sequential list of transcription results corresponding to sequential portions of
   * audio.
   * @return value or {@code null} for none
   */
  public java.util.List<SpeechRecognitionResult> getResults() {
    return results;
  }

  /**
   * Output only. Sequential list of transcription results corresponding to sequential portions of
   * audio.
   * @param results results or {@code null} for none
   */
  public LongRunningRecognizeResponse setResults(java.util.List<SpeechRecognitionResult> results) {
    this.results = results;
    return this;
  }

  @Override
  public LongRunningRecognizeResponse set(String fieldName, Object value) {
    return (LongRunningRecognizeResponse) super.set(fieldName, value);
  }

  @Override
  public LongRunningRecognizeResponse clone() {
    return (LongRunningRecognizeResponse) super.clone();
  }

}
