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

package com.google.api.services.driveactivity.v2.model;

/**
 * A strategy which consolidates activities using the grouping rules from the legacy V1 Activity
 * API. Similar actions occurring within a window of time can be grouped across multiple targets
 * (such as moving a set of files at once) or multiple actors (such as several users editing the
 * same item). Grouping rules for this strategy are specific to each type of action.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Activity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Legacy extends com.google.api.client.json.GenericJson {

  @Override
  public Legacy set(String fieldName, Object value) {
    return (Legacy) super.set(fieldName, value);
  }

  @Override
  public Legacy clone() {
    return (Legacy) super.clone();
  }

}