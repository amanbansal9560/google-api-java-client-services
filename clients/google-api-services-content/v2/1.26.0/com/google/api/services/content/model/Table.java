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

package com.google.api.services.content.model;

/**
 * Model definition for Table.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Table extends com.google.api.client.json.GenericJson {

  /**
   * Headers of the table's columns. Optional: if not set then the table has only one dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Headers columnHeaders;

  /**
   * Name of the table. Required for subtables, ignored for the main table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Headers of the table's rows. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Headers rowHeaders;

  /**
   * The list of rows that constitute the table. Must have the same length as rowHeaders. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Row> rows;

  static {
    // hack to force ProGuard to consider Row used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Row.class);
  }

  /**
   * Headers of the table's columns. Optional: if not set then the table has only one dimension.
   * @return value or {@code null} for none
   */
  public Headers getColumnHeaders() {
    return columnHeaders;
  }

  /**
   * Headers of the table's columns. Optional: if not set then the table has only one dimension.
   * @param columnHeaders columnHeaders or {@code null} for none
   */
  public Table setColumnHeaders(Headers columnHeaders) {
    this.columnHeaders = columnHeaders;
    return this;
  }

  /**
   * Name of the table. Required for subtables, ignored for the main table.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the table. Required for subtables, ignored for the main table.
   * @param name name or {@code null} for none
   */
  public Table setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Headers of the table's rows. Required.
   * @return value or {@code null} for none
   */
  public Headers getRowHeaders() {
    return rowHeaders;
  }

  /**
   * Headers of the table's rows. Required.
   * @param rowHeaders rowHeaders or {@code null} for none
   */
  public Table setRowHeaders(Headers rowHeaders) {
    this.rowHeaders = rowHeaders;
    return this;
  }

  /**
   * The list of rows that constitute the table. Must have the same length as rowHeaders. Required.
   * @return value or {@code null} for none
   */
  public java.util.List<Row> getRows() {
    return rows;
  }

  /**
   * The list of rows that constitute the table. Must have the same length as rowHeaders. Required.
   * @param rows rows or {@code null} for none
   */
  public Table setRows(java.util.List<Row> rows) {
    this.rows = rows;
    return this;
  }

  @Override
  public Table set(String fieldName, Object value) {
    return (Table) super.set(fieldName, value);
  }

  @Override
  public Table clone() {
    return (Table) super.clone();
  }

}