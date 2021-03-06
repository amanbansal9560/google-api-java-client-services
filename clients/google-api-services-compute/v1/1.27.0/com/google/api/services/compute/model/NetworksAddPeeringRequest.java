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

package com.google.api.services.compute.model;

/**
 * Model definition for NetworksAddPeeringRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworksAddPeeringRequest extends com.google.api.client.json.GenericJson {

  /**
   * This field will be deprecated soon. Use exchange_subnet_routes in network_peering instead.
   * Whether Google Compute Engine manages the routes automatically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoCreateRoutes;

  /**
   * Name of the peering, which should conform to RFC1035.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Network peering parameters. In order to specify route policies for peering using import and
   * export custom routes, you must specify all peering related parameters (name, peer network,
   * exchange_subnet_routes) in the network_peering field. The corresponding fields in
   * NetworksAddPeeringRequest will be deprecated soon.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NetworkPeering networkPeering;

  /**
   * URL of the peer network. It can be either full URL or partial URL. The peer network may belong
   * to a different project. If the partial URL does not contain project, it is assumed that the
   * peer network is in the same project as the current network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String peerNetwork;

  /**
   * This field will be deprecated soon. Use exchange_subnet_routes in network_peering instead.
   * Whether Google Compute Engine manages the routes automatically.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoCreateRoutes() {
    return autoCreateRoutes;
  }

  /**
   * This field will be deprecated soon. Use exchange_subnet_routes in network_peering instead.
   * Whether Google Compute Engine manages the routes automatically.
   * @param autoCreateRoutes autoCreateRoutes or {@code null} for none
   */
  public NetworksAddPeeringRequest setAutoCreateRoutes(java.lang.Boolean autoCreateRoutes) {
    this.autoCreateRoutes = autoCreateRoutes;
    return this;
  }

  /**
   * Name of the peering, which should conform to RFC1035.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the peering, which should conform to RFC1035.
   * @param name name or {@code null} for none
   */
  public NetworksAddPeeringRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Network peering parameters. In order to specify route policies for peering using import and
   * export custom routes, you must specify all peering related parameters (name, peer network,
   * exchange_subnet_routes) in the network_peering field. The corresponding fields in
   * NetworksAddPeeringRequest will be deprecated soon.
   * @return value or {@code null} for none
   */
  public NetworkPeering getNetworkPeering() {
    return networkPeering;
  }

  /**
   * Network peering parameters. In order to specify route policies for peering using import and
   * export custom routes, you must specify all peering related parameters (name, peer network,
   * exchange_subnet_routes) in the network_peering field. The corresponding fields in
   * NetworksAddPeeringRequest will be deprecated soon.
   * @param networkPeering networkPeering or {@code null} for none
   */
  public NetworksAddPeeringRequest setNetworkPeering(NetworkPeering networkPeering) {
    this.networkPeering = networkPeering;
    return this;
  }

  /**
   * URL of the peer network. It can be either full URL or partial URL. The peer network may belong
   * to a different project. If the partial URL does not contain project, it is assumed that the
   * peer network is in the same project as the current network.
   * @return value or {@code null} for none
   */
  public java.lang.String getPeerNetwork() {
    return peerNetwork;
  }

  /**
   * URL of the peer network. It can be either full URL or partial URL. The peer network may belong
   * to a different project. If the partial URL does not contain project, it is assumed that the
   * peer network is in the same project as the current network.
   * @param peerNetwork peerNetwork or {@code null} for none
   */
  public NetworksAddPeeringRequest setPeerNetwork(java.lang.String peerNetwork) {
    this.peerNetwork = peerNetwork;
    return this;
  }

  @Override
  public NetworksAddPeeringRequest set(String fieldName, Object value) {
    return (NetworksAddPeeringRequest) super.set(fieldName, value);
  }

  @Override
  public NetworksAddPeeringRequest clone() {
    return (NetworksAddPeeringRequest) super.clone();
  }

}
